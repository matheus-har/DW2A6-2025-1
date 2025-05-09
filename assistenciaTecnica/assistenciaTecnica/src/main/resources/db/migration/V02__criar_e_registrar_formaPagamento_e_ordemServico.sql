CREATE TABLE `forma_pagamento` (
  `codigo` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO forma_pagamento (nome) 
VALUES ("Pix");

CREATE TABLE `ordem_servico` (
  `codigo` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  `descricao` VARCHAR(150) NOT NULL,
  `data_emissao` DATE NOT NULL,
  `data_finalizacao` DATE NULL,
  `valor` DECIMAL(10,2) NOT NULL,
  `observacao` VARCHAR(150),
  `status`  ENUM('EM_APROVACAO', 'APROVADA', 'EM_ANDAMENTO', 'FINALIZADA'),
  `codigo_forma_pagamento` BIGINT(20) NOT NULL,
  `codigo_cliente` BIGINT(20) NOT NULL,
  FOREIGN KEY (`codigo_forma_pagamento`) REFERENCES `forma_pagamento` (`codigo`),
  FOREIGN KEY (`codigo_cliente`) REFERENCES `cliente` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO ordem_servico (descricao, data_emissao, data_finalizacao, valor, observacao, status, codigo_forma_pagamento, codigo_cliente) 
VALUES ("troca HD",  "2025-04-24", "2025-04-24", 500, "HD 512 GB","FINALIZADA", 1, 1);