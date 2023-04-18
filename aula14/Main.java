package aula14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int option;
		String titulo, autor;
		Biblioteca biblio = new Biblioteca();
		Livro teste = new Livro();
		String menu = "1 - Incluir novo livro ao acervo\n"
				+ "2 - Remover um exemplar do acervo pelo seu número\n"
				+ "3 - Empresta Livro\n"
				+ "4 - Quantidade de livros emprestados\n"
				+ "5 - Imprimir acervo\n"
				+ "0 - Sair";
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			switch(option) {
			case 1:
				System.out.println("Insira a nome");
				titulo = sc.next();
				sc.reset();
				System.out.println("Insira o autor");
				autor = sc.next();
				sc.reset();
				teste.setDisponivel(true);
				biblio.addLivro(titulo,autor);
				break;
			case 2:
				System.out.println(biblio.toString());
				System.out.println("Digite o número do livro que deseja remover");
				biblio.removeLivro(sc.nextInt());
				sc.reset();
				break;
			case 3:
				System.out.println("Digite o titulo do livro que deseja emprestar: ");
				biblio.emprestaLivro(sc.next());
				break;
			case 4:
				System.out.println(biblio.qtdLivros());
				break;
			case 5:
				System.out.println(biblio.toString());
				break;
			case 0:
				System.out.println("Encerrando o sistema");
				break;
			default:
				System.out.println("Opção inválida digite novemente");
				break;
			}
		}while(option != 0);
		sc.close();
	}
}
