package com.Projeto.Ademicon.Service;

import com.Projeto.Ademicon.DTO.ClientRequestDTO;
import com.Projeto.Ademicon.entit.client.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public Cliente createCLient(ClientRequestDTO data){
      Cliente newClient = new Cliente();
      newClient.setNome(data.nome());
      newClient.setEndereco(data.endereco());
      newClient.setEmail(data.email());
      newClient.setTelefone(data.telefone());
      newClient.setNomeResponsavel(data.nomeResponsavel());

      return newClient;
    }
}
