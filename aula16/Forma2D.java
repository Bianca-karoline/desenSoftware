package aula16;

public abstract class Forma2D {
	private double altura;
	private double largura;
	private String nome;
	
	public Forma2D() {
		largura =  altura = 0;
		nome = "nada";
	}
	public Forma2D(double altura, double largura, String nome) {
		this.altura = altura;
		this.largura = largura;
		this.nome = nome;
	}
	public Forma2D(double w, String n) {
		this.largura = w;
		this.nome = n;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	final public void showDim() {
		System.out.println("Largura e altura: " + this.largura + "\t" + this.altura);
	}
	public abstract double area();
}
