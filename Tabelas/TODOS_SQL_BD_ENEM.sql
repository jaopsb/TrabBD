CREATE TABLE `ALUNOS` (
  `id_nu_insc` varchar(45) NOT NULL,
  `nu_ano` int(4) DEFAULT NULL,
  `cod_mun_res` int(7) DEFAULT NULL,
  `nome_mun_res` varchar(150) DEFAULT NULL,
  `cod_uf_res` varchar(45) DEFAULT NULL,
  `uf_res` varchar(2) DEFAULT NULL,
  `in_estuda_cl_hosp` int(1) DEFAULT NULL,
  `idade` int(100) DEFAULT NULL,
  `id_sexo` varchar(2) DEFAULT NULL,
  `id_nacionalidade` int(4) DEFAULT NULL,
  `cod_mun_nasc` int(7) DEFAULT NULL,
  `cod_us_nasc` varchar(45) DEFAULT NULL,
  `uf_nasc` varchar(2) DEFAULT NULL,
  `id_st_conclusao` int(4) DEFAULT NULL,
  `ano_conclusao` int(11) DEFAULT NULL,
  `id_tp_esc` int(2) DEFAULT NULL,
  `id_in_tp_ensino` int(4) DEFAULT NULL,
  `id_tp_estado_civil` int(4) DEFAULT NULL,
  `id_tp_cor_raca` int(6) DEFAULT NULL,
  `in_baixa_visao` int(11) DEFAULT NULL,
  `in_cegueira` int(11) DEFAULT NULL,
  `in_surdez` int(11) DEFAULT NULL,
  `in_def_auditiva` int(11) DEFAULT NULL,
  `in_surdo_cegueira` int(11) DEFAULT NULL,
  `in_def_mental` int(11) DEFAULT NULL,
  `in_def_fisica` int(11) DEFAULT NULL,
  `in_deficit_atencao` int(11) DEFAULT NULL,
  `in_dislexia` int(11) DEFAULT NULL,
  `in_lactante` int(11) DEFAULT NULL,
  `in_gestante` int(11) DEFAULT NULL,
  `in_idoso` int(11) DEFAULT NULL,
  `in_autismo` int(11) DEFAULT NULL,
  `in_sabatista` int(11) DEFAULT NULL,
  `in_braile` int(11) DEFAULT NULL,
  `in_ampliada_24` int(11) DEFAULT NULL,
  `in_ampliada_18` int(11) DEFAULT NULL,
  `in_ledor` int(11) DEFAULT NULL,
  `in_acesso` int(11) DEFAULT NULL,
  `in_transcricao` int(11) DEFAULT NULL,
  `in_libras` int(11) DEFAULT NULL,
  `in_leitura_labial` int(11) DEFAULT NULL,
  `in_mesa_cadeira_rodas` int(11) DEFAULT NULL,
  `in_mesa_cadeira_separada` int(11) DEFAULT NULL,
  `in_apoio_perna` int(11) DEFAULT NULL,
  `in_guia_interprete` int(11) DEFAULT NULL,
  `id_cod_esc` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_nu_insc`),
  KEY `id_cod_esc_idx` (`id_cod_esc`),
  KEY `id_sexo_idx` (`id_sexo`),
  KEY `id_tp_esc_idx` (`id_tp_esc`),
  KEY `id_in_tp_ensino_idx` (`id_in_tp_ensino`),
  KEY `id_tp_estado_civil_idx` (`id_tp_estado_civil`),
  KEY `id_tp_cor_raca_idx` (`id_tp_cor_raca`),
  KEY `id_nacionalidade_idx` (`id_nacionalidade`),
  KEY `id_st_conclusao_idx` (`ano_conclusao`),
  KEY `id_st_conclusao_idx1` (`id_st_conclusao`),
  CONSTRAINT `id_cod_esc` FOREIGN KEY (`id_cod_esc`) REFERENCES `ESCOLAS` (`id_cod_esc`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_in_tp_ensino` FOREIGN KEY (`id_in_tp_ensino`) REFERENCES `IN_TP_ENSINO` (`id_in_tp_ensino`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_nacionalidade` FOREIGN KEY (`id_nacionalidade`) REFERENCES `NACIONALIDADE` (`id_nacionalidade`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_sexo` FOREIGN KEY (`id_sexo`) REFERENCES `SEXO` (`id_sexo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_st_conclusao` FOREIGN KEY (`id_st_conclusao`) REFERENCES `ENSINO_MEDIO_CONCLUSAO` (`id_st_conclusao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_tp_cor_raca` FOREIGN KEY (`id_tp_cor_raca`) REFERENCES `TP_COR_RACA` (`id_tp_cor_raca`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_tp_esc` FOREIGN KEY (`id_tp_esc`) REFERENCES `TP_ESCOLA` (`id_tp_escola`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_tp_estado_civil` FOREIGN KEY (`id_tp_estado_civil`) REFERENCES `TP_ESTADO_CIVIL` (`id_tp_estado_civil`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ENSINO_MEDIO_CONCLUSAO` (
  `id_st_conclusao` int(11) NOT NULL,
  `desc_st_conclusao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_st_conclusao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ESCOLAS` (
  `id_cod_esc` int(11) NOT NULL,
  `cod_mun_esc` int(7) DEFAULT NULL,
  `nome_mun_esc` varchar(45) DEFAULT NULL,
  `cod_uf_esc` varchar(45) DEFAULT NULL,
  `uf_esc` varchar(45) DEFAULT NULL,
  `id_dependencia_adm_esc` int(4) DEFAULT NULL,
  `id_localizacao_esc` int(2) DEFAULT NULL,
  `sit_func_esc` int(4) DEFAULT NULL,
  PRIMARY KEY (`id_cod_esc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `IN_TP_ENSINO` (
  `id_in_tp_ensino` int(11) NOT NULL,
  `desc_in_tp_ensino` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_in_tp_ensino`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `NACIONALIDADE` (
  `id_nacionalidade` int(11) NOT NULL,
  `desc_nacionalidade` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_nacionalidade`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `NECESSIDADES_ESPECIAIS` (
  `id_tp_necessidade` varchar(45) NOT NULL,
  `desc_tp_necessidade` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id_tp_necessidade`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `PRESENCA_PROVA` (
  `id_presenca` int(11) DEFAULT NULL,
  `desc_presenca` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `PROVA` (
  `id_nu_insc` varchar(45) NOT NULL,
  `cod_mun_prova` int(11) DEFAULT NULL,
  `nome_mun_prova` varchar(45) DEFAULT NULL,
  `cod_uf_prova` varchar(45) DEFAULT NULL,
  `uf_prova` varchar(45) DEFAULT NULL,
  `in_presenca_cn` int(11) DEFAULT NULL,
  `in_presenca_ch` int(11) DEFAULT NULL,
  `in_presenca_lc` int(11) DEFAULT NULL,
  `in_presenca_mt` int(11) DEFAULT NULL,
  `id_prova_cn` int(11) DEFAULT NULL,
  `id_prova_ch` int(11) DEFAULT NULL,
  `id_prova_lc` int(11) DEFAULT NULL,
  `id_prova_mt` int(11) DEFAULT NULL,
  `nota_cn` double DEFAULT NULL,
  `nota_ch` double DEFAULT NULL,
  `nota_lc` double DEFAULT NULL,
  `nota_mt` double DEFAULT NULL,
  `tx_respostas_cn` varchar(200) DEFAULT NULL,
  `tx_respostas_ch` varchar(200) DEFAULT NULL,
  `tx_respostas_lc` varchar(200) DEFAULT NULL,
  `tx_respostas_mt` varchar(200) DEFAULT NULL,
  `tp_lingua` int(11) DEFAULT NULL,
  `id_prova` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_prova`),
  KEY `id_nu_insc_idx` (`id_nu_insc`),
  CONSTRAINT `nu_insc` FOREIGN KEY (`id_nu_insc`) REFERENCES `ALUNOS` (`id_nu_insc`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18339 DEFAULT CHARSET=latin1;

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

CREATE TABLE `SEXO` (
  `id_sexo` varchar(45) NOT NULL,
  `desc_sexo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_sexo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `STATUS_REDACAO` (
  `id_in_status_redacao` int(11) NOT NULL,
  `desc_in_status_redacao` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id_in_status_redacao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `TIPO_PROVA` (
  `id_tp_prova` int(11) NOT NULL,
  `desc_tp_prova` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tp_prova`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `TP_COR_RACA` (
  `id_tp_cor_raca` int(11) NOT NULL,
  `desc_tp_cor_raca` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tp_cor_raca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `TP_ESCOLA` (
  `id_tp_escola` int(11) NOT NULL,
  `desc_tp_escola` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tp_escola`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `TP_ESTADO_CIVIL` (
  `id_tp_estado_civil` int(11) NOT NULL,
  `desc_tp_estado_civil` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tp_estado_civil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `ALUNOS_SIMPLES` AS select `A`.`id_nu_insc` AS `id_nu_insc`,`A`.`id_sexo` AS `id_sexo`,`A`.`uf_res` AS `uf_res`,`P`.`uf_prova` AS `uf_prova`,`P`.`nota_cn` AS `nota_cn`,`P`.`tp_lingua` AS `tp_lingua`,`P`.`nota_ch` AS `nota_ch`,`P`.`nota_lc` AS `nota_lc`,`P`.`nota_mt` AS `nota_mt`,`R`.`nu_nota_redacao` AS `nu_nota_redacao` from ((`ALUNOS` `A` join `PROVA` `P`) join `REDACAO` `R`) where ((`A`.`id_nu_insc` = `P`.`id_nu_insc`) and (`A`.`id_nu_insc` = `R`.`id_nu_insc`) and (`P`.`nota_cn` <> -(1)) and (`P`.`nota_ch` <> -(1)) and (`P`.`nota_lc` <> -(1)) and (`P`.`nota_mt` <> -(1)));

DELIMITER $$
CREATE DEFINER=`root`@`%` PROCEDURE `get_alunos`(IN quantidade int)
BEGIN
  if quantidade > 0 then select * from ALUNOS limit quantidade;
  END IF;
END$$
DELIMITER ;
