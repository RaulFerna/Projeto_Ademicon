package com.Projeto.Ademicon.entit.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "cidade")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cidade;
    private String nome;


    @OneToMany(mappedBy = "cidade")
    private List<Logradouro> logradouro;

    @ManyToOne
    @JoinColumn(name ="id_estado")
    private Estado estado;

}
