package dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALUNOS")
public class Aluno {

	@Id
	private String id_nu_insc;

	private String nu_ano;
	private int cod_mun_res;
	private String nome_mun_res;
	private String cod_uf_res;
	private String uf_res;
	private int in_estuda_cl_hosp;
	private int idade;
	private String id_sexo;
	private int id_nacionalidade;
	private int cod_mun_nasc;
	private String cod_us_nasc;
	private String uf_nasc;
	private int id_st_conclusao;
	private int ano_conclusao;
	private int id_tp_esc;
	private int id_in_tp_ensino;
	private int id_tp_estado_civil;
	private int id_tp_cor_raca;
	private int id_cod_esc;
	private int in_baixa_visao;
	private int in_cegueira;
	private int in_surdez;
	private int in_def_auditiva;
	private int in_surdo_cegueira;
	private int in_def_fisica;
	private int in_def_mental;
	private int in_deficit_atencao;
	private int in_dislexia;
	private int in_gestante;
	private int in_lactante;
	private int in_idoso;
	private int in_autismo;
	private int in_sabatista;
	private int in_braile;
	private int in_ampliada_24;
	private int in_ampliada_18;
	private int in_ledor;
	private int in_acesso;
	private int in_transcricao;
	private int in_libras;
	private int in_leitura_labial;
	private int in_mesa_cadeira_rodas;
	private int in_mesa_cadeira_separada;
	private int in_apoio_perna;
	private int in_guia_interprete;
	
	public Aluno() {
		
	}
	

	public Aluno(String[] dados) {

		setId_nu_insc(dados[0]);
		setNu_ano(dados[1]);
		setCod_mun_res(Integer.parseInt(dados[2]));
		setNome_mun_res(dados[3]);
		setCod_uf_res(dados[4]);
		setUf_res(dados[5]);
		setIn_estuda_cl_hosp(Integer.parseInt(dados[6]));
		setId_cod_esc(Integer.parseInt(dados[7]));
		setIdade(Integer.parseInt(dados[15]));
		setId_sexo(dados[16]);
		setId_nacionaldiade(Integer.parseInt(dados[17]));
		setCod_mun_nasc(Integer.parseInt(dados[18]));
		setNome_mun_res(dados[19]);
		setCod_us_nasc(dados[20]);
		setUf_nasc(dados[21]);
		setId_st_conclusao(Integer.parseInt(dados[22]));
		setAno_conclusao(Integer.parseInt(dados[23]));
		setId_tp_esc(Integer.parseInt(dados[24]));
		setId_in_tp_ensino(Integer.parseInt(dados[25]));
		setId_tp_estado_civil(Integer.parseInt(dados[26]));
		setId_tp_cor_raca(Integer.parseInt(dados[27]));
		setIn_baixa_visao(Integer.parseInt(dados[28]));
		setIn_cegueira(Integer.parseInt(dados[29]));
		setIn_surdez(Integer.parseInt(dados[30]));
		setIn_def_auditiva(Integer.parseInt(dados[31]));
		setIn_surdo_cegueira(Integer.parseInt(dados[32]));
		setIn_def_fisica(Integer.parseInt(dados[33]));
		setIn_def_mental(Integer.parseInt(dados[34]));
		setIn_deficit_atencao(Integer.parseInt(dados[35]));
		setIn_dislexia(Integer.parseInt(dados[36]));
		setIn_gestante(Integer.parseInt(dados[37]));
		setIn_lactante(Integer.parseInt(dados[38]));
		setIn_idoso(Integer.parseInt(dados[39]));
		setIn_autismo(Integer.parseInt(dados[40]));
		setIn_sabatista(Integer.parseInt(dados[41]));
		setIn_braile(Integer.parseInt(dados[42]));
		setIn_ampliada_24(Integer.parseInt(dados[43]));
		setIn_ampliada_18(Integer.parseInt(dados[44]));
		setIn_ledor(Integer.parseInt(dados[45]));
		setIn_acesso(Integer.parseInt(dados[46]));
		setIn_transcricao(Integer.parseInt(dados[47]));
		setIn_libras(Integer.parseInt(dados[48]));
		setIn_leitura_labial(Integer.parseInt(dados[49]));
		setIn_mesa_cadeira_rodas(Integer.parseInt(dados[50]));
		setIn_mesa_cadeira_separada(Integer.parseInt(dados[51]));
		setIn_apoio_perna(Integer.parseInt(dados[52]));
		setIn_guia_interprete(Integer.parseInt(dados[53]));
		
	}

	
	
	
	public int getIn_mesa_cadeira_separada() {
		return in_mesa_cadeira_separada;
	}

