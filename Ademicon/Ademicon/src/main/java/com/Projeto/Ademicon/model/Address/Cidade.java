package com.Projeto.Ademicon.model.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "cidade")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cidade {
    @Id
    @GeneratedValue
    private UUID id_cidade;
    private String nome;
    private String estado;

    @OneToMany
    private List<Logradouro> logradouro;

}
