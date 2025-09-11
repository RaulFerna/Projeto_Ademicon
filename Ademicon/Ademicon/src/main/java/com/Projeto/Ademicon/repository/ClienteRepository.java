package com.Projeto.Ademicon.repository;

import com.Projeto.Ademicon.model.client.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
