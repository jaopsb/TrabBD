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
