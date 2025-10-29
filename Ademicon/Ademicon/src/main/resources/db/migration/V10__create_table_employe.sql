CREATE TABLE IF NOT EXISTS funcionario (
    id_funcionario SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    matricula INTEGER,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS  gestor (
    id_gestor INTEGER PRIMARY KEY REFERENCES funcionario(id_funcionario)
);

CREATE TABLE IF NOT EXISTS  consultor (
    id INTEGER PRIMARY KEY REFERENCES funcionario(id_funcionario),
    id_gestor INTEGER REFERENCES gestor(id_gestor)
);