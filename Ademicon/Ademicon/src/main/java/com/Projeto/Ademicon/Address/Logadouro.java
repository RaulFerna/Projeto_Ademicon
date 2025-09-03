package com.Projeto.Ademicon.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "logadouro")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Logadouro {
    @Id
    @GeneratedValue
    private UUID id_logadouro;
    private String nome;
    private String tipo;

    @OneToMany
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
}
