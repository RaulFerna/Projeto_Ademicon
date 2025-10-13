CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS bairro(
    id_bairro SERIAL PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    id_cidade INTEGER NOT NULL,
    FOREIGN KEY (id_cidade) REFERENCES cidade (id_cidade),
    CONSTRAINT nome_cidade_bairro UNIQUE(nome, id_cidade)
);