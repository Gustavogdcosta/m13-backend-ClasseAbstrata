package br.com.m13Entrega;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica Pessoa1 = new PessoaFisica();
		Pessoa1.setNomeRazaoSocial("Joao");
		Pessoa1.setCpfCNPJ("xxx.xxx.xxx-xx");
		Pessoa1.setRendaMensal(100d);
		Pessoa1.setGastosMensais("Filhos + Aluguel");
		imprimir(Pessoa1);
		System.out.println("Gastos mensais de " + Pessoa1.getNomeRazaoSocial() + " é com: "  + Pessoa1.getGastosMensais());
			
		PessoaJuridica Pessoa2 = new PessoaJuridica();
		Pessoa2.setNomeRazaoSocial("JS Eng");
		Pessoa2.setCpfCNPJ("xx.xxx.xxx/0001-xx");
		Pessoa2.setRendaMensal(300d);
		Pessoa2.setCustos("Funcionarios");
		imprimir(Pessoa2);
		System.out.println("Gastos mensais de " + Pessoa2.getNomeRazaoSocial() + " é com: "  + Pessoa2.getCustos());
	}
	
	public static void imprimir (Pessoa pessoa) {
		System.out.println(pessoa.getNomeRazaoSocial() + ", inscrito sob numero " + pessoa.getCpfCNPJ() + ", tem renda de " + pessoa.getRendaMensal());
	}

}
