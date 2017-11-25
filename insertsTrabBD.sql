
insert into TP_ESTADO_CIVIL (id_tp_estado_civil,desc_tp_estado_civil) values(0,"Solteiro");
insert into TP_ESTADO_CIVIL (id_tp_estado_civil,desc_tp_estado_civil) values(1,"Casado mora com companheiro(a)");
insert into TP_ESTADO_CIVIL (id_tp_estado_civil,desc_tp_estado_civil) values(2,"Divorciado/Desquitado/Separado");
insert into TP_ESTADO_CIVIL (id_tp_estado_civil,desc_tp_estado_civil) values(3,"Viúvo(a)");
insert into TP_ESTADO_CIVIL (id_tp_estado_civil,desc_tp_estado_civil) values(-1,"Não informado");

insert into IN_TP_ENSINO (id_in_tp_ensino,desc_in_tp_ensino) values(1,"Ensino regular");
insert into IN_TP_ENSINO (id_in_tp_ensino,desc_in_tp_ensino) values(2,"Ensino para jovens e adultos");
insert into IN_TP_ENSINO (id_in_tp_ensino,desc_in_tp_ensino) values(4,"Ensino especial");
insert into IN_TP_ENSINO (id_in_tp_ensino,desc_in_tp_ensino) values(-1,"Não informado");

insert into TP_ESCOLA (id_tp_escola,desc_tp_escola) values(1,"Pública");
insert into TP_ESCOLA (id_tp_escola,desc_tp_escola) values(2,"Privada");
insert into TP_ESCOLA (id_tp_escola,desc_tp_escola) values(-1,"Não informado");

insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(1,"Conclui Ens.Medio");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(2,"Cursando e concluirei em 2014");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(3,"Cursando e concluirei após 2014");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(4,"Não conclui e não estou cursando");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(-1,"Não informado");

insert into SEXO (id_sexo,desc_sexo) values ("M","MASCULINO");
insert into SEXO (id_sexo,desc_sexo) values ("F","FEMININO");
insert into SEXO (id_sexo,desc_sexo) values ("-1","Não informado");

insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(1,"Brasileiro(a)");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(2,"Brasileiro(a) naturalizado");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(3,"Estrangeiro(a)");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(4,"Brasileiro(a) nato(a), nascido no exterior");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(-1,"Não informado");