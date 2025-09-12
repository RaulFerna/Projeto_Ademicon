package com.Projeto.Ademicon.model.Address;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "endereco")
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue
    private UUID id;
    private String numero;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_logradouro")
    private Logradouro logradouro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name =" id_bairro")
    private Bairro bairro;


}
