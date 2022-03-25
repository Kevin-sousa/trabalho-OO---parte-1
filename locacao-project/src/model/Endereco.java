package model;

public class Endereco {

    private String rua, numero, complemento, bairro, cidade, estado, CEP;

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado,
            String CEP) {

        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;

    }

    public Endereco(String rua, String numero, String bairro, String cidade, String estado,
            String CEP) {

        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.complemento = "";
    }

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}
}
