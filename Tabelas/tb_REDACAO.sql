CREATE TABLE `REDACAO` (
  `id_nu_insc` varchar(45) NOT NULL,
  `in_status_redacao` int(11) DEFAULT NULL,
  `nu_nota_comp1` double DEFAULT NULL,
  `nu_nota_comp2` double DEFAULT NULL,
  `nu_nota_comp3` double DEFAULT NULL,
  `nu_nota_comp4` double DEFAULT NULL,
  `nu_nota_comp5` double DEFAULT NULL,
  `nu_nota_redacao` double DEFAULT NULL,
  PRIMARY KEY (`id_nu_insc`),
  CONSTRAINT `id_nu_insc` FOREIGN KEY (`id_nu_insc`) REFERENCES `ALUNOS` (`id_nu_insc`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
