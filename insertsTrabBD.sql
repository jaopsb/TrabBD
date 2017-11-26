insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(1,"Em branco");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(2,"Anulada");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(3,"Fuga ao tema");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(4,"Não atende ao tipo textual");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(5,"Texto insuficiente");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(6,"Ausente");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(7,"Presente e texto conforme os requisitos");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(9,"Anulada - Fere Direitos Humanos");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(10,"Cópia de texto motivador");
insert into STATUS_REDACAO (id_in_status_redacao,desc_in_status_redacao) values(11,"Parte do texto desconectada com o tema proposto");

insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (199,"Azul CN");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (200,"Amarelo CN");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (201,"Branco CN");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (202,"Rosa CN");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (216,"Branco - adaptada (Braile e Ledor) CN");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (195,"Azul CH");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (196,"Amarelo CH");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (197,"Branco CH");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (198,"Rosa CH");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (215,"Branco - adaptada (Brailse e Ledor) CH");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (203,"Amarelo LC");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (204,"Cinza LC");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (205,"Azul LC");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (206,"Rosa LC");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (213,"Cinza (Reaplicacao) LC");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (217,"Cinza - adaptada (Braile e Ledor) LC");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (207,"Amarelo MT");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (208,"Cinza MT");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (209,"Azul MT");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (210,"Rosa MT");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (214,"Cinza (Reaplicacao) MT");
insert into TIPO_PROVA (id_tp_prova,desc_tp_prova) values (218,"Cinza - adaptada (Braile e Ledor) MT");

insert into PRESENCA_PROVA (id_presenca,desc_presenca) values(0,"Faltou à prova");
insert into PRESENCA_PROVA (id_presenca,desc_presenca) values(1,"Presente na prova");
insert into PRESENCA_PROVA (id_presenca,desc_presenca) values(2,"Eliminado na prova");

insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_baixa_visao","indicador de baixa visão");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_cegueira","indicador de cegueira");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_surdez","indicador de surdez");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_def_auditiva","indicador de deficiência auditiva");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_surdo_cegueira","indicador de surdo-cegueira");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_def_fisica","indicador de deficiência fisica");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_def_mental","indicador de deficiência mental");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_deficit_atencao","indicador de déficit de atenção");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_dislexia","indicador de dislexia");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_gestante","indicador de gestante");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_lactante","indicador de lactante");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_idoso","indicador de idoso");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_autismo","indicador de autismo");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_sabatista","indicados de solicitação de prova aplicada em horário diferenciado para os guardadores de sábados");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("-1","Não informado");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_braile","indicador de solicitação de prova em braile");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_ampliada_24","indicador de solicitação de prova super ampliada com fonte tamanho 24");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_ampliada_18","indicador de solicitação de prova ampliada com fonte tamanho 18");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_ledor","indicador de auxílio de ledor");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_acesso","indicador de solicitação de sala de fácil acesso");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_transcricao","indicador de solicitação de transcrição");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_libras","indicador de solicitação de libras");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_leitura_labial","indicador de solicitação de leitura labial");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_mesa_cadeira_rodas","indicador de solicitação de cadeira de rodas");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_mesa_cadeira_separada","indicador de solicitação de cadeira separada");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_apoio_perna","indicador de solicitação de apoio de perna");
insert into NECESSIDADES_ESPECIAIS (id_tp_necessidade,desc_tp_necessidade) values("in_guia_interprete","indicador de solicitação de guia intérprete");

insert into TP_COR_RACA (id_tp_cor_raca,desc_tp_cor_raca) values(0,"Não declarado");
insert into TP_COR_RACA (id_tp_cor_raca,desc_tp_cor_raca) values(1,"Branca");
insert into TP_COR_RACA (id_tp_cor_raca,desc_tp_cor_raca) values(2,"Preta");
insert into TP_COR_RACA (id_tp_cor_raca,desc_tp_cor_raca) values(3,"Parda");
insert into TP_COR_RACA (id_tp_cor_raca,desc_tp_cor_raca) values(4,"Amarela");
insert into TP_COR_RACA (id_tp_cor_raca,desc_tp_cor_raca) values(5,"Indigena");

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