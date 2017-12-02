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
