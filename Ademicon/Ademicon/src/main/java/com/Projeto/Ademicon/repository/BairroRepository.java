package com.Projeto.Ademicon.repository;

import com.Projeto.Ademicon.model.Address.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BairroRepository extends JpaRepository<Bairro, UUID> {
}