	public void setIn_mesa_cadeira_separada(int in_mesa_cadeira_separada) {
		this.in_mesa_cadeira_separada = in_mesa_cadeira_separada;
	}

	public int getIn_braile() {
		return in_braile;
	}
	
	public void setIn_braile(int in_braile) {
		this.in_braile = in_braile;
	}

	@Override
	public String toString() {
		return "Aluno [id_nu_insc=" + id_nu_insc + ", nu_ano=" + nu_ano + ", cod_mun_res=" + cod_mun_res
				+ ", nome_mun_res=" + nome_mun_res + ", cod_uf_res=" + cod_uf_res + ", uf_res=" + uf_res
				+ ", in_estuda_cl_hosp=" + in_estuda_cl_hosp + ", idade=" + idade + ", id_sexo=" + id_sexo
				+ ", id_nacionalidade=" + id_nacionalidade + ", cod_mun_nasc=" + cod_mun_nasc + ", cod_us_nasc="
				+ cod_us_nasc + ", uf_nasc=" + uf_nasc + ", id_st_conclusao=" + id_st_conclusao + ", ano_conclusao="
				+ ano_conclusao + ", id_tp_esc=" + id_tp_esc + ", id_in_tp_ensino=" + id_in_tp_ensino
				+ ", id_tp_estado_civil=" + id_tp_estado_civil + ", id_tp_cor_raca=" + id_tp_cor_raca + ", id_cod_esc="
				+ id_cod_esc + ", in_baixa_visao=" + in_baixa_visao + ", in_cegueira=" + in_cegueira + ", in_surdez="
				+ in_surdez + ", in_def_auditiva=" + in_def_auditiva + ", in_surdo_cegueira=" + in_surdo_cegueira
				+ ", in_def_fisica=" + in_def_fisica + ", in_def_mental=" + in_def_mental + ", in_deficit_atencao="
				+ in_deficit_atencao + ", in_dislexia=" + in_dislexia + ", in_gestante=" + in_gestante
				+ ", in_lactante=" + in_lactante + ", in_idoso=" + in_idoso + ", in_autismo=" + in_autismo
				+ ", in_sabatista=" + in_sabatista + ", in_braile=" + in_braile + ", in_ampliada_24=" + in_ampliada_24
				+ ", in_ampliada_18=" + in_ampliada_18 + ", in_ledor=" + in_ledor + ", in_acesso=" + in_acesso
				+ ", in_transcricao=" + in_transcricao + ", in_libras=" + in_libras + ", in_leitura_labial="
				+ in_leitura_labial + ", in_mesa_cadeira_rodas=" + in_mesa_cadeira_rodas + ", in_mesa_cadeira_separada="
				+ in_mesa_cadeira_separada + ", in_apoio_perna=" + in_apoio_perna + ", in_guia_interprete="
				+ in_guia_interprete + "]";
	}

	public int getIn_ampliada_24() {
		return in_ampliada_24;
	}




	public void setIn_ampliada_24(int in_ampliada_24) {
		this.in_ampliada_24 = in_ampliada_24;
	}




	public int getIn_ampliada_18() {
		return in_ampliada_18;
	}




	public void setIn_ampliada_18(int in_ampliada_18) {
		this.in_ampliada_18 = in_ampliada_18;
	}




	public int getIn_ledor() {
		return in_ledor;
	}




