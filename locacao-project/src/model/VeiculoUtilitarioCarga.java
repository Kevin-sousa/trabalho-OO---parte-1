package model;

import enums.TipoVeiculoCarga;

public class VeiculoUtilitarioCarga extends VeiculoUtilitario {
    private Double pesoVazio;
    private Double tamCompartimentoLitros;
    private Double capacidadeCarga;

    public VeiculoUtilitarioCarga(String marca, String modelo, String renavam, String placa, int anoFabricacao,
            int anoModelo, Double capacidadeTanque, Double valorDiaria,
            Double valorDiariaEmpresarial, Double valorMensal, TipoVeiculoCarga tipoVeiculo, Double pesoVazio,
            Double tamCompartimentoLitros, Double capacidadeCarga) {
        super(marca, modelo, renavam, placa, anoFabricacao, anoModelo, capacidadeTanque, valorDiaria,
                valorDiariaEmpresarial, valorMensal, tipoVeiculo);
        this.pesoVazio = pesoVazio;
        this.tamCompartimentoLitros = tamCompartimentoLitros;
        this.capacidadeCarga = capacidadeCarga;
    }

	public Double getPesoVazio() {
		return pesoVazio;
	}

	public void setPesoVazio(Double pesoVazio) {
		this.pesoVazio = pesoVazio;
	}

	public Double getTamCompartimentoLitros() {
		return tamCompartimentoLitros;
	}

	public void setTamCompartimentoLitros(Double tamCompartimentoLitros) {
		this.tamCompartimentoLitros = tamCompartimentoLitros;
	}

	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(Double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

}
