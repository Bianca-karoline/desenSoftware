package Pessoa;

public class Pessoa {
	private String cpf;
	private int idade;
	public Pessoa(int idade) {
		this.idade = idade;
		System.out.print("Pessoa cadastrada com sucesso");
	}
	public Pessoa(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
			//System.out.print("Pessoa cadastrada com sucesso");
		}else {
			System.out.println("CPF inválido");
		}
	}
	public Pessoa(int idade, String cpf) {
		if(cpf.length() == 11) {
			this.idade = idade;
			this.cpf = cpf;
			System.out.print("Pessoa cadastrada com sucesso");
		}else {
			System.out.println("CPF inválido");
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
			System.out.println("CPF alterado");
		}else {
			System.out.println("CPF inválido");
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		System.out.println("Idade alterada");
	}
}
