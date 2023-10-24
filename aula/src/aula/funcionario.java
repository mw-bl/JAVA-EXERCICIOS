package aula;

public class funcionario {
	String nome;
	double salario;
	String data_entrada;
	String RG;
	boolean situacao;
	Departamento departamento;


	public void cadastrarFuncionario(String nome, double salario, String data, String RG, Departamento dep) {
		this.nome = nome;
		this.salario = salario;
		this.data_entrada = data;
		this.RG = RG;
		this.departamento = dep;
		this.situacao = true;
	}
	
	public void bonifica(double bonus) {
		this.salario = this.salario + bonus;
		System.out.println("VOCÊ RECEBEU UM BÔNUS");
	}
	
	public void imprimirFuncionario() {
		System.out.println("\n---- DADOS DO FUNCIONÁRIO ----");
		System.out.println("NOME:" + this.nome);
		System.out.println("SALARIO:" + this.salario);
		System.out.println("RG:" + this.RG);
		System.out.println("DEPARTAMENTO:" + this.departamento.descricao);
	}

	public void demitir() {
		this.situacao = false;
		System.out.println("FUNCIONÁRIO DEMITIDO");
	}
	
	public void situacaoFuncionario() {
		if(this.situacao == true) {
			System.out.println("SITUAÇÃO DO FUNCIONÁRIO ATIVA");
		} else {
			System.out.println("FUNCIONÁRIO FOI INATIVADO");
		}
	}

	
}