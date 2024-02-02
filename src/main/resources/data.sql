create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
);

insert into tb_cidade
    (id_cidade, nome, qtd_habitantes)
values
    (1, 'Recife', 1488920),
    (2, 'São Paulo', 10000000),
    (3, 'Rio de Janeiro', 2000000);