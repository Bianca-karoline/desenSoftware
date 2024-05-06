package aula16;

public class Triangulo extends Forma2D {
	private String style;
	
	public Triangulo() {
	}
	public Triangulo(String style, double h, double w) {
		super(w,h,"Triangulo");
		this.style = style;
	}
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	public double area() {
		return (super.getAltura() * super.getLargura())/2;
	}
	
}
