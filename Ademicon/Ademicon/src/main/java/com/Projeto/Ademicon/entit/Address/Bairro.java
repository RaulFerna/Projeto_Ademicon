package com.Projeto.Ademicon.model.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
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
    private List<Endereco> endereco;
}
