package com.Projeto.Ademicon.entit.proposal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Table(name ="proposta")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proposta {
    @Id
    @GeneratedValue
    private Integer id_proposta;
    private LocalDateTime data_visita;
    private Date retorno_previsto;
    private String categoria_proposta;
    private Integer valor_proposta;
    private String campo_observacao;

    @OneToMany
    private List<Status> status_proposta;

}
