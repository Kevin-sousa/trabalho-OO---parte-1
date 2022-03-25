package model;

public abstract class Locatario {
    private String email, telefone, nome;
    private Endereco endereco;

    public Locatario(String nome, String email, String telefone, Endereco endereco) {
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
