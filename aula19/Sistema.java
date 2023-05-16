package aula19;

import java.util.Scanner;
import java.util.ArrayList;
public class Sistema {
	public static void main(String[]args) {
		String menu = "---------- MENU ----------\n"
				+ "1 - Cadastrar Pizza\n"
				+ "2 - Cadastrar Lanches\n"
				+ "3 - Cadastrar Bebidas\n"
				+ "4 - Ver cardapio\n"
				+ "5 - Cadastrar pedidos\n"
				+ "6 - Ver pedidos realizados\n"
				+ "0 - sair do sistema\n";
		Scanner sc = new Scanner(System.in);
		int option = 0;
		ArrayList<Produto> cardapio = new ArrayList<>();
		Pedido pedido = new Pedido();
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			switch(option) {
			case 1:
				Pizza p = new Pizza();
				System.out.println("Digite o nome do item:");
				p.setNome(sc.next());
				sc.reset();
				System.out.println("Digite o tamanho do item: ");
				p.setTamanho(sc.nextInt());
				sc.reset();
				System.out.println("Digite o valor do item:");
				p.setValor(sc.nextDouble());
				sc.reset();
				System.out.println("Digite a observação do pedido: ");
				p.setObs(sc.next());
				sc.reset();
				String ing = "";
				do {
					System.out.println("Digite o ingrediente ou ENTER para sair");
					ing = sc.next();
					sc.reset();
					if(!ing.equals("")) {
						p.addIngrediente(ing);
					}
				}while(!ing.equals(""));
				cardapio.add(p);
				break;
			case 2:
				Hamburger h = new Hamburger();
				System.out.println("Digite o nome do item:");
				h.setNome(sc.next());
				sc.reset();
				System.out.println("Digite o tamanho do item: ");
				h.setTamanho(sc.nextInt());
				sc.reset();
				System.out.println("Digite o valor do item:");
				h.setValor(sc.nextDouble());
				sc.reset();
				System.out.println("Digite a observação do pedido: ");
				h.setObs(sc.next());
				sc.reset();
				do {
					System.out.println("Digite o ingrediente ou ENTER para sair");
					ing = sc.next();
					sc.reset();
					if(!ing.equals("")) {
						h.addIngrediente(ing);
					}
				}while(!ing.equals(""));
				cardapio.add(h);
				break;
			case 3:
				Bebida b = new Bebida();
				System.out.println("Digite o nome do item:");
				b.setNome(sc.next());
				sc.reset();
				System.out.println("Digite o tamanho do item: ");
				b.setTamanho(sc.nextInt());
				sc.reset();
				System.out.println("Digite o valor do item:");
				b.setValor(sc.nextDouble());
				sc.reset();
				System.out.println("Digite a observação do pedido: ");
				b.setObs(sc.next());
				sc.reset();
				System.out.println("Digite o tipo de bebida: ");
				b.setTipo(sc.next());
				sc.reset();
				System.out.println("Digite a temperatura: ");
				b.setTemperatura(sc.next());
				sc.reset();
				cardapio.add(b);
				break;
			case 4:
				for(Produto pr:cardapio) {
					System.out.println(pr.toString());
				}
				break;
			case 5:
				System.out.println("Digite o número do item que deseja pedir: ");
				int index = sc.nextInt();
				if(index >=0) {
					pedido.setItens(cardapio.get(index));
				}
				break;
			case 6:
				pedido.pedidosRealizados();
				break;
			case 0:
				pedido.fecharPedido();
				System.out.println("Encerrando sistema...");
				break;
			default:
					System.out.println("Opção inválida");
					break;
			}
		}while(option != 0);
		sc.close();
	}
}
