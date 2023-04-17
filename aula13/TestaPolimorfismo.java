package aula13;

import java.util.ArrayList;

public class TestaPolimorfismo {
	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<>();
		
		Animal animal1 = new Animal("Cavalo", 4, 20, 0);
		Passaro animal2 = new Passaro("Tuiuiu", 2, 5, 0);
		Peixe peixe = new Peixe("Nemo", 2, 2, 0);
		Anfibio animal3 = new Anfibio("Sapo", 4, 6, 0);
		animais.add(peixe);
		animais.add(animal3);
		animais.add(animal2);
		animais.add(animal1);
		for(Animal a:animais) {
			a.mover();
		}
		
		
		
		
		/*
		animal1.mover();
		animal1.mover();
		peixe.mover();
		peixe.mover();
		animal2.mover();
		animal2.mover();
		animal3.mover();
		animal3.mover();
		*/
	}
}
