package com.Projeto.Ademicon.repository;

import com.Projeto.Ademicon.model.Address.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
}
