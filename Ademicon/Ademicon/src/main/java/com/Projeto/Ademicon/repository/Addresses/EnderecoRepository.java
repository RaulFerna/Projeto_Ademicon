package com.Projeto.Ademicon.repository.Addresses;

import com.Projeto.Ademicon.entit.Address.Endereco;
import com.Projeto.Ademicon.entit.Address.Logradouro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    Optional<Endereco> findByLogradouroAndNumeroAndCep(Logradouro logradouro, String numero, String cep);
    //Faz verificação do endereço. Se ja existir esse endereço, não será criado outro.
}
