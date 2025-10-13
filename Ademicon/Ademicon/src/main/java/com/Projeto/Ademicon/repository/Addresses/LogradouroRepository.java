package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.Logradouro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LogradouroRepository extends JpaRepository<Logradouro, UUID> {
}
