package model;

public class Motocicleta extends Veiculo {

    private Boolean controlTracao, abs, piltAut, cidade, estrada, sport, offRoad;

    public Motocicleta(String marca, String modelo, String renavam, String placa, int anoFabricacao, int anoModelo,
            Double capacidadeTanque, Double valorDiaria, Double valorDiariaEmpresarial,
            Double valorMensal, Boolean controlTracao, Boolean abs, Boolean piltAut, Boolean cidade, Boolean estrada,
            Boolean sport, Boolean offRoad) {
        super(marca, modelo, renavam, placa, anoFabricacao, anoModelo, capacidadeTanque, valorDiaria,
                valorDiariaEmpresarial, valorMensal);
        this.controlTracao = controlTracao;
        this.abs = abs;
        this.piltAut = piltAut;
        this.cidade = cidade;
        this.estrada = estrada;
        this.sport = sport;
        this.offRoad = offRoad;
    }

	public Boolean getControlTracao() {
		return controlTracao;
	}

	public void setControlTracao(Boolean controlTracao) {
		this.controlTracao = controlTracao;
	}

	public Boolean getAbs() {
		return abs;
	}

	public void setAbs(Boolean abs) {
		this.abs = abs;
	}

	public Boolean getPiltAut() {
		return piltAut;
	}

	public void setPiltAut(Boolean piltAut) {
		this.piltAut = piltAut;
	}

	public Boolean getCidade() {
		return cidade;
	}

	public void setCidade(Boolean cidade) {
		this.cidade = cidade;
	}

	public Boolean getEstrada() {
		return estrada;
	}

	public void setEstrada(Boolean estrada) {
		this.estrada = estrada;
	}

	public Boolean getSport() {
		return sport;
	}

	public void setSport(Boolean sport) {
		this.sport = sport;
	}

	public Boolean getOffRoad() {
		return offRoad;
	}

	public void setOffRoad(Boolean offRoad) {
		this.offRoad = offRoad;
	}
}
