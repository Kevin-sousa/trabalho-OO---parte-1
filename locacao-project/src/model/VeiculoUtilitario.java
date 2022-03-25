package model;

import enums.TipoVeiculoCarga;

public abstract class VeiculoUtilitario extends Veiculo {
    private TipoVeiculoCarga tipoVeiculo;

    public VeiculoUtilitario(String marca, String modelo, String renavam, String placa, int anoFabricacao,
            int anoModelo, Double capacidadeTanque, Double valorDiaria,
            Double valorDiariaEmpresarial, Double valorMensal, TipoVeiculoCarga tipoVeiculo) {
        super(marca, modelo, renavam, placa, anoFabricacao, anoModelo, capacidadeTanque, valorDiaria,
                valorDiariaEmpresarial, valorMensal);
        this.tipoVeiculo = tipoVeiculo;
    }

	public TipoVeiculoCarga getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculoCarga tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

}
