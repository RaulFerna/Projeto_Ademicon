package com.Projeto.Ademicon.model.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "bairro")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Bairro {
    @Id
    @GeneratedValue
    private UUID id_bairro;
    private String nome;

    @OneToMany
    private List<Logradouro> logradouro;

}
