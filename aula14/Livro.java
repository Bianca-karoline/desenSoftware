package aula14;

public class Livro {
	private String titulo;
	private String autor;
	private String numero;
	private boolean disponivel;
	
	public Livro() {
		
	}
	public Livro(String titulo, String numero, String autor) {
		this.titulo = titulo;
		this.numero = numero;
		this.autor = autor;
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
