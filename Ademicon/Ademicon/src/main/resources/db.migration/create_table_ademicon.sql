CREATE TABLE cliente(
    id UUID  get_random_uuid() PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(13) NOT NULL,
    nome_responsavel VARCHAR(50),
    email VARCHAR(50)
);
