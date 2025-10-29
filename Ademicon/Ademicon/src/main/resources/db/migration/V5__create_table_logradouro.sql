CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS logradouro(
    id_logradouro SERIAL PRIMARY KEY,
    nome VARCHAR (100) NOT NULL,
    id_tipo_logradouro INTEGER NOT NULL,
    id_bairro INTEGER NOT NULL,
    id_cidade INTEGER NOT NULL,
    FOREIGN KEY (id_bairro) REFERENCES bairro (id_bairro),
    FOREIGN KEY (id_cidade) REFERENCES cidade (id_cidade),
    FOREIGN KEY (id_tipo_logradouro) REFERENCES tipo_logradouro (id_tipo_logradouro),
    CONSTRAINT logra_nome_tipo_cidade UNIQUE (nome, id_tipo_logradouro, id_cidade) --Restrição que faz com que seja permitido o logradouro em uma unica cidade
);