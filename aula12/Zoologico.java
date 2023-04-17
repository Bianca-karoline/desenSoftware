package aula12;

import java.util.Scanner;

public class Zoologico {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do animal");
		String nome = sc.next();
		sc.reset();
		System.out.println("Habitat do animal");
		String habitat = sc.next();
		sc.reset();
		Animal zebra = new Animal(nome, habitat);
		System.out.println("Altura do animal");
		zebra.setAltura(sc.nextDouble());
		System.out.println("Peso do animal");
		zebra.setPeso(sc.nextDouble());	
		sc.reset();
		
		//System.out.println(zebra.toString());
		
		Recinto recinto1 = new Recinto();
		recinto1.setArea(150);
		recinto1.setBioma("Savana");
		recinto1.setAnimal(zebra);
		System.out.println(recinto1.toString());
		
		Reptil cobra = new Reptil("Seleste", "Cerrado", 36.0, true);
		cobra.alimentado();
		System.out.println(cobra.toString());
		Aves pinguim = new Aves("Cadú", "Antartico");
		pinguim.setVoa(false);
		pinguim.setMergulha(true);
		System.out.println(pinguim.toString());
		Recinto recinto2 = new Recinto();
		recinto2.setBioma("Antartico");
		recinto2.setAnimal(cobra);
		recinto2.setAnimal(pinguim);
		zebra.alimentado();
		sc.close();
	}
}
