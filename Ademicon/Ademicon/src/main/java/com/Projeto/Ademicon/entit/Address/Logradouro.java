package com.Projeto.Ademicon.entit.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "logradouro")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Logradouro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_logradouro;
    private String nome;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "id_bairro") // Coluna na tabela 'logradouro' que referencia o bairro
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "id_cidade") // Coluna na tabela 'logradouro' que referencia a cidade
    private Cidade cidade;

    // O 'mappedBy' indica que o relacionamento é gerenciado pelo campo 'logradouro' na entidade Endereco.
    @OneToMany(mappedBy = "logradouro")
    private List<Endereco> enderecos;
}
