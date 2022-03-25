package model;

import enums.TipoEstadoCivil;

public class PessoaFisica extends Locatario {
    private String cpf;
    private TipoEstadoCivil estadoCivil;

    public PessoaFisica(String nomeCompleto, String email, String telefone, Endereco endereco,
            TipoEstadoCivil estadoCivil,
            String cpf) {
        super(nomeCompleto, email, telefone, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
