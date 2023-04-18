package aula14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int option;
		Biblioteca biblio = new Biblioteca();
		Livro teste = new Livro();
		String menu = "1 – Incluir novo livro ao acervo\n"
				+ "2 – Remover um exemplar do acervo pelo seu número\n"
				+ "3 – Empresta Livro\n"
				+ "4 – Quantidade de livros emprestados\n"
				+ "5 – Imprimir acervo"
				+ "0 - Sair";
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			switch(option) {
			case 1:
				System.out.println("Insira a nome");
				teste.setTitulo(sc.next());
				sc.reset();
				System.out.println("Insira o autor");
				teste.setAutor(sc.next());
				sc.reset();
				System.out.println("Insira o numero");
				teste.setNumero(sc.next());
				sc.reset();
				teste.setDisponivel(true);
				biblio.addLivro(teste);
				break;
			case 5:
				System.out.println(biblio.toString());
				break;
			}
		}while(option != 0);
		sc.close();
	}
}
