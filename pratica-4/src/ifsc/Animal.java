package ifsc;

public class Animal {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public Integer getNumerodepatas() {
		return numerodepatas;
	}

	public void setNumerodepatas(Integer numerodepatas) {
		this.numerodepatas = numerodepatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEcossistema() {
		return ecossistema;
	}

	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}

	private String raca;
	private Float comprimento;
	private Integer numerodepatas;
	private String cor;
	private String ecossistema;
	
	public void caminha () {
		
	}

}
