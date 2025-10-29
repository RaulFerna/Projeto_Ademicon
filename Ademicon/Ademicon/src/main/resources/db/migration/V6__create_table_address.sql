CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS endereco(
    id_endereco SERIAL PRIMARY KEY,
    numero VARCHAR(10) NOT NULL, -- Geralmente números de casas/apartamentos podem ter letras ou apenas números.
    cep VARCHAR(8) NOT NULL,
    id_logradouro INTEGER,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id_logradouro)
);
