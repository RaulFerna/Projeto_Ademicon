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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_bairro;
    private String nome;

    @OneToMany(mappedBy = "bairro")
    private List<Logradouro> logradouro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

}
