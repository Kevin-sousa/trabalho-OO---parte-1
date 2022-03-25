package model;

import java.util.ArrayList;

public class PessoaJuridica extends Locatario {
    private String cnpj;
    private ArrayList<PessoaFisica> funcionarios;

    public PessoaJuridica(String nomeSocial, String email, String telefone, Endereco endereco,
            String cnpj, ArrayList<PessoaFisica> funcionarios) {
        super(nomeSocial, email, telefone, endereco);
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<PessoaFisica> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<PessoaFisica> funcionarios) {
		this.funcionarios = funcionarios;
	}
}