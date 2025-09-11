package com.Projeto.Ademicon.model.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "bairro")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Bairro {
    @Id
    @GeneratedValue
    private UUID id_bairro;
    private String nome;
}
