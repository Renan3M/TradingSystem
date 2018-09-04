package negocio;

public class Endereco {
	private String rua;
	private String numeroCasa;
	private String bairro;
	private String cidade;
	private String estado;
	private String uf;
	
	public Endereco() {
		this.rua = "Rua/Av. São José ";
		this.numeroCasa = "90";
		this.bairro = "Centro";
		this.cidade = "Rio de Janeiro";
		this.estado = "Rio de Janeiro";
		this.uf = "RJ";
	}

	public Endereco(String rua, String numeroCasa, String bairro, String cidade, String estado, String uf) {
		this();
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.uf = uf;
	}
	
	public void divulgar() {
		System.out.printf(":: Endereço ::\n %s, %s - %s, %s, %s - %s",
				rua,
				numeroCasa,
				bairro,
				cidade,
				estado,
				uf
				);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
