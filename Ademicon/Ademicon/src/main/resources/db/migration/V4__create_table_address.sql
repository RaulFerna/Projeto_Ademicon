CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS endereco(

    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    numero VARCHAR(10) NOT NULL, -- Geralmente números de casas/apartamentos podem ter letras (ex: 10A) ou apenas números. Se for estritamente numérico, use INTEGER, mas a conversão para VARCHAR é mais flexível.
    cep VARCHAR(8) NOT NULL,
    id_logradouro UUID,
    id_cidade UUID,
    id_bairro UUID,
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id),
    FOREIGN KEY (id_cidade) REFERENCES cidade(id),
    FOREIGN KEY (id_logradouro) REFERENCES logradouro(id)
);

