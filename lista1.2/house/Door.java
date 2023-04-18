package house;

public class Door {
    private String color;
    private double width;
    private double height;
    private double depth;
    private boolean open = false;
    
    public Door(String a, double w, double h, double d) {
    	this.color = a;
    	this.width = w;
    	this.height = h;
    	this.depth = d;
    }
    public Door() {
    	
    }
    public void open() {
        this.open = true;
    }
    public void close() {
        this.open = false;
    }
    public void paint(String s){
        this.color = s;
    }
    public boolean isOpen() {
        return open;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public void setDepth(double d) {
        this.depth = d;
    }
    public String getDoor() {
        String texto = this.width+  " " + this.height+ " " + this.depth + " " + this.color;
        return texto;
    }
    
}
