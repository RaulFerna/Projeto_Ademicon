package com.Projeto.Ademicon.DTO.Client;

public record ClientRequestDTO(
        Integer id,
        String nome,
        String telefone,
        String nomeResponsavel,
        String email
        //List<Endereco> endereco
) {}
