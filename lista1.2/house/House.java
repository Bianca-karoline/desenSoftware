package house;

public class House {
    private String color;
    Door porta1 = new Door();
    Door porta2 = new Door();
    Door porta3 = new Door();
    public void paint(String color) {
        this.color = color;
    }
    public String houseColor(){
        return color;
    }
    public void addPortas(Door a, Door b, Door c) {
    	this.porta1 = a;
    	this.porta2 = b;
    	this.porta3 = c;
    }
    
    public int doorsIsOpen(){
        int q=0;
        if(porta1.isOpen() == true) {
        	q ++;
        }
        if(porta2.isOpen() == true) {
        	q ++;
        }
        if(porta3.isOpen() == true) {
        	q ++;
        }
        return q;
    }
    public String toString() {
    	return "Cor da casa: " + this.color +
    			"\nPortas: \n" + this.porta1.getDoor() + "\n" +
    			this.porta2.getDoor() + "\n" +
    			this.porta3.getDoor();
    }
    
}
