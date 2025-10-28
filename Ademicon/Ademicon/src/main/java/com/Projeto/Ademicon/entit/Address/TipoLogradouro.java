package com.Projeto.Ademicon.entit.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipo_logradouro")
public class TipoLogradouro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_logradouro;

    @Column(nullable = false, unique = true, length = 50) //Passa anotação para o hybernate que a coluna tipo de logradouro será unico, não nulo.
    private String tipo;
}
