DELIMITER $$
CREATE DEFINER=`root`@`%` PROCEDURE `getEstatisticaPorUF`(IN uf varchar(2))
BEGIN
	select count(*)/(select count(*) from ALUNOS) * 100 from ALUNOS where uf_res = uf;
END$$
DELIMITER ;
