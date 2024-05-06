package aula16;

public class Retangulo extends Forma2D{
	private String style;
	public Retangulo() {
	}
	public Retangulo(String style, double h, double w) {
		super(w,h,"Retangulo");
		this.style = style;
	}
	public double area() {
		return (super.getAltura() * super.getLargura());
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
}
