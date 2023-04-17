package aula12;

public class Reptil extends Animal{
	private double temperatura;
	private boolean venenoso;
	public Reptil(String nome, String habitat, double temperatura, boolean venenoso) {
		super(nome, habitat);
		this.temperatura = temperatura;
		this.venenoso = venenoso;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getTemperatura() {
		return this.temperatura;
	}
	public void setVenenoso(boolean veneno) {
		this.venenoso = veneno;
	}
	public boolean getVenenoso() {
		return this.venenoso;
	}
	public String toString() {
		return super.toString() + "\t" + this.temperatura + "\t" + this.venenoso;
	}
}
