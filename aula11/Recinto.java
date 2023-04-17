
public class Recinto {
	private double area;
	private String bioma;
	private Animal animal;
	
	public double getArea() {
		return this.area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getBioma() {
		return this.bioma;
	}
	public void setBioma(String bioma) {
		this.bioma = bioma;
	}
	public Animal getAnimal() {
		return this.animal;
	}
	public void setAnimal(Animal animal) {
		if(animal.getHabitat().equals(bioma)) {
		this.animal = animal;
		}else {
			System.out.println("Este recinto é de um bioma incompativel com o habitat do animal.");
		}
		
	}
	
	public String toString() {
		return "Área: " + this.area + "\t" + "Bioma: " + this.bioma + "\t" + "Anima: " + this.animal+ "\n" + this.animal.toString();
	}
}
