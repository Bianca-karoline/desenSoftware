package aula09;

public class Funcionario {
	private static int ultimoCod;
	private String nome;
	private String cpf;
	private double salarioBase;

	//Construtor da classe:
	public Funcionario(String cpf) {
		this.cpf = cpf;
	}
	public Funcionario(String cpf, double salarioBase) {
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}
	
	public void setUltimoCod(){
		ultimoCod++;
	}
	public int getUltimoCod() {
		return ultimoCod;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setSalario(double salario) {
		this.salarioBase = salario;
	}
	public double getSalario() {
		return this.salarioBase;
	}
	
	public double calculaPl() {
		double pl = 0;
		if(this.salarioBase >=0) {
		if(this.salarioBase <=2500) {
			pl = this.salarioBase * 0.1;
		}else if(this.salarioBase <=3500) {
			pl = this.salarioBase * 0.15;
		}else {
			pl = this.salarioBase * 0.2;
		}
		}
		return pl;
	}
	public double calculaPl(double valor) {
		double pl = 0;
		if(this.salarioBase >=0) {
		if(this.salarioBase <=2500) {
			pl = this.salarioBase * 0.1 + valor;
		}else if(this.salarioBase <=3500) {
			pl = this.salarioBase * 0.15 + valor;
		}else {
			pl = this.salarioBase * 0.2 + valor;
		}
		}
		return pl;
	}
	public String toString() {
		String texto = "Nome: " + this.nome + "\t" + "Cpf: " + this.cpf + "\t" + "Salario base: " + this.salarioBase;
		return texto;
	}
}
