create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade
    (id_cidade, nome, qtd_habitantes)
values
    (1, 'Recife', 1488920),
    (2, 'São Paulo', 87675545),
    (3, 'Rio de Janeiro', 7654567),
    (4, 'Fortaleza', 123234),
    (5, 'Salvador', 7654567),
    (6, 'Belo Horizonte', 8768997),
    (7, 'Porto Alegre', 6543567),
    (8, 'Porto Velho', 8765432),
    (9, 'Palmas', 6447865),
    (10, 'Natal', 1213456),
    (11, 'Brasilia', 1234565)
;