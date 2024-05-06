package aula16;

public class Usuario {
	private int id;
	private String nome;
	private int anoNasc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	final public int calcularIdade(int anoAtual) {
		return anoAtual - this.anoNasc;
	}
}
