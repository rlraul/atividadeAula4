INSERT INTO autor (nome) VALUES ('teste1');
INSERT INTO autor (nome) VALUES ('teste2');
INSERT INTO autor (nome) VALUES ('teste3');
INSERT INTO autor (nome) VALUES ('teste4');
INSERT INTO autor (nome) VALUES ('Raul Cardoso');

INSERT INTO cidade (nome) VALUES ('Cidade1');
INSERT INTO cidade (nome) VALUES ('Cidade2');
INSERT INTO cidade (nome) VALUES ('Cidade3');
INSERT INTO cidade (nome) VALUES ('Cidade4');

INSERT INTO editora (nome) VALUES ('Editora1');
INSERT INTO editora (nome) VALUES ('Editora2');
INSERT INTO editora (nome) VALUES ('Editora3');
INSERT INTO editora (nome) VALUES ('Editora4');

INSERT INTO genero (descricao) VALUES ('genero1');
INSERT INTO genero (descricao) VALUES ('genero2');
INSERT INTO genero (descricao) VALUES ('genero3');
INSERT INTO genero (descricao) VALUES ('genero4');

INSERT INTO livro (titulo, editora_id, genero_id, autor_id, ano, isbn, cidade_id, valor) VALUES ('Livro1', 1, 1, 1, 2020, 'isbn1', 1, 99.90);
INSERT INTO livro (titulo, editora_id, genero_id, autor_id, ano, isbn, cidade_id, valor) VALUES ('Livro2', 2, 2, 2, 2009, 'isbn2', 2, 50.00);
INSERT INTO livro (titulo, editora_id, genero_id, autor_id, ano, isbn, cidade_id, valor) VALUES ('Livro3', 3, 3, 3, 1980, 'isbn3', 3, 120.25);
INSERT INTO livro (titulo, editora_id, genero_id, autor_id, ano, isbn, cidade_id, valor) VALUES ('Livro4', 4, 4, 5, 2010, 'isbn4', 4, 150.50);