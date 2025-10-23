package com.Projeto.Ademicon.DTO.Client;

import com.Projeto.Ademicon.DTO.Address.EnderecoRequestDTO;

public record ClientRequestDTO(
        Integer id,
        String nome,
        String telefone,
        String nomeResponsavel,
        String email,
        EnderecoRequestDTO endereco
) {}
