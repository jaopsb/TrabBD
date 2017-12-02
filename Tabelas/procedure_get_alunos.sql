DELIMITER $$
CREATE DEFINER=`root`@`%` PROCEDURE `get_alunos`(IN quantidade int)
BEGIN
	if quantidade > 0 then select * from ALUNOS limit quantidade;
	END IF;
END$$
DELIMITER ;
