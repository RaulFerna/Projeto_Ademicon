package com.Projeto.Ademicon.Controller.Client;

import com.Projeto.Ademicon.DTO.Client.ClientRequestDTO;
import com.Projeto.Ademicon.Service.Client.ClientService;
import com.Projeto.Ademicon.entit.client.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ademicon/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    ResponseEntity<?> create(@RequestBody ClientRequestDTO body){
        try {
            Cliente newClient = this.clientService.createCLient(body);
            return ResponseEntity.ok(newClient);
        }catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
