CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS cliente(
    id_cliente SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(14) NOT NULL,
    nome_responsavel VARCHAR(50),
    email VARCHAR(50),
    id_endereco INTEGER,
    FOREIGN KEY (id_endereco) REFERENCES endereco(id_endereco)
);
