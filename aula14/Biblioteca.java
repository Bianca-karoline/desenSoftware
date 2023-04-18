package aula14;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> listaLivros = new ArrayList<>();

	public ArrayList<Livro> getLivros() {
		return listaLivros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.listaLivros = livros;
		System.out.println("Livro adicionado");
	}
	
	public void addLivro(Livro livro) {
		listaLivros.add(livro);
	}
	public void removeLivro(int i) {
		this.listaLivros.remove(i);
		System.out.println("Livro removido");
	}
	public void emprestaLivro(String titulo) {
		
	}
	public int qtdLivros() {
		int qtd = 0;
		for(Livro a:listaLivros) {
			if(!a.isDisponivel()) {
				qtd++;
			}
		}
		return qtd;
	}
	public String toString() {
		String texto = "";
		for(Livro a: listaLivros) {
			texto += a.toString() + "\n" ;
		}
		return texto;
	}
}
