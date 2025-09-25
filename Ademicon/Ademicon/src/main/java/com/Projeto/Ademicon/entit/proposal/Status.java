package com.Projeto.Ademicon.entit.proposal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="status_proposta")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @Id
    @GeneratedValue
    private Integer id_satus;
    private String tipo_status;

}
