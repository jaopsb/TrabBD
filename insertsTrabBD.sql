select * from ESCOLAS;
select * from ALUNOS;

select count(*) from ALUNOS;
select count(*) from ESCOLAS;

select * from NACIONALIDADE

select count(*) from ALUNOS as a where a.id_sexo = "M" and a.id_nacionalidade = 1;









insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(1,"Conclui Ens.Medio");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(2,"Cursando e concluirei em 2014");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(3,"Cursando e concluirei após 2014");
insert into ENSINO_MEDIO_CONCLUSAO (id_st_conclusao,desc_st_conclusao) values(4,"Não conclui e não estou cursando");

insert into SEXO (id_sexo,desc_sexo) values ("F","FEMININO");

insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(1,"Brasileiro(a)");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(2,"Brasileiro(a) naturalizado");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(3,"Estrangeiro(a)");
insert into NACIONALIDADE (id_nacionalidade,desc_nacionalidade) values(4,"Brasileiro(a) nato(a), nascido no exterior");