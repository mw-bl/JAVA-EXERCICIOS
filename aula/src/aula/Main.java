package aula;

public class Main {

	public static void main(String[] args) {
		funcionario f1= new funcionario();
		Departamento d1 = new Departamento();
		
		d1.cadastrarDepartamento(121, "INFORMÁTICA");
		f1.cadastrarFuncionario("MARCOS WILLIAN", 3500, "15/08/2023", "2001058796", d1);
		
		f1.imprimirFuncionario();
		f1.bonifica(2000);
		f1.imprimirFuncionario();
		f1.demitir();
		f1.situacaoFuncionario();
	}

}
