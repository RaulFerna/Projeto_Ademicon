CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE logradouro(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR (100) NOT NULL,
    tipo VARCHAR (10) NOT NULL
);