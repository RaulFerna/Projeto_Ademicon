CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS endereco(
    id_endereco SERIAL PRIMARY KEY,
    numero VARCHAR(10) NOT NULL, -- Geralmente números de casas/apartamentos podem ter letras (ex: 10A) ou apenas números. Se for estritamente numérico, use INTEGER, mas a conversão para VARCHAR é mais flexível.
    cep VARCHAR(8) NOT NULL,
    id_logradouro INTEGER,
    id_cidade INTEGER,
    id_bairro INTEGER,
    id_estado INTEGER,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id_logradouro),
    FOREIGN KEY (id_cidade) REFERENCES cidade(id_cidade),
    FOREIGN KEY (id_bairro) REFERENCES bairro(id_bairro),
    FOREIGN KEY (id_estado) REFERENCES estado(id_estado)
);
