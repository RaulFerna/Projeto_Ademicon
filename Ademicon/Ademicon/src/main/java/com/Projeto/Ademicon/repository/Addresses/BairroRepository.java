package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BairroRepository extends JpaRepository<Bairro, UUID> {
}
