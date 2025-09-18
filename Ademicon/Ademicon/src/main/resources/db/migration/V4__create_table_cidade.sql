CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS cidade(
    id_cidade SERIAL PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    id_logradouro INTEGER,
    id_estado INTEGER,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id_logradouro),
    FOREIGN KEY (id_estado) REFERENCES estado(id_estado),
    CONSTRAINT cidade_nome UNIQUE (nome)
);
