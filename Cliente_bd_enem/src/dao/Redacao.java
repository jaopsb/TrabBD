package dao;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="REDACAO")
public class Redacao {

	private String id_nu_insc;
	private int in_status_redacao;
	private double nu_nota_comp1;
	private double nu_nota_comp2;
	private double nu_nota_comp3;
	private double nu_nota_comp4;
	private double nu_nota_comp5;
	private double nu_nota_redacao;

	
	public Redacao(String[] dados) {
		setId_nu_insc(dados[0]);
		setIn_status_redacao(Integer.parseInt(dados[83]));
		setNu_nota_comp1(Double.parseDouble(dados[84]));
		setNu_nota_comp2(Double.parseDouble(dados[85]));
		setNu_nota_comp3(Double.parseDouble(dados[86]));
		setNu_nota_comp4(Double.parseDouble(dados[87]));
		setNu_nota_comp5(Double.parseDouble(dados[88]));
		setNu_nota_redacao(Double.parseDouble(dados[89]));

	}

	
	
	public double getNu_nota_comp5() {
		return nu_nota_comp5;
	}

	public void setNu_nota_comp5(double nu_nota_comp5) {
		this.nu_nota_comp5 = nu_nota_comp5;
	}

	public String getId_nu_insc() {
		return id_nu_insc;
	}

	public void setId_nu_insc(String id_nu_insc) {
		this.id_nu_insc = id_nu_insc;
	}

	public int getIn_status_redacao() {
		return in_status_redacao;
	}

	public void setIn_status_redacao(int in_status_redacao) {
		this.in_status_redacao = in_status_redacao;
	}

	public double getNu_nota_comp1() {
		return nu_nota_comp1;
	}

	public void setNu_nota_comp1(double nu_nota_comp1) {
		this.nu_nota_comp1 = nu_nota_comp1;
	}

	public double getNu_nota_comp2() {
		return nu_nota_comp2;
	}

	public void setNu_nota_comp2(double nu_nota_comp2) {
		this.nu_nota_comp2 = nu_nota_comp2;
	}

	public double getNu_nota_comp3() {
		return nu_nota_comp3;
	}

	public void setNu_nota_comp3(double nu_nota_comp3) {
		this.nu_nota_comp3 = nu_nota_comp3;
	}

	public double getNu_nota_comp4() {
		return nu_nota_comp4;
	}

	public void setNu_nota_comp4(double nu_nota_comp4) {
		this.nu_nota_comp4 = nu_nota_comp4;
	}

	public double getNu_nota_redacao() {
		return nu_nota_redacao;
	}

	public void setNu_nota_redacao(double nu_nota_redacao) {
		this.nu_nota_redacao = nu_nota_redacao;
	}

}
