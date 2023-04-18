package aula14;

public class Livro {
	private String titulo;
	private String autor;
	private int numero;
	private boolean disponivel;
	
	public Livro() {
		
	}
	public Livro(String titulo, String autor, int numero) {
		this.titulo = titulo;
		this.autor = autor;
		this.numero = numero;

	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public String toString() {
		return "Livro: " + this.titulo + "\tAutor:" + this.autor + "\tNúmero de do exemplar: " + this.numero + "\tDisponivel: "+ this.disponivel;
	}
}
