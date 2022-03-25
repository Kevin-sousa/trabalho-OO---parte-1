package model;

import java.util.Objects;

public abstract class Veiculo {
    private String marca, modelo, renavam, placa;

    private int anoFabricacao, anoModelo;

    private Double capacidadeTanque, valorDiaria, valorDiariaReduzida, valorDiariaEmpresarial, valorMensal;

    public Veiculo(String marca, String modelo, String renavam, String placa, int anoFabricacao, int anoModelo,
            Double capacidadeTanque, Double valorDiaria, Double valorDiariaEmpresarial,
            Double valorMensal) {
        this.marca = marca;
        this.modelo = modelo;
        this.renavam = renavam;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.capacidadeTanque = capacidadeTanque;
        this.valorDiaria = valorDiaria;
        this.valorDiariaReduzida = valorDiaria * 0.9;
        this.valorDiariaEmpresarial = valorDiariaEmpresarial;
        this.valorMensal = valorMensal;
    }

	@Override
	public int hashCode() {
		return Objects.hash(anoFabricacao, anoModelo, capacidadeTanque, marca, modelo, placa, renavam, valorDiaria,
				valorDiariaEmpresarial, valorDiariaReduzida, valorMensal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return anoFabricacao == other.anoFabricacao && anoModelo == other.anoModelo
				&& Objects.equals(capacidadeTanque, other.capacidadeTanque) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(placa, other.placa)
				&& Objects.equals(renavam, other.renavam) && Objects.equals(valorDiaria, other.valorDiaria)
				&& Objects.equals(valorDiariaEmpresarial, other.valorDiariaEmpresarial)
				&& Objects.equals(valorDiariaReduzida, other.valorDiariaReduzida)
				&& Objects.equals(valorMensal, other.valorMensal);
	}

}
