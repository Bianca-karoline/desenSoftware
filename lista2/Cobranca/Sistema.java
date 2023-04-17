package Cobranca;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boleto boleto = new Boleto();
		System.out.println("Digite o valor do boleto: ");
		boleto.setBoleto(sc.nextDouble());
		sc.reset();
		System.out.println("Digte os dias de atraso: ");
		boleto.setDias(sc.nextInt());
		sc.reset();
		System.out.println(boleto.total());
		sc.close();
	}
	
}
