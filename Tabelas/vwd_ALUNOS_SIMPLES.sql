CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`%` 
    SQL SECURITY DEFINER
VIEW `ALUNOS_SIMPLES` AS
    SELECT 
        `A`.`id_nu_insc` AS `id_nu_insc`,
        `A`.`id_sexo` AS `id_sexo`,
        `A`.`uf_res` AS `uf_res`,
        `P`.`uf_prova` AS `uf_prova`,
        `P`.`nota_cn` AS `nota_cn`,
        `P`.`tp_lingua` AS `tp_lingua`,
        `P`.`nota_ch` AS `nota_ch`,
        `P`.`nota_lc` AS `nota_lc`,
        `P`.`nota_mt` AS `nota_mt`,
        `R`.`nu_nota_redacao` AS `nu_nota_redacao`
    FROM
        ((`ALUNOS` `A`
        JOIN `PROVA` `P`)
        JOIN `REDACAO` `R`)
    WHERE
        ((`A`.`id_nu_insc` = `P`.`id_nu_insc`)
            AND (`A`.`id_nu_insc` = `R`.`id_nu_insc`))
