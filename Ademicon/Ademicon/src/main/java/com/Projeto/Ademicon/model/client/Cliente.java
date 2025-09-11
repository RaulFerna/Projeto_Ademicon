package com.Projeto.Ademicon.model.client;

import com.Projeto.Ademicon.model.Address.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
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
    private List<Endereco> endereco;  //tem que ser list porque um cliente pode ter varios endereços

}
