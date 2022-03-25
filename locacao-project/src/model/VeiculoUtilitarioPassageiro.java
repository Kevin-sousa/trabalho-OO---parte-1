package model;

import enums.TipoVeiculoCarga;

public class VeiculoUtilitarioPassageiro extends VeiculoUtilitario {

    private Double capacidadeCarga;
    private Boolean ac, direcaoHidraulica, tv;

    public VeiculoUtilitarioPassageiro(String marca, String modelo, String renavam, String placa, int anoFabricacao,
            int anoModelo, Double capacidadeTanque, Double valorDiaria,
            Double valorDiariaEmpresarial, Double valorMensal, TipoVeiculoCarga tipoVeiculo, Double capacidadeCarga,
            Boolean ac, Boolean direcaoHidraulica, Boolean tv) {
        super(marca, modelo, renavam, placa, anoFabricacao, anoModelo, capacidadeTanque, valorDiaria,
                valorDiariaEmpresarial, valorMensal, tipoVeiculo);
        this.capacidadeCarga = capacidadeCarga;
        this.ac = ac;
        this.direcaoHidraulica = direcaoHidraulica;
        this.tv = tv;
    }

	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(Double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public Boolean getAc() {
		return ac;
	}

	public void setAc(Boolean ac) {
		this.ac = ac;
	}

	public Boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(Boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public Boolean getTv() {
		return tv;
	}

	public void setTv(Boolean tv) {
		this.tv = tv;
	}

}
