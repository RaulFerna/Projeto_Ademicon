package com.Projeto.Ademicon.entit.client;

import com.Projeto.Ademicon.entit.Address.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Table(name ="cliente")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Faz com que o hibernate deixe o banco gerar, não tenta buscar uma sequencia manualmente
    private Integer id_cliente;
    private String nome;
    private String telefone;
    private String nomeResponsavel;
    private String email;

    @OneToMany
    @JoinColumn(name = "id_endereco")
    private List<Endereco> endereco;  //tem que ser list porque um cliente pode ter varios endereços

}
