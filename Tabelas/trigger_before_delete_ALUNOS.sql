CREATE DEFINER=`root`@`%` TRIGGER `bd_enem`.`ALUNOS_BEFORE_DELETE` BEFORE DELETE ON `ALUNOS` FOR EACH ROW
BEGIN
	delete from PROVA where id_nu_insc = OLD.id_nu_insc;
    delete from REDACAO where id_nu_insc = OLD.id_nu_insc;
END