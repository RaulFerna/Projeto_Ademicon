package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.Bairro;
import com.Projeto.Ademicon.entit.Address.Cidade;
import com.Projeto.Ademicon.entit.Address.Logradouro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LogradouroRepository extends JpaRepository<Logradouro, Integer> {
    Optional<Logradouro> findByNomeAndTipoAndBairroAndCidade(String nome, String tipo, Bairro bairro, Cidade cidade);
}
