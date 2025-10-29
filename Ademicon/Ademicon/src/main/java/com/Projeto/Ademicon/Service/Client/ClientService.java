package com.Projeto.Ademicon.Service.Client;

import com.Projeto.Ademicon.DTO.Client.ClientRequestDTO;
import com.Projeto.Ademicon.Service.Address.EnderecoService;
import com.Projeto.Ademicon.entit.Address.Endereco;
import com.Projeto.Ademicon.entit.client.Cliente;
import com.Projeto.Ademicon.repository.Client.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired //Fazemos um autowired para poder salvar as requisições no banco
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoService enderecoService;

    public ClientService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente createCLient(ClientRequestDTO data){
        Optional<Cliente> existente = clienteRepository.findByNomeAndEmail(data.nome(), data.email());

        if(existente.isPresent()){
            throw new IllegalArgumentException("Cliente já cadastrado");
        }

      Cliente newClient = new Cliente();
      newClient.setNome(data.nome());
      newClient.setEmail(data.email());
      newClient.setTelefone(data.telefone());
      newClient.setNomeResponsavel(data.nomeResponsavel());

      Endereco endereco = enderecoService.createEndereco(data.endereco());
      newClient.setEndereco(List.of(endereco));

      return clienteRepository.save(newClient);
    }
}
