package dao;

public class Prova {

	private String id_nu_insc;
	private int cod_mun_prova;
	private String nome_mun_prova;
	private String cod_uf_prova;
	private String uf_prova;
	private int in_presenca_cn;
	private int in_presenca_ch;
	private int in_presenca_lc;
	private int in_presenca_mt;
	private int id_prova_cn;
	private int id_prova_ch;
	private int id_prova_lc;
	private int id_prova_mt;
	private double nota_cn;
	private double nota_ch;
	private double nota_lc;
	private double nota_mt;
	private String tx_respostas_cn;
	private String tx_respostas_ch;
	private String tx_respostas_lc;
	private String tx_respostas_mt;
	private int tp_lingua;

	public Prova(String[] dados) {
		setId_nu_insc(dados[0]);
		setCod_mun_prova(Integer.parseInt(dados[58]));
		setNome_mun_prova(dados[59]);
		setCod_uf_prova(dados[60]);
		setUf_prova(dados[61]);
		setIn_presenca_cn(Integer.parseInt(dados[62]));
		setIn_presenca_ch(Integer.parseInt(dados[63]));
		setIn_presenca_lc(Integer.parseInt(dados[64]));
		setIn_presenca_mt(Integer.parseInt(dados[65]));
		setId_prova_cn(Integer.parseInt(dados[66]));
		setId_prova_ch(Integer.parseInt(dados[67]));
		setId_prova_lc(Integer.parseInt(dados[68]));
		setId_prova_mt(Integer.parseInt(dados[69]));
		setNota_cn(Double.parseDouble(dados[70]));
		setNota_ch(Double.parseDouble(dados[71]));
		setNota_lc(Double.parseDouble(dados[72]));
		setNota_mt(Double.parseDouble(dados[73]));
		setTx_respostas_cn(dados[74]);
		setTx_respostas_ch(dados[75]);
		setTx_respostas_lc(dados[76]);
		setTx_respostas_mt(dados[77]);
		setTp_lingua(Integer.parseInt(dados[78]));

	}


	public String getId_nu_insc() {
		return id_nu_insc;
	}

	public void setId_nu_insc(String id_nu_insc) {
		this.id_nu_insc = id_nu_insc;
	}

	public int getCod_mun_prova() {
		return cod_mun_prova;
	}

	public void setCod_mun_prova(int cod_mun_prova) {
		this.cod_mun_prova = cod_mun_prova;
	}

	public String getNome_mun_prova() {
		return nome_mun_prova;
	}

	public void setNome_mun_prova(String nome_mun_prova) {
		this.nome_mun_prova = nome_mun_prova;
	}

	public String getCod_uf_prova() {
		return cod_uf_prova;
	}

	public void setCod_uf_prova(String cod_uf_prova) {
		this.cod_uf_prova = cod_uf_prova;
	}

	public String getUf_prova() {
		return uf_prova;
	}

	public void setUf_prova(String uf_prova) {
		this.uf_prova = uf_prova;
	}

	public int getIn_presenca_cn() {
		return in_presenca_cn;
	}

	public void setIn_presenca_cn(int in_presenca_cn) {
		this.in_presenca_cn = in_presenca_cn;
	}

	public int getIn_presenca_ch() {
		return in_presenca_ch;
	}

	public void setIn_presenca_ch(int in_presenca_ch) {
		this.in_presenca_ch = in_presenca_ch;
	}

	public int getIn_presenca_lc() {
		return in_presenca_lc;
	}

	public void setIn_presenca_lc(int in_presenca_lc) {
		this.in_presenca_lc = in_presenca_lc;
	}

	public int getIn_presenca_mt() {
		return in_presenca_mt;
	}

	public void setIn_presenca_mt(int in_presenca_t) {
		this.in_presenca_mt = in_presenca_t;
	}

	public int getId_prova_cn() {
		return id_prova_cn;
	}

	public void setId_prova_cn(int id_prova_cn) {
		this.id_prova_cn = id_prova_cn;
	}

	public int getId_prova_ch() {
		return id_prova_ch;
	}

	public void setId_prova_ch(int id_prova_ch) {
		this.id_prova_ch = id_prova_ch;
	}

	public int getId_prova_lc() {
		return id_prova_lc;
	}

	public void setId_prova_lc(int id_prova_lc) {
		this.id_prova_lc = id_prova_lc;
	}

	public int getId_prova_mt() {
		return id_prova_mt;
	}

	public void setId_prova_mt(int id_prova_mt) {
		this.id_prova_mt = id_prova_mt;
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

	public String getTx_respostas_cn() {
		return tx_respostas_cn;
	}

	public void setTx_respostas_cn(String tx_respostas_cn) {
		this.tx_respostas_cn = tx_respostas_cn;
	}

	public String getTx_respostas_ch() {
		return tx_respostas_ch;
	}

	public void setTx_respostas_ch(String tx_respostas_ch) {
		this.tx_respostas_ch = tx_respostas_ch;
	}

	public String getTx_respostas_lc() {
		return tx_respostas_lc;
	}

	public void setTx_respostas_lc(String tx_respostas_lc) {
		this.tx_respostas_lc = tx_respostas_lc;
	}

	public String getTx_respostas_mt() {
		return tx_respostas_mt;
	}

	public void setTx_respostas_mt(String tx_respostas_mt) {
		this.tx_respostas_mt = tx_respostas_mt;
	}

	public int getTp_lingua() {
		return tp_lingua;
	}

	public void setTp_lingua(int tp_lingua) {
		this.tp_lingua = tp_lingua;
	}
}
