package br.com.m13Entrega;

public abstract class Pessoa {
	
	private String cpfCNPJ;
	
	private String NomeRazaoSocial;
	
	private double RendaMensal;
	
	public abstract String Gastos();

	public String getCpfCNPJ() {
		return cpfCNPJ;
	}

	public void setCpfCNPJ(String cpfCNPJ) {
		this.cpfCNPJ = cpfCNPJ;
	}

	public String getNomeRazaoSocial() {
		return NomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		NomeRazaoSocial = nomeRazaoSocial;
	}

	public double getRendaMensal() {
		return RendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		RendaMensal = rendaMensal;
	}


}
