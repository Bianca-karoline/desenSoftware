package aula09;
public class Sistema {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("12345678911");
		Funcionario func2 = new Funcionario("12121212", 1200.00);
		func1.setNome("Bianca");
		func1.setUltimoCod();
		func1.setUltimoCod();
		func2.setNome("sla");
		System.out.println("F1: " + func1.getNome() +
				" ultimo cod: " + func1.getUltimoCod() +
				"F2: " + func2.getNome() +
				" ultimo cod: " + func2.getUltimoCod());
		func1.setSalario(1000);
		System.out.println("Salario base: " + func1.getSalario() + " pl: " + func1.calculaPl());
		Agencia ag1 = new Agencia();
		ag1.funcAg = func1;
		ag1.cidade = "Londrina";
		ag1.numAg = "0000";
		
		//Implemente um modo de visualizar todos os dados da agencia
		//inclusive os dados dos funcionarios
		System.out.println(ag1.toString());
	}
}
