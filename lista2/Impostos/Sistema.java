package Impostos;

import java.util.Scanner;

public class Sistema {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "1 - cadastro de vendas\n"
				+ "2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).\n"
				+ "0 - Sair.";
		int option;
		Vendas teste = new Vendas();
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			switch(option) {
			case 1:
				System.out.println("Digite do valor da venda: ");
				teste.setVendas(sc.nextDouble());
				
				sc.reset();
				break;
			case 2:
					System.out.println(teste.getExcesso());
				
				break;
			case 0:
				System.out.println("Encerrando o sistema...");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}while(option != 0);
		sc.close();
	}
}
