package com.Projeto.Ademicon.entit.Address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name ="estado")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estado;
    private String nome;

    @OneToMany(mappedBy = "estado") //mappedBy evita que o JPA crie tabelas intermediárias desnecessárias
    private List<Cidade> cidade;
}
