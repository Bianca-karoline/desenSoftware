package aula19;

import java.util.ArrayList;

public class Hamburger extends Produto implements Preparavel{
private ArrayList<String> ingredientes = new ArrayList<>();
	
	public void addIngrediente(String ing) {
		ingredientes.add(ing);
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	
	public String toString() {
		return super.toString() + "\n" + this.ingredientes;
	}
	public String fabricar() {
		return "Seu hamburger está sendo preparado";
	}
}
