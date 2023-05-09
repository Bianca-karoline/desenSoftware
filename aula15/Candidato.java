package aula15;

public class Candidato {
	private String nome;
	private String cpf;
	private String respostas[] = new String[10];
	
	public Candidato() {
		
	}
	public Candidato(String n, String c) {
		this.nome = n;
		this.cpf = c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String[] getRespostas() {
		return respostas;
	}
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}
}
