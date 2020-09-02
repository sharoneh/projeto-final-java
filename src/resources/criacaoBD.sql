-- Remover tabelas do banco de dados
DROP TABLE IF EXISTS item_do_pedido, produto, cliente, pedido;

-- Criação das tabelas
CREATE TABLE cliente (
    id INT(11) AUTO_INCREMENT,
    cpf VARCHAR(15) UNIQUE NOT NULL,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    CONSTRAINT pk_cliente PRIMARY KEY(id)
);

CREATE TABLE produto (
    id INT(11) AUTO_INCREMENT,
    descricao VARCHAR(45) NOT NULL,
    CONSTRAINT pk_produto PRIMARY KEY(id)
);

CREATE TABLE pedido (
    id INT(11) AUTO_INCREMENT,
    id_cliente INT(11),
    data DATE NOT NULL,
    CONSTRAINT pk_pedido PRIMARY KEY(id),
    CONSTRAINT fk_cliente FOREIGN KEY(id_cliente)
        REFERENCES cliente(id)
);

CREATE TABLE item_do_pedido (
    id_pedido INT(11),
    id_produto INT(11),
    quantidade INT(11) NOT NULL,
    CONSTRAINT pk_pedido_item PRIMARY KEY(id_pedido, id_produto),
    CONSTRAINT fk_pedido FOREIGN KEY(id_pedido)
        REFERENCES pedido(id),
    CONSTRAINT fk_item FOREIGN KEY(id_produto)
        REFERENCES produto(id)
);

-- População do banco de dados
INSERT INTO produto(descricao) VALUES
    ('Produto 1'),
    ('Produto 2'),
    ('Produto 3'),
    ('Produto 4'),
    ('Produto 5')
;

INSERT INTO cliente(cpf, nome, sobrenome) VALUES
    ('00000000000', 'Maria', 'Clara'),
    ('11111111111', 'João', 'Carlos'),
    ('22222222222', 'Amanda', 'Vieira'),
    ('33333333333', 'Lucas', 'Pereira')
;

INSERT INTO pedido(id_cliente, data) VALUES
    (1, '2020-08-01'),
    (1, '2020-08-02'),
    (2, '2020-08-03'),
    (3, '2020-08-05'),
    (4, '2020-08-07')
;

INSERT INTO item_do_pedido(id_pedido, id_produto, quantidade) VALUES
    (1, 1, 1),
    (2, 1, 1),
    (2, 2, 2),
    (3, 1, 1),
    (3, 2, 2),
    (3, 3, 3),
    (4, 1, 1),
    (4, 2, 2),
    (4, 3, 3),
    (4, 4, 4),
    (5, 1, 1),
    (5, 2, 2),
    (5, 3, 3),
    (5, 4, 4),
    (5, 5, 5)
;