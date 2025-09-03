package com.Projeto.Ademicon.client;

import com.Projeto.Ademicon.Address.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name ="cliente")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String telefone;
    private String nomeResponsavel;
    private String email;

    @OneToMany
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

}
