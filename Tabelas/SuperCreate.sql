-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bd_enem
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_enem
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_enem` DEFAULT CHARACTER SET latin1 ;
USE `bd_enem` ;

-- -----------------------------------------------------
-- Table `bd_enem`.`ESCOLAS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`ESCOLAS` (
  `id_cod_esc` INT(11) NOT NULL,
  `cod_mun_esc` INT(7) NULL DEFAULT NULL,
  `nome_mun_esc` VARCHAR(45) NULL DEFAULT NULL,
  `cod_uf_esc` VARCHAR(45) NULL DEFAULT NULL,
  `uf_esc` VARCHAR(45) NULL DEFAULT NULL,
  `id_dependencia_adm_esc` INT(4) NULL DEFAULT NULL,
  `id_localizacao_esc` INT(2) NULL DEFAULT NULL,
  `sit_func_esc` INT(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id_cod_esc`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`IN_TP_ENSINO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`IN_TP_ENSINO` (
  `id_in_tp_ensino` INT(11) NOT NULL,
  `desc_in_tp_ensino` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_in_tp_ensino`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`NACIONALIDADE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`NACIONALIDADE` (
  `id_nacionalidade` INT(11) NOT NULL,
  `desc_nacionalidade` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_nacionalidade`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`SEXO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`SEXO` (
  `id_sexo` VARCHAR(45) NOT NULL,
  `desc_sexo` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_sexo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`ENSINO_MEDIO_CONCLUSAO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`ENSINO_MEDIO_CONCLUSAO` (
  `id_st_conclusao` INT(11) NOT NULL,
  `desc_st_conclusao` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_st_conclusao`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`TP_COR_RACA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`TP_COR_RACA` (
  `id_tp_cor_raca` INT(11) NOT NULL,
  `desc_tp_cor_raca` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_tp_cor_raca`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`TP_ESCOLA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`TP_ESCOLA` (
  `id_tp_escola` INT(11) NOT NULL,
  `desc_tp_escola` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_tp_escola`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`TP_ESTADO_CIVIL`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`TP_ESTADO_CIVIL` (
  `id_tp_estado_civil` INT(11) NOT NULL,
  `desc_tp_estado_civil` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_tp_estado_civil`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`ALUNOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`ALUNOS` (
  `id_nu_insc` VARCHAR(45) NOT NULL,
  `nu_ano` INT(4) NULL DEFAULT NULL,
  `cod_mun_res` INT(7) NULL DEFAULT NULL,
  `nome_mun_res` VARCHAR(150) NULL DEFAULT NULL,
  `cod_uf_res` VARCHAR(45) NULL DEFAULT NULL,
  `uf_res` VARCHAR(2) NULL DEFAULT NULL,
  `in_estuda_cl_hosp` INT(1) NULL DEFAULT NULL,
  `idade` INT(100) NULL DEFAULT NULL,
  `id_sexo` VARCHAR(2) NULL DEFAULT NULL,
  `id_nacionalidade` INT(4) NULL DEFAULT NULL,
  `cod_mun_nasc` INT(7) NULL DEFAULT NULL,
  `cod_us_nasc` VARCHAR(45) NULL DEFAULT NULL,
  `uf_nasc` VARCHAR(2) NULL DEFAULT NULL,
  `id_st_conclusao` INT(4) NULL DEFAULT NULL,
  `ano_conclusao` INT(11) NULL DEFAULT NULL,
  `id_tp_esc` INT(2) NULL DEFAULT NULL,
  `id_in_tp_ensino` INT(4) NULL DEFAULT NULL,
  `id_tp_estado_civil` INT(4) NULL DEFAULT NULL,
  `id_tp_cor_raca` INT(6) NULL DEFAULT NULL,
  `in_baixa_visao` INT(11) NULL DEFAULT NULL,
  `in_cegueira` INT(11) NULL DEFAULT NULL,
  `in_surdez` INT(11) NULL DEFAULT NULL,
  `in_def_auditiva` INT(11) NULL DEFAULT NULL,
  `in_surdo_cegueira` INT(11) NULL DEFAULT NULL,
  `in_def_mental` INT(11) NULL DEFAULT NULL,
  `in_def_fisica` INT(11) NULL DEFAULT NULL,
  `in_deficit_atencao` INT(11) NULL DEFAULT NULL,
  `in_dislexia` INT(11) NULL DEFAULT NULL,
  `in_lactante` INT(11) NULL DEFAULT NULL,
  `in_gestante` INT(11) NULL DEFAULT NULL,
  `in_idoso` INT(11) NULL DEFAULT NULL,
  `in_autismo` INT(11) NULL DEFAULT NULL,
  `in_sabatista` INT(11) NULL DEFAULT NULL,
  `in_braile` INT(11) NULL DEFAULT NULL,
  `in_ampliada_24` INT(11) NULL DEFAULT NULL,
  `in_ampliada_18` INT(11) NULL DEFAULT NULL,
  `in_ledor` INT(11) NULL DEFAULT NULL,
  `in_acesso` INT(11) NULL DEFAULT NULL,
  `in_transcricao` INT(11) NULL DEFAULT NULL,
  `in_libras` INT(11) NULL DEFAULT NULL,
  `in_leitura_labial` INT(11) NULL DEFAULT NULL,
  `in_mesa_cadeira_rodas` INT(11) NULL DEFAULT NULL,
  `in_mesa_cadeira_separada` INT(11) NULL DEFAULT NULL,
  `in_apoio_perna` INT(11) NULL DEFAULT NULL,
  `in_guia_interprete` INT(11) NULL DEFAULT NULL,
  `id_cod_esc` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_nu_insc`),
  CONSTRAINT `id_cod_esc`
    FOREIGN KEY (`id_cod_esc`)
    REFERENCES `bd_enem`.`ESCOLAS` (`id_cod_esc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_in_tp_ensino`
    FOREIGN KEY (`id_in_tp_ensino`)
    REFERENCES `bd_enem`.`IN_TP_ENSINO` (`id_in_tp_ensino`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_nacionalidade`
    FOREIGN KEY (`id_nacionalidade`)
    REFERENCES `bd_enem`.`NACIONALIDADE` (`id_nacionalidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_sexo`
    FOREIGN KEY (`id_sexo`)
    REFERENCES `bd_enem`.`SEXO` (`id_sexo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_st_conclusao`
    FOREIGN KEY (`id_st_conclusao`)
    REFERENCES `bd_enem`.`ENSINO_MEDIO_CONCLUSAO` (`id_st_conclusao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_tp_cor_raca`
    FOREIGN KEY (`id_tp_cor_raca`)
    REFERENCES `bd_enem`.`TP_COR_RACA` (`id_tp_cor_raca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_tp_esc`
    FOREIGN KEY (`id_tp_esc`)
    REFERENCES `bd_enem`.`TP_ESCOLA` (`id_tp_escola`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_tp_estado_civil`
    FOREIGN KEY (`id_tp_estado_civil`)
    REFERENCES `bd_enem`.`TP_ESTADO_CIVIL` (`id_tp_estado_civil`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

CREATE INDEX `id_cod_esc_idx` ON `bd_enem`.`ALUNOS` (`id_cod_esc` ASC);

CREATE INDEX `id_sexo_idx` ON `bd_enem`.`ALUNOS` (`id_sexo` ASC);

CREATE INDEX `id_tp_esc_idx` ON `bd_enem`.`ALUNOS` (`id_tp_esc` ASC);

CREATE INDEX `id_in_tp_ensino_idx` ON `bd_enem`.`ALUNOS` (`id_in_tp_ensino` ASC);

CREATE INDEX `id_tp_estado_civil_idx` ON `bd_enem`.`ALUNOS` (`id_tp_estado_civil` ASC);

CREATE INDEX `id_tp_cor_raca_idx` ON `bd_enem`.`ALUNOS` (`id_tp_cor_raca` ASC);

CREATE INDEX `id_nacionalidade_idx` ON `bd_enem`.`ALUNOS` (`id_nacionalidade` ASC);

CREATE INDEX `id_st_conclusao_idx` ON `bd_enem`.`ALUNOS` (`ano_conclusao` ASC);

CREATE INDEX `id_st_conclusao_idx1` ON `bd_enem`.`ALUNOS` (`id_st_conclusao` ASC);


-- -----------------------------------------------------
-- Table `bd_enem`.`NECESSIDADES_ESPECIAIS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`NECESSIDADES_ESPECIAIS` (
  `id_tp_necessidade` VARCHAR(45) NOT NULL,
  `desc_tp_necessidade` VARCHAR(120) NULL DEFAULT NULL,
  PRIMARY KEY (`id_tp_necessidade`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`PRESENCA_PROVA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`PRESENCA_PROVA` (
  `id_presenca` INT(11) NULL DEFAULT NULL,
  `desc_presenca` VARCHAR(45) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`TIPO_PROVA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`TIPO_PROVA` (
  `id_tp_prova` INT(11) NOT NULL,
  `desc_tp_prova` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_tp_prova`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bd_enem`.`PROVA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`PROVA` (
  `id_nu_insc` VARCHAR(45) NOT NULL,
  `cod_mun_prova` INT(11) NULL DEFAULT NULL,
  `nome_mun_prova` VARCHAR(45) NULL DEFAULT NULL,
  `cod_uf_prova` VARCHAR(45) NULL DEFAULT NULL,
  `uf_prova` VARCHAR(45) NULL DEFAULT NULL,
  `in_presenca_cn` INT(11) NULL DEFAULT NULL,
  `in_presenca_ch` INT(11) NULL DEFAULT NULL,
  `in_presenca_lc` INT(11) NULL DEFAULT NULL,
  `in_presenca_mt` INT(11) NULL DEFAULT NULL,
  `id_prova_cn` INT(11) NULL DEFAULT NULL,
  `id_prova_ch` INT(11) NULL DEFAULT NULL,
  `id_prova_lc` INT(11) NULL DEFAULT NULL,
  `id_prova_mt` INT(11) NULL DEFAULT NULL,
  `nota_nc` DOUBLE NULL DEFAULT NULL,
  `nota_ch` DOUBLE NULL DEFAULT NULL,
  `nota_lc` DOUBLE NULL DEFAULT NULL,
  `nota_mt` DOUBLE NULL DEFAULT NULL,
  `tx_respostas_cn` VARCHAR(45) NULL DEFAULT NULL,
  `tx_respostas_ch` VARCHAR(45) NULL DEFAULT NULL,
  `tx_respostas_lc` VARCHAR(45) NULL DEFAULT NULL,
  `tx_respostas_mt` VARCHAR(45) NULL DEFAULT NULL,
  `tp_lingua` INT(11) NULL DEFAULT NULL,
  `id_prova` INT(11) NOT NULL,
  PRIMARY KEY (`id_prova`),
  CONSTRAINT `id_tp_prova`
    FOREIGN KEY (`id_prova`)
    REFERENCES `bd_enem`.`TIPO_PROVA` (`id_tp_prova`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `nu_insc`
    FOREIGN KEY (`id_nu_insc`)
    REFERENCES `bd_enem`.`ALUNOS` (`id_nu_insc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

CREATE INDEX `id_nu_insc_idx` ON `bd_enem`.`PROVA` (`id_nu_insc` ASC);


-- -----------------------------------------------------
-- Table `bd_enem`.`REDACAO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_enem`.`REDACAO` (
  `id_nu_insc` VARCHAR(45) NOT NULL,
  `in_status_redacao` INT(11) NULL DEFAULT NULL,
  `nu_nota_comp1` DOUBLE NULL DEFAULT NULL,
  `nu_nota_comp2` DOUBLE NULL DEFAULT NULL,
  `nu_nota_comp3` DOUBLE NULL DEFAULT NULL,
  `nu_nota_comp4` DOUBLE NULL DEFAULT NULL,
  `nu_nota_comp5` DOUBLE NULL DEFAULT NULL,
  `nu_nota_redacao` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`id_nu_insc`),
  CONSTRAINT `id_nu_insc`
    FOREIGN KEY (`id_nu_insc`)
    REFERENCES `bd_enem`.`ALUNOS` (`id_nu_insc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
