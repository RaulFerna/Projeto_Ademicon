package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.DTO.Address.EnderecoRequestDTO;
import com.Projeto.Ademicon.entit.Address.Endereco;
import com.Projeto.Ademicon.entit.Address.Logradouro;
import com.Projeto.Ademicon.repository.Addresses.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private LogradouroService logradouroService;

   public Endereco createEndereco(EnderecoRequestDTO endDTO){
       Logradouro logradouro = logradouroService.createLogra(
               endDTO.getLogradouro(),
               endDTO.getTipo(),
               endDTO.getBairro(),
               endDTO.getCidade(),
               endDTO.getEstado()
       );

       return enderecoRepository.findByLogradouroAndNumeroAndCep(logradouro, endDTO.getNumero(), endDTO.getCep()).orElseGet(() ->{
           Endereco e = new Endereco();
           e.setLogradouro(logradouro);
           e.setNumero(endDTO.getNumero());
           e.setCep(endDTO.getCep());
           return enderecoRepository.save(e);
       });
   }
}//Falta arrumar a service para poder receber o tipo de logradouro.
