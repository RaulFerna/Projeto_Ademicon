package com.Projeto.Ademicon.DTO;

import com.Projeto.Ademicon.model.Address.Endereco;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public record ClientRequestDTO(
        UUID id,
        String nome,
        String telefone,
        String nomeResponsavel,
        String email,
        Date data_retorno,
        List<Endereco> endereco
) {}