	public void setIn_ledor(int in_ledor) {
		this.in_ledor = in_ledor;
	}




	public int getIn_acesso() {
		return in_acesso;
	}




	public void setIn_acesso(int in_acesso) {
		this.in_acesso = in_acesso;
	}




	public int getIn_transcricao() {
		return in_transcricao;
	}




	public void setIn_transcricao(int in_transcricao) {
		this.in_transcricao = in_transcricao;
	}




	public int getIn_libras() {
		return in_libras;
	}




	public void setIn_libras(int in_libras) {
		this.in_libras = in_libras;
	}




	public int getIn_leitura_labial() {
		return in_leitura_labial;
	}




	public void setIn_leitura_labial(int in_leitura_labial) {
		this.in_leitura_labial = in_leitura_labial;
	}




	public int getIn_mesa_cadeira_rodas() {
		return in_mesa_cadeira_rodas;
	}




	public void setIn_mesa_cadeira_rodas(int in_mesa_cadeira_rodas) {
		this.in_mesa_cadeira_rodas = in_mesa_cadeira_rodas;
	}




	public int getIn_apoio_perna() {
		return in_apoio_perna;
	}




	public void setIn_apoio_perna(int in_apoio_perna) {
		this.in_apoio_perna = in_apoio_perna;
	}




	public int getIn_guia_interprete() {
		return in_guia_interprete;
	}




	public void setIn_guia_interprete(int in_guia_interprete) {
		this.in_guia_interprete = in_guia_interprete;
	}




	public int getIn_surdo_cegueira() {
		return in_surdo_cegueira;
	}



	public void setIn_surdo_cegueira(int in_surdo_cegueira) {
		this.in_surdo_cegueira = in_surdo_cegueira;
	}



	public int getIn_def_auditiva() {
		return in_def_auditiva;
	}



	public void setIn_def_auditiva(int in_def_auditiva) {
		this.in_def_auditiva = in_def_auditiva;
	}



	public int getIn_surdez() {
		return in_surdez;
	}



	public void setIn_surdez(int in_surdez) {
		this.in_surdez = in_surdez;
	}



	public int getId_nacionalidade() {
		return id_nacionalidade;
	}



	public void setId_nacionalidade(int id_nacionalidade) {
		this.id_nacionalidade = id_nacionalidade;
	}



	public int getIn_baixa_visao() {
		return in_baixa_visao;
	}



	public void setIn_baixa_visao(int in_baixa_visao) {
		this.in_baixa_visao = in_baixa_visao;
	}



	public int getIn_cegueira() {
		return in_cegueira;
	}



	public void setIn_cegueira(int in_cegueira) {
		this.in_cegueira = in_cegueira;
	}



	public int getIn_def_fisica() {
		return in_def_fisica;
	}



	public void setIn_def_fisica(int in_def_fisica) {
		this.in_def_fisica = in_def_fisica;
	}



	public int getIn_def_mental() {
		return in_def_mental;
	}



	public void setIn_def_mental(int in_def_mental) {
		this.in_def_mental = in_def_mental;
	}



	public int getIn_deficit_atencao() {
		return in_deficit_atencao;
	}



	public void setIn_deficit_atencao(int in_deficit_atencao) {
		this.in_deficit_atencao = in_deficit_atencao;
	}



	public int getIn_dislexia() {
		return in_dislexia;
	}



	public void setIn_dislexia(int in_dislexia) {
		this.in_dislexia = in_dislexia;
	}



	public int getIn_gestante() {
		return in_gestante;
	}



	public void setIn_gestante(int in_gestante) {
		this.in_gestante = in_gestante;
	}



	public int getIn_lactante() {
		return in_lactante;
	}



	public void setIn_lactante(int in_lactante) {
		this.in_lactante = in_lactante;
	}



	public int getIn_idoso() {
		return in_idoso;
	}



	public void setIn_idoso(int in_idoso) {
		this.in_idoso = in_idoso;
	}



	public int getIn_autismo() {
		return in_autismo;
	}



