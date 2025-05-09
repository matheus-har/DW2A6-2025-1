CREATE TABLE `cliente` (
  `codigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (codigo, nome, email, telefone, cpf, active) 
VALUES (1, "Marcos Silva", "marcos@ifsp.edu.br", "12996579668", "14000000000", 1);
