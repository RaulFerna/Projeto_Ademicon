CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS cidade(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR (50) NOT NULL,
    estado VARCHAR (15) NOT NULL,
    id_logradouro UUID,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id)
);
