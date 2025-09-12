CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS bairro(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    id_logradouro UUID,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id)
);