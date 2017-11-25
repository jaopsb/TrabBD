package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESCOLAS")
public class Escolas {
	@Id
	@Column(name = "id_cod_esc", nullable = false)
	private int id_cod_esc;
	private int cod_mun_esc;
	private String nome_mun_esc;
	private String cod_uf_esc;
	private String uf_esc;
	private int id_dependencia_adm_esc;
	private int id_localizacao_esc;
	private int sit_func_esc;
	
	
	public Escolas(String dados[]) {
		setId_cod_esc(Integer.parseInt(dados[7]));
		setCod_mun_esc(Integer.parseInt(dados[8]));
		setNome_mun_esc(dados[9]);
		setCod_uf_esc(dados[10]);
		setUf_esc(dados[11]);
		setId_dependencia_adm_esc(Integer.parseInt(dados[12]));
		setId_localizacao_esc(Integer.parseInt(dados[13]));
		setSit_func_esc(Integer.parseInt(dados[14]));
	}
	
	
	public String getUf_esc() {
		return uf_esc;
	}

	public void setUf_esc(String uf_esc) {
		this.uf_esc = uf_esc;
	}

	public int getCod_esc() {
		return id_cod_esc;
	}
	public void setId_cod_esc(int id_cod_esc) {
		this.id_cod_esc = id_cod_esc;
	}
	public int getCod_mun_esc() {
		return cod_mun_esc;
	}
	public void setCod_mun_esc(int cod_mun_esc) {
		this.cod_mun_esc = cod_mun_esc;
	}
	public String getNome_mun_esc() {
		return nome_mun_esc;
	}
	public void setNome_mun_esc(String nome_mun_esc) {
		this.nome_mun_esc = nome_mun_esc;
	}
	public String getCod_uf_esc() {
		return cod_uf_esc;
	}
	public void setCod_uf_esc(String cod_uf_esc) {
		this.cod_uf_esc = cod_uf_esc;
	}
	public int getId_dependencia_adm_esc() {
		return id_dependencia_adm_esc;
	}
	public void setId_dependencia_adm_esc(int id_dependencia_adm_esc) {
		this.id_dependencia_adm_esc = id_dependencia_adm_esc;
	}
	public int getId_localizacao_esc() {
		return id_localizacao_esc;
	}
	public void setId_localizacao_esc(int id_localizacao_esc) {
		this.id_localizacao_esc = id_localizacao_esc;
	}
	public int getSit_func_esc() {
		return sit_func_esc;
	}
	public void setSit_func_esc(int sit_func_esc) {
		this.sit_func_esc = sit_func_esc;
	}
	
	
	
	
}
