import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
                System.out.println("Digite um número: ");
                int num = 0;
                num = leitor.nextInt();
                int a = 1, b = 1, c = 0;
                do{
                    c = a + b;
                    a = b;
                    b = c;
                }while(c<num);
                if(c==num || a==num){
                    System.out.print("O numero pertence");
                }else{
                    System.out.println("O numero nao pertence");
                }
                leitor.close();
    }
}
