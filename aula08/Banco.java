package aula08;
import java.util.Scanner;
import java.util.ArrayList;

public class Banco {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String menu = "----- Banco ----- \n"
				+ "1- Cadastrar conta \t"
				+ "2- Listar contas \t"
				+ "3- Editar conta \t"
				+ "0- Sair";
		int option = 0;
		ArrayList<Conta> listaConta = new ArrayList<>();
		do {
			System.out.println(menu);
			option = sc.nextInt();
			
			switch(option){
			case 1:
				Conta c = new Conta();
				System.out.println("Digite o nome do cliente: ");
				c.setTitular(sc.next());
				sc.reset();
				System.out.println("Digite o cpf do titular: ");
				c.setCpfTitular(sc.next());
				sc.reset();
				System.out.println("Digite o agencia do titular: ");
				c.setAgencia(sc.next());
				sc.reset();
				System.out.println("Digite o número da conta do titular: ");
				c.setNumeroConta(sc.next());
				sc.reset();
				c.setSaldo(0.0);
				sc.reset();
				c.setLimite(100.0);
				sc.reset();
				listaConta.add(c);
				break;
			case 2:
				System.out.println("Titular: \t Agencia: \t Número da conta: \t CPF: \t Saldo: \t Limite:");
				for(Conta item : listaConta) {
					System.out.println(item.toString());
				}
				break;
			case 3:
				
				break;
			case 0:
				System.out.println("Encerrando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}while(option != 0);
		
		//*****************************************************************//
		sc.close();
	}
}
