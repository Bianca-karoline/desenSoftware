package aula19;

public abstract class Produto {
	private String nome;
	private int tamanho;
	private double valor;
	private String obs;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String toString() {
		return this.nome + "\n" + this.tamanho + "\t" + this.valor + "\n" + this.obs + "\n";
	}
}
