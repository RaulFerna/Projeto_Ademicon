CREATE TABLE IF NOT EXISTS tipo_logradouro (
    id_tipo_logradouro SERIAL PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL UNIQUE
);
