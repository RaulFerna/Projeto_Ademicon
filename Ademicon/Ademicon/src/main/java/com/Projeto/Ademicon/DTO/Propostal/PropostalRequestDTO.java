package com.Projeto.Ademicon.DTO.Propostal;

import java.time.LocalDateTime;
import java.util.Date;

public record PropostalRequestDTO(
        Integer id,
        Date retorno,
        String categoria,
        Double valor,
        String observacao
){}
