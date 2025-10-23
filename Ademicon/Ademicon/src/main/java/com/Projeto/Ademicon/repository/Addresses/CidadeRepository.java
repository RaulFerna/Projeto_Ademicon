package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.Cidade;
import com.Projeto.Ademicon.entit.Address.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
}
