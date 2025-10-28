CREATE TABLE IF NOT EXISTS tipo_logradouro (
    id_tipo_logradouro SERIAL PRIMARY KEY,
    descricao VARCHAR(50) NOT NULL UNIQUE
);
