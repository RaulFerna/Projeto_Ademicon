package com.Projeto.Ademicon.Service.Propostal;

import com.Projeto.Ademicon.DTO.Propostal.PropostalRequestDTO;
import com.Projeto.Ademicon.entit.proposal.Proposta;
import com.Projeto.Ademicon.repository.Propostal.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PropostalService {
    @Autowired
    private PropostaRepository repository;

    public PropostalService(PropostaRepository repository){
        this.repository = repository;
    }

    public Proposta createPropostal(PropostalRequestDTO data){
        Proposta newProposta = new Proposta();
        newProposta.setData_visita(LocalDateTime.now());
        newProposta.setRetorno_previsto(data.retorno());
        newProposta.setCategoria_proposta(data.categoria());
        newProposta.setValor(data.valor());
        newProposta.setCampo_observacao(data.observacao());

        repository.save(newProposta);
        return newProposta;
    }
}
