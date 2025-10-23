CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS logradouro(
    id_logradouro SERIAL PRIMARY KEY,
    nome VARCHAR (100) NOT NULL,
    tipo VARCHAR (10) NOT NULL,
    id_bairro INTEGER NOT NULL,
    id_cidade INTEGER NOT NULL,
    FOREIGN KEY (id_bairro) REFERENCES bairro (id_bairro),
    FOREIGN KEY (id_cidade) REFERENCES cidade (id_cidade),
    CONSTRAINT logra_nome_bairro UNIQUE(nome,tipo, id_cidade) --Restrição que faz com que seja permitido o logradouro em uma unica cidade
);