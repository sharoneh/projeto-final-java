CREATE TABLE cliente (
    id INT(4) AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    sobrenome VARCHAR(45) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    CONSTRAINT pk_cliente PRIMARY KEY(id)
);

CREATE TABLE produto (
    id INT(4) AUTO_INCREMENT,
    descricao VARCHAR(45) NOT NULL,
    CONSTRAINT pk_produto PRIMARY KEY(id)
);

CREATE TABLE pedido (
    id INT(4) AUTO_INCREMENT,
    id_cliente INT(4),
    data_pedido DATE NOT NULL,
    CONSTRAINT pk_pedido PRIMARY KEY(id),
    CONSTRAINT fk_cliente FOREIGN KEY(id_cliente)
        REFERENCES cliente(id)
        ON DELETE SET NULL
);

CREATE TABLE item (
    id INT(4) AUTO_INCREMENT,
    id_produto INT(4),
    quantidade INT(4) NOT NULL,
    CONSTRAINT pk_item PRIMARY KEY(id),
    CONSTRAINT fk_produto FOREIGN KEY(id_produto)
        REFERENCES produto(id)
        ON DELETE SET NULL
);

CREATE TABLE pedido_item (
    id_pedido INT(4),
    id_item INT(4),
    CONSTRAINT pk_pedido_item PRIMARY KEY(id_pedido, id_item),
    CONSTRAINT fk_pedido FOREIGN KEY(id_pedido)
        REFERENCES pedido(id)
        ON DELETE CASCADE,
    CONSTRAINT fk_item FOREIGN KEY(id_item)
        REFERENCES item(id)
        ON DELETE CASCADE
);