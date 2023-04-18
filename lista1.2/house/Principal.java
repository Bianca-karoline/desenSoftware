package house;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Door porta = new Door();
        //Elementos de Construção
        porta.open();
        porta.paint("vermelho");
        porta.setDepth(1);
        porta.setHeight(2.0);
        porta.setWidth(0.8);
        if(porta.isOpen() == true ) {
        	System.out.println("A porta está aberta");
        }else {
        	System.out.println("A porta está fechada");
        }
        //Construindo Objetos Compostos
        House casa = new House();
        casa.paint("Cinza");
        Door porta1 = new Door("Cinza", 1.0 , 1.0, 1.0);
        porta1.close();
        Door porta2 = new Door("Verde", 1.0 , 1.0, 1.0);
        porta2.open();
        Door porta3 = new Door("Branco", 1.0 , 1.0, 1.0);
        porta3.open();
        casa.addPortas(porta1, porta2, porta3);
        System.out.println("Número de portas abertas: " + casa.doorsIsOpen());
        System.out.println(casa.toString());
        sc.close();
    }
}
