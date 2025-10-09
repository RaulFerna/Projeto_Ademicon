package com.Projeto.Ademicon.entit.employe;

import com.Projeto.Ademicon.entit.client.Cliente;
import com.Projeto.Ademicon.entit.proposal.Proposta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name ="consultor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Consultor extends Funcionario{

    @ManyToOne
    @JoinColumn(name = "gestor_id")
    private Gestor gestor;
    @OneToMany
    private List<Cliente> id_cliente;
    @OneToMany
    private List<Proposta> id_proposta;

}