	public void setIn_autismo(int in_autismo) {
		this.in_autismo = in_autismo;
	}



	public int getIn_sabatista() {
		return in_sabatista;
	}



	public void setIn_sabatista(int in_sabatista) {
		this.in_sabatista = in_sabatista;
	}



	public String getNu_ano() {
		return nu_ano;
	}
	public void setNu_ano(String nu_ano) {
		this.nu_ano = nu_ano;
	}
	public String getId_nu_insc() {
		return id_nu_insc;
	}
	public void setId_nu_insc(String id_nu_insc) {
		this.id_nu_insc = id_nu_insc;
	}
	public int getCod_mun_res() {
		return cod_mun_res;
	}
	public void setCod_mun_res(int cod_mun_res) {
		this.cod_mun_res = cod_mun_res;
	}
	public String getNome_mun_res() {
		return nome_mun_res;
	}
	public void setNome_mun_res(String nome_mun_res) {
		this.nome_mun_res = nome_mun_res;
	}
	public String getCod_uf_res() {
		return cod_uf_res;
	}
	public void setCod_uf_res(String cod_uf_res) {
		this.cod_uf_res = cod_uf_res;
	}
	public String getUf_res() {
		return uf_res;
	}
	public void setUf_res(String uf_res) {
		this.uf_res = uf_res;
	}
	public int getIn_estuda_cl_hosp() {
		return in_estuda_cl_hosp;
	}
	public void setIn_estuda_cl_hosp(int in_estuda_cl_hosp) {
		this.in_estuda_cl_hosp = in_estuda_cl_hosp;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getId_sexo() {
		return id_sexo;
	}
	public void setId_sexo(String id_sexo) {
		this.id_sexo = id_sexo;
	}
	public int getId_nacionaldiade() {
		return id_nacionalidade;
	}
	public void setId_nacionaldiade(int id_nacionaldiade) {
		this.id_nacionalidade = id_nacionaldiade;
	}
	public int getCod_mun_nasc() {
		return cod_mun_nasc;
	}
	public void setCod_mun_nasc(int cod_mun_nasc) {
		this.cod_mun_nasc = cod_mun_nasc;
	}
	public String getCod_us_nasc() {
		return cod_us_nasc;
	}
	public void setCod_us_nasc(String cod_us_nasc) {
		this.cod_us_nasc = cod_us_nasc;
	}
	public String getUf_nasc() {
		return uf_nasc;
	}
	public void setUf_nasc(String uf_nasc) {
		this.uf_nasc = uf_nasc;
	}
	public int getId_st_conclusao() {
		return id_st_conclusao;
	}
	public void setId_st_conclusao(int id_st_conclusao) {
		this.id_st_conclusao = id_st_conclusao;
	}
	public int getAno_conclusao() {
		return ano_conclusao;
	}
	public void setAno_conclusao(int ano_conclusao) {
		this.ano_conclusao = ano_conclusao;
	}
	public int getId_tp_esc() {
		return id_tp_esc;
	}
	public void setId_tp_esc(int id_tp_esc) {
		this.id_tp_esc = id_tp_esc;
	}
	public int getId_in_tp_ensino() {
		return id_in_tp_ensino;
	}
	public void setId_in_tp_ensino(int id_in_tp_ensino) {
		this.id_in_tp_ensino = id_in_tp_ensino;
	}
	public int getId_tp_estado_civil() {
		return id_tp_estado_civil;
	}
	public void setId_tp_estado_civil(int id_tp_estado_civil) {
		this.id_tp_estado_civil = id_tp_estado_civil;
	}
	public int getId_tp_cor_raca() {
		return id_tp_cor_raca;
	}
	public void setId_tp_cor_raca(int id_tp_cor_raca) {
		this.id_tp_cor_raca = id_tp_cor_raca;
	}
	public int getId_cod_esc() {
		return id_cod_esc;
	}
	public void setId_cod_esc(int id_cod_esc) {
		this.id_cod_esc = id_cod_esc;
	}
}
