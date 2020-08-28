CREATE TABLE cliente (
    id INT(11) AUTO_INCREMENT,
    cpf VARCHAR(15) NOT NULL,
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
        ON UPDATE CASCADE
);

CREATE TABLE item_do_pedido (
    id_pedido INT(11),
    id_produto INT(11),
    quantidade INT(11) NOT NULL,
    CONSTRAINT pk_pedido_item PRIMARY KEY(id_pedido, id_produto),
    CONSTRAINT fk_pedido FOREIGN KEY(id_pedido)
        REFERENCES pedido(id)
        ON UPDATE CASCADE,
    CONSTRAINT fk_item FOREIGN KEY(id_produto)
        REFERENCES produto(id)
        ON UPDATE CASCADE
);
