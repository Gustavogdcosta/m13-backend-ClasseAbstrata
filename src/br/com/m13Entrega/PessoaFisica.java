package br.com.m13Entrega;

public class PessoaFisica extends Pessoa{

	private String GastosMensais;
	
	@Override
	public String Gastos() {
		// TODO Auto-generated method stub
		return GastosMensais;
	}

	public String getGastosMensais() {
		return GastosMensais;
	}

	public void setGastosMensais(String gastosMensais) {
		GastosMensais = gastosMensais;
	}

	
	
	}

