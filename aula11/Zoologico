import java.util.Scanner;

public class Zoologico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal zebra = new Animal();
		Recinto recinto1 = new Recinto();
		System.out.println("Digite o nome do animal: ");
		zebra.setNome(sc.next());
		sc.reset();
		System.out.println("Digite o altura do animal: ");
		zebra.setAltura(sc.nextDouble());
		sc.reset();
		System.out.println("Digite o peso do animal: ");
		zebra.setPeso(sc.nextDouble());
		sc.reset();
		zebra.setHabitat("Savana");
		System.out.println(zebra.toString());
		recinto1.setArea(150);
		recinto1.setBioma("Savana");
		recinto1.setAnimal(zebra);
		Recinto recinto2 = new Recinto();
		recinto2.setBioma("Antártico");
		recinto2.setAnimal(zebra);
		zebra.alimentado();
		//System.out.println(recinto1.toString());
		
		sc.close();
		}
}
