package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.entit.Address.*;
import com.Projeto.Ademicon.repository.Addresses.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogradouroService {

    @Autowired
    private LogradouroRepository logradouroRepository;
    @Autowired
    private CidadeService cidadeService;
    @Autowired
    private BairroService bairroService;
    @Autowired
    private TipoLograService tipoService;

    public Logradouro createLogra (String nome, String tipoLogra, String nomeBairro, String nomeCidade, String nomeEstado){
        Bairro bairro = bairroService.createBairro(nomeBairro, nomeCidade, nomeEstado);
        Cidade cidade = bairro.getCidade();
        TipoLogradouro tipo = tipoService.createTipo(tipoLogra);
        return logradouroRepository.findByNomeAndTipoAndBairroAndCidade(nome, tipo, bairro, cidade).orElseGet(() -> {
            Logradouro e = new Logradouro();
            e.setNome(nome);
            e.setTipo(tipo);
            e.setBairro(bairro);
            e.setCidade(cidade);

            return logradouroRepository.save(e);
        });
    }
}
