package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.entit.Address.Bairro;
import com.Projeto.Ademicon.entit.Address.Cidade;
import com.Projeto.Ademicon.entit.Address.Estado;
import com.Projeto.Ademicon.entit.Address.Logradouro;
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

    public Logradouro createLogra (String nome, String tipo, String nomeBairro, String nomeCidade, String nomeEstado){
        Bairro bairro = bairroService.createBairro(nomeBairro, nomeCidade, nomeEstado);
        Cidade cidade = bairro.getCidade();

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
