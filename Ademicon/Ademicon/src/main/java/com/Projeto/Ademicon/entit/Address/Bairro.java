package com.Projeto.Ademicon.entit.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "bairro")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Bairro {
    @Id
    @GeneratedValue
    private Integer id_bairro;
    private String nome;

    @OneToMany
    private List<Logradouro> logradouro;

}
