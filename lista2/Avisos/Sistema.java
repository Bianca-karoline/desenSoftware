package Avisos;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviso indice = new Aviso();
		indice.setIndice(sc.nextDouble());
		System.out.println(indice.notificacao());
		
		sc.close();
	}
}
