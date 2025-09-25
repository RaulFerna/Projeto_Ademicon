CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS bairro(
    id_bairro SERIAL PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    id_logradouro INTEGER,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id_logradouro)
);