CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE cliente(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(13) NOT NULL,
    nome_responsavel VARCHAR(50),
    email VARCHAR(50),
    id_endereco UUID,
    FOREIGN KEY (id_endereco) REFERENCES endereco(id)
);
