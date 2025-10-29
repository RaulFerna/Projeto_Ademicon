package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.TipoLogradouro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipoLogradouroRepository extends JpaRepository<TipoLogradouro, Integer> {
    Optional<TipoLogradouro> findByTipo(String tipo);
}
