
CREATE TABLE IF NOT EXISTS Livros
(
    id            INT PRIMARY KEY,
    titulo        VARCHAR(255),
    autor         VARCHAR(255),
    anoPublicacao VARCHAR(20)
);


CREATE TABLE IF NOT EXISTS Membros
(
    id       INT PRIMARY KEY,
    nome     VARCHAR(255),
    endereco VARCHAR(255),
    telefone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Emprestimos
(
    id             INT PRIMARY KEY,
    livros_id       INT,
    membros_id      INT,
    dataEmprestimo DATE,
    dataDevolucao  DATE,
    FOREIGN KEY (livros_id) REFERENCES Livros (id),
    FOREIGN KEY (membros_id) REFERENCES Membros (id)
);


CREATE TABLE IF NOT EXISTS Bibliotecarios
(
    id    INT PRIMARY KEY,
    nome  VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255)
);


CREATE TABLE IF NOT EXISTS Visitantes
(
    id       INT PRIMARY KEY,
    nome     VARCHAR(255),
    telefone VARCHAR(20)
);