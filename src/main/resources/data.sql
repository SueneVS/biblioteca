INSERT INTO Livros (id, titulo, autor, anoPublicacao)
VALUES (1, 'Código Limpo', 'Robert Martin','2009');



INSERT INTO Membros (id, nome, endereco, telefone)
VALUES (1, 'Maria', 'Rua Felipe Schimdt, 123', '+111111111');


INSERT INTO Emprestimos (id, livro_id, membro_id, dataEmprestimo, dataDevolucao)
VALUES (1, 1, 1, '2024-03-24', '2024-03-30');



INSERT INTO Bibliotecarios (id, nome, email, senha)
VALUES (1, 'Suene', 'suene@example.com', 'senha1');



INSERT INTO Visitantes (id, nome, telefone)
VALUES (1, 'Ana', '+333333333');
