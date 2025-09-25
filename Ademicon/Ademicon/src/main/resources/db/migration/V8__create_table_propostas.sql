CREATE TABLE IF NOT EXISTS propostas(
    id_propostas SERIAL PRIMARY KEY,
    data_visita TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    retorno_previsto DATE NOT NULL DEFAULT CURRENT_DATE,
    categoria_proposta VARCHAR(50) NOT NULL,
    valor_proposta INTEGER,
    campo_observacao VARCHAR(500),
    id_status INTEGER NOT NULL,
    FOREIGN KEY(id_status) REFERENCES status(id_status)
);