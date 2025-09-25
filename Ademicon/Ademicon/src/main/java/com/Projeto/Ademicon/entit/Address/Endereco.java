package com.Projeto.Ademicon.entit.Address;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "endereco")
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue
    private Integer id_endereco;
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

    @ManyToOne
    @JoinColumn(name =" id_estado")
    private Estado estado;


}
