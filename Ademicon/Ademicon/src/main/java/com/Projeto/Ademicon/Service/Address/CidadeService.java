package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.entit.Address.Cidade;
import com.Projeto.Ademicon.entit.Address.Estado;
import com.Projeto.Ademicon.repository.Addresses.CidadeRepository;
import com.Projeto.Ademicon.repository.Addresses.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoService estadoService;

    public Cidade createCidade(String nome, String estado){
        Estado estado1 = estadoService.createEstado(estado);

        return cidadeRepository.findByNomeAndEstado(nome, estado1).orElseGet(() ->{
            Cidade cidade = new Cidade();
            cidade.setNome(nome);
            cidade.setEstado(estado1);
            return cidadeRepository.save(cidade);
        });

    }
}
