package com.Projeto.Ademicon.Controller.Propostal;

import com.Projeto.Ademicon.DTO.Propostal.PropostalRequestDTO;
import com.Projeto.Ademicon.Service.Propostal.PropostalService;
import com.Projeto.Ademicon.entit.proposal.Proposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ademicon/proposal")
public class PropostalController {

    @Autowired
    private PropostalService propostalService;

    @PostMapping
    ResponseEntity<Proposta> create(@RequestBody PropostalRequestDTO body){
        Proposta newPropostal = this.propostalService.createPropostal(body);
        return ResponseEntity.ok(newPropostal);
    }
}
