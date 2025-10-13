package com.Projeto.Ademicon.Service.Client;

import com.Projeto.Ademicon.DTO.Client.ClientRequestDTO;
import com.Projeto.Ademicon.entit.client.Cliente;
import com.Projeto.Ademicon.repository.Client.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired //Fazemos um autowired para poder salvar as requisições no banco
    private ClienteRepository clienteRepository;

    public ClientService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente createCLient(ClientRequestDTO data){
      Cliente newClient = new Cliente();
      newClient.setNome(data.nome());
      //newClient.setEndereco(data.endereco());
      newClient.setEmail(data.email());
      newClient.setTelefone(data.telefone());
      newClient.setNomeResponsavel(data.nomeResponsavel());

      clienteRepository.save(newClient);
      return newClient;
    }
}
