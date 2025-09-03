package com.Projeto.Ademicon.Address;

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

    @OneToOne
    @JoinColumn(name = "id_logadouro")
    private Logadouro logadouro;

}
