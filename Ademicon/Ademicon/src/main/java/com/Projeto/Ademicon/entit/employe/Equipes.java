package com.Projeto.Ademicon.entit.employe;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Equipes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipes {
    @GeneratedValue
    @Id
    private Integer id_equipe;
    @OneToMany
    private List<Consultor> id_consultor;

}
