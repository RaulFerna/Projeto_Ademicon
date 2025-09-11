package com.Projeto.Ademicon.repository;

import com.Projeto.Ademicon.model.Address.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CidadeRepository extends JpaRepository<Cidade, UUID> {
}
