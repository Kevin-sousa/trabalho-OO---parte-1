package model;

import java.util.Date;

import enums.TipoDiaria;

public class Reserva {

    private Date inicio, fim;
    private int horaInicio, minutoInicio;
    private int horaFim, minutoFim;
    private String horaInicioStr, horaFimStr;

    private int numeroReserva;
    private String nomeLocatario;
    private PessoaFisica responsavel;
    private int qtdDiarias;
    private TipoDiaria diaria;

    private Double valorTotal;
    private Double valorDiaria;
    private Double valorSeguroTerceiros;
    private Double valorSeguroProprio;
    private Double valorImpostos;

    private Veiculo veiculo;

    public Reserva(Date inicio, Date fim, String horaInicioStr, String horaFimStr, int numeroReserva,
            String nomeLocatario, PessoaFisica responsavel, int qtdDiarias, TipoDiaria diaria, Double valorTotal,
            Double valorDiaria, Double valorSeguroTerceiros, Double valorSeguroProprio, Double valorImpostos,
            Veiculo veiculo) {
        this.inicio = inicio;
        this.fim = fim;
        this.horaInicioStr = horaInicioStr;
        this.horaFimStr = horaFimStr;
        this.numeroReserva = numeroReserva;
        this.nomeLocatario = nomeLocatario;
        this.responsavel = responsavel;
        this.qtdDiarias = qtdDiarias;
        this.diaria = diaria;
        this.valorTotal = valorTotal;
        this.valorDiaria = valorDiaria;
        this.valorSeguroTerceiros = valorSeguroTerceiros;
        this.valorSeguroProprio = valorSeguroProprio;
        this.valorImpostos = valorImpostos;
        this.veiculo = veiculo;
    }

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getMinutoInicio() {
		return minutoInicio;
	}

	public void setMinutoInicio(int minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

	public int getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}

	public int getMinutoFim() {
		return minutoFim;
	}

	public void setMinutoFim(int minutoFim) {
		this.minutoFim = minutoFim;
	}

	public String getHoraInicioStr() {
		return horaInicioStr;
	}

	public void setHoraInicioStr(String horaInicioStr) {
		this.horaInicioStr = horaInicioStr;
	}

	public String getHoraFimStr() {
		return horaFimStr;
	}

	public void setHoraFimStr(String horaFimStr) {
		this.horaFimStr = horaFimStr;
	}

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public String getNomeLocatario() {
		return nomeLocatario;
	}

	public void setNomeLocatario(String nomeLocatario) {
		this.nomeLocatario = nomeLocatario;
	}

	public PessoaFisica getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}

	public int getQtdDiarias() {
		return qtdDiarias;
	}

	public void setQtdDiarias(int qtdDiarias) {
		this.qtdDiarias = qtdDiarias;
	}

	public TipoDiaria getDiaria() {
		return diaria;
	}

	public void setDiaria(TipoDiaria diaria) {
		this.diaria = diaria;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Double getValorSeguroTerceiros() {
		return valorSeguroTerceiros;
	}

	public void setValorSeguroTerceiros(Double valorSeguroTerceiros) {
		this.valorSeguroTerceiros = valorSeguroTerceiros;
	}

	public Double getValorSeguroProprio() {
		return valorSeguroProprio;
	}

	public void setValorSeguroProprio(Double valorSeguroProprio) {
		this.valorSeguroProprio = valorSeguroProprio;
	}

	public Double getValorImpostos() {
		return valorImpostos;
	}

	public void setValorImpostos(Double valorImpostos) {
		this.valorImpostos = valorImpostos;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
