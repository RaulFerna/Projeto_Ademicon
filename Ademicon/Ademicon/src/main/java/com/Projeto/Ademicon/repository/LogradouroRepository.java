package com.Projeto.Ademicon.repository;

import com.Projeto.Ademicon.model.Address.Logadouro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LogradouroRepository extends JpaRepository<Logadouro, UUID> {
}
