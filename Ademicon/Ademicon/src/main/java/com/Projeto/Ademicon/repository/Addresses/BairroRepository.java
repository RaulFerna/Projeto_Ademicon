package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.Bairro;
import com.Projeto.Ademicon.entit.Address.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BairroRepository extends JpaRepository<Bairro, Integer> {
    Optional<Bairro> findByNomeAndCidade(String nome, Cidade cidade);
}

