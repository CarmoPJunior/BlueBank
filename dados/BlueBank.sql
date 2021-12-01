
/* LIMPA AS INFORMAÇÕES DAS TABELAS */
SET foreign_key_checks = 0; /* DESABILITA AS CHAVES ESTRANGEIRAS */
TRUNCATE TABLE `bluebank`.`endereco`;
TRUNCATE TABLE `bluebank`.`contato`;
TRUNCATE TABLE `bluebank`.`transacoes`;
TRUNCATE TABLE `bluebank`.`conta`;
TRUNCATE TABLE `bluebank`.`cliente`;
SET foreign_key_checks = 1;  /* HABILITA AS CHAVES ESTRANGEIRAS */

/*-----------------------------------------CLIENTE-----------------------------------------*/

INSERT INTO `bluebank`.`cliente` (`id`, `cpf`, `data_de_nascimento`, `nome`)
VALUES (1 ,"214.033.700-01", "18/08/1987", "Lionel Messi");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (2, "665.186.810-12", "19/02/1986", "Marta Vieira da Silva");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (3, "406.905.390-53", "05/02/1992", "Neymar da Silva Santos Júnior");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (4, "815.020.930-14", "05/02/1985", "Cristiano Ronaldo dos Santos Aveiro");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (5, "508.333.490-90", "05/02/1996", "Kylian Mbappé Lottin");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (6, "904.186.470-97", "19/02/1978", "Miraildes Maciel Mota");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (7, "417.687.630-11", "05/05/1985 ", "Cristiane Rozeira de Souza Silva");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (8, "414.964.480-22", "05/03/1992", "Andressa Alves da Silva");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (9, "871.938.810-19", "05/02/1983", "Felipe Melo de Carvalho");

INSERT INTO `bluebank`.`cliente` (`id`,`cpf`, `data_de_nascimento`, `nome`)
VALUES (10, "106.047.430-17", "05/02/1986", "Givanildo Vieira de Sousa");


/*-----------------------------------------ENDEREÇO-----------------------------------------*/

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("41925-060", "São Paulo", "SP", "Rua Argentina", 10, 1);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("41985-062", "Fortaleza ", "CE", "Rua A", 09, 2);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("41965-063", "Rio de Janeiro", "RJ", "Rua Brasil", 11, 3);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("41955-064", "Teresina", "PI", "Rua Pan", 07, 4);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("41425-065", "Boa Vista", "RR", "Rua Gama", 08, 5);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("42925-068", "Salvador", "BA", "Rua J", 51, 6);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("41325-068", "Palmas", "TO", "Rua Onze", 25, 7);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("42915-068", "Aracaju", "SE", "Rua Janeiro", 04, 8);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("22925-068", "São Luís", "MA", "Rua Fevereiro", 56, 9);

INSERT INTO `bluebank`.`endereco` (`cep`, `cidade`, `estado`,`logradouro`,`numero`,`id_cliente`)
VALUES ("45925-068", "Belém", "PA", "Rua 15 Março", 100, 10);

/*-----------------------------------------CONTATO-----------------------------------------*/

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("messi@mail.com" , "98852-4896", 1);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("marta@mail.com" , "98852-4896", 2);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("neymar@mail.com" , "98852-4896", 3);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("cristiano@mail.com" , "98852-4896", 4);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("mbappe@mail.com" , "98852-4896", 5);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("miraildes@mail.com" , "98852-4896", 6);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("cristiane@mail.com" , "98852-4896", 7);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("andressa@mail.com" , "98852-4896", 8);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("felipe.melo@mail.com" , "98852-4896", 9);

INSERT INTO `bluebank`.`contato` (`email`, `numero_telefone`, `id_cliente`)
VALUES ("givanildo@mail.com" , "98852-4896",10);

/*-----------------------------------------CONTA-----------------------------------------*/

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (1, "01", "111-1", 30000.00, 1, 1, 1);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (2, "01", "222-1", 20000.00, 1, 1, 2);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (3, "01", "333-1", 10000.00, 1, 2, 3);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (4, "01", "444-1", 50000.00, 1, 1, 4);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (5, "01", "555-1", 7000.00, 1, 2, 5);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (6, "01", "665-1", 5000.00, 1, 2, 6);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (7, "01", "777-1", 12000.00, 1, 1, 7);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (8, "01", "888-1", 3000.00, 1, 1, 8);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (9, "01", "999-1", 8000.00, 1, 2, 9);

INSERT INTO `bluebank`.`conta` (`id`, `agencia`, `numero_conta`, `saldo`, `status`, `tipo_conta`, `id_cliente`)
VALUES (10, "01", "1110-1", 11000.00, 1, 1, 10);

/*-----------------------------------------TRANSAÇÕES-----------------------------------------*/

/*----------DEPOSITO----------*/
INSERT INTO `bluebank`.`transacoes` (`data`, `tipo_transacao`, `valor`, `id_conta_origem`)
VALUES (NOW(), 2, 1000.00, 1);
INSERT INTO `bluebank`.`transacoes` (`data`, `tipo_transacao`, `valor`, `id_conta_origem`)
VALUES (NOW(), 2, 500.00, 2);


/*----------SAQUE----------*/
INSERT INTO `bluebank`.`transacoes` (`data`, `tipo_transacao`, `valor`, `id_conta_origem`)
VALUES (NOW(), 1, 300.00 , 3);
INSERT INTO `bluebank`.`transacoes` (`data`, `tipo_transacao`, `valor`, `id_conta_origem`)
VALUES (NOW(), 1, 150.00,  2);

/*----------TRANSFERÊNCIA----------*/
INSERT INTO `bluebank`.`transacoes` (`data`, `tipo_transacao`, `valor`, `id_conta_destino`, `id_conta_origem`)
VALUES (NOW(), 3, 800.00, 3, 2);
INSERT INTO `bluebank`.`transacoes` (`data`, `tipo_transacao`, `valor`, `id_conta_destino`, `id_conta_origem`)
VALUES (NOW(), 3, 600.00, 4, 1);