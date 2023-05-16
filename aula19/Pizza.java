package aula19;

import java.util.ArrayList;

public class Pizza extends Produto implements Preparavel{
	
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

	@Override
	public String toString() {
		return super.toString() + "\n" + this.ingredientes;
	}
	
	public String fabricar() {
		return "Sua pizza está sendo preparada";
	}

}
