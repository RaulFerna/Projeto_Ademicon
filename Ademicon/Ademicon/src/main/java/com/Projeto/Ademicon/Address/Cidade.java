package com.Projeto.Ademicon.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @JoinColumn(name = "id_logadouro")
    private Logadouro logadouro;

}
