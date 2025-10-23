package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.entit.Address.Bairro;
import com.Projeto.Ademicon.entit.Address.Cidade;
import com.Projeto.Ademicon.repository.Addresses.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    @Autowired
    private CidadeService cidadeService;

    public Bairro createBairro(String nome, String cidadeNome, String nomeEstado){
        Cidade cidade = cidadeService.createCidade(cidadeNome, nomeEstado);

        return bairroRepository.findByNomeAndCidade(nome, cidade).orElseGet(()->{
            Bairro bairro = new Bairro();
            bairro.setNome(nome);
            bairro.setCidade(cidade);
            return bairroRepository.save(bairro);
        });
    }
}
