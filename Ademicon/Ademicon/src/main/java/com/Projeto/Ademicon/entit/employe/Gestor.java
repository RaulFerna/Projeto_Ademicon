package com.Projeto.Ademicon.entit.employe;

import com.Projeto.Ademicon.entit.proposal.Proposta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "gestor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gestor extends Funcionario{
    @OneToMany
    private List<Proposta> propostas;
    @OneToMany
    private List<Equipes>id_equipes;
}
