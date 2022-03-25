package model;

import enums.TipoVeiculoPasseio;

public class VeiculoPasseio extends Veiculo {
    private TipoVeiculoPasseio tipoVeiculo;
    private Boolean arCondicionado, direcaoHidraulica, automatico;

    public VeiculoPasseio(String marca, String modelo, String renavam, String placa, int anoFabricacao, int anoModelo,
            Double capacidadeTanque, Double valorDiaria, Double valorDiariaEmpresarial,
            Double valorMensal, TipoVeiculoPasseio tipoVeiculo, Boolean arCondicionado, Boolean direcaoHidraulica,
            Boolean automatico) {
        super(marca, modelo, renavam, placa, anoFabricacao, anoModelo, capacidadeTanque, valorDiaria,
                valorDiariaEmpresarial, valorMensal);
        this.tipoVeiculo = tipoVeiculo;
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
        this.automatico = automatico;
    }

	public TipoVeiculoPasseio getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculoPasseio tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public Boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(Boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public Boolean getAutomatico() {
		return automatico;
	}

	public void setAutomatico(Boolean automatico) {
		this.automatico = automatico;
	}

}
