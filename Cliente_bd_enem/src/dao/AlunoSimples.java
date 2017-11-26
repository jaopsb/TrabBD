package dao;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ALUNOS_SIMPLES")
public class AlunoSimples {
	private String id_nu_insc;
	private String id_sexo;
	private String uf_res;
	private String uf_prova;
	private double nota_cn;
	private double nota_ch;
	private double nota_lc;
	private double nota_mt;
	private double nu_nota_redacao;
	
	
	
	public String getUf_prova() {
		return uf_prova;
	}
	public void setUf_prova(String uf_prova) {
		this.uf_prova = uf_prova;
	}
	public String getId_nu_insc() {
		return id_nu_insc;
	}
	public void setId_nu_insc(String id_nu_insc) {
		this.id_nu_insc = id_nu_insc;
	}
	public String getId_sexo() {
		return id_sexo;
	}
	public void setId_sexo(String id_sexo) {
		this.id_sexo = id_sexo;
	}
	public String getUf_res() {
		return uf_res;
	}
	public void setUf_res(String uf_res) {
		this.uf_res = uf_res;
	}
	public double getNota_cn() {
		return nota_cn;
	}
	public void setNota_cn(double nota_cn) {
		this.nota_cn = nota_cn;
	}
	public double getNota_ch() {
		return nota_ch;
	}
	public void setNota_ch(double nota_ch) {
		this.nota_ch = nota_ch;
	}
	public double getNota_lc() {
		return nota_lc;
	}
	public void setNota_lc(double nota_lc) {
		this.nota_lc = nota_lc;
	}
	public double getNota_mt() {
		return nota_mt;
	}
	public void setNota_mt(double nota_mt) {
		this.nota_mt = nota_mt;
	}
	public double getNu_nota_redacao() {
		return nu_nota_redacao;
	}
	public void setNu_nota_redacao(double nu_nota_redacao) {
		this.nu_nota_redacao = nu_nota_redacao;
	}
	
	
	
}
