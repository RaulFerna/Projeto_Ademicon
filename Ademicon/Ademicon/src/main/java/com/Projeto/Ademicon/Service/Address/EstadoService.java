package com.Projeto.Ademicon.Service.Address;

import com.Projeto.Ademicon.entit.Address.Estado;
import com.Projeto.Ademicon.repository.Addresses.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public Estado createEstado(String nomeEstado) {
        return estadoRepository.findByNome(nomeEstado)
                .orElseGet(() -> {
                    Estado estado = new Estado();
                    estado.setNome(nomeEstado);
                    return estadoRepository.save(estado);
                });
    }
}
