package com.Projeto.Ademicon.entit.proposal;

import com.Projeto.Ademicon.entit.employe.Consultor;
import com.Projeto.Ademicon.entit.employe.Gestor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Table(name ="propostas")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proposta {
    @Id
    @GeneratedValue
    private Integer id_proposta;
    private LocalDateTime data_visita = LocalDateTime.now();
    private Date retorno_previsto;
    private String categoria_proposta;
    private Integer valor_proposta;
    private String campo_observacao;
    private Double valor;

    @OneToMany
    private List<Status> status_proposta;

    @ManyToOne
    @JoinColumn(name = "id_consultor")
    private Consultor id_consultor;

    @ManyToOne
    @JoinColumn(name = "id_gestor")
    private Gestor id_gestor;
}
