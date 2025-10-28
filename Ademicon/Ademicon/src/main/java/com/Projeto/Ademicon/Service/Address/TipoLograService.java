package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.entit.Address.TipoLogradouro;
import com.Projeto.Ademicon.repository.Addresses.TipoLogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoLograService {
    @Autowired
    private TipoLogradouroRepository tipoLograRepository;

    public TipoLogradouro createTipo(String tipo){
        return tipoLograRepository.findByTipo(tipo).orElseGet(() ->{
            TipoLogradouro tipoLogra = new TipoLogradouro();
            tipoLogra.setTipo(tipo);
            return tipoLograRepository.save(tipoLogra);
        });
    }
}
