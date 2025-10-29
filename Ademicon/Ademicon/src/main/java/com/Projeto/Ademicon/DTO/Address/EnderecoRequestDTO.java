package com.Projeto.Ademicon.DTO.Address;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnderecoRequestDTO {
    private String estado;
    private String tipo;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String cep;
}
