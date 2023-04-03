import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Datas data =new Datas();
        System.out.println(data.toString());

        int d,m,a;
        do{
            System.out.println("Digite o dia: ");
            d = sc.nextInt();
        }while(d<0 || d>31);
        do{
            System.out.println("Digite o mês: ");
            m = sc.nextInt();
        }while(m<0 || m>12);
        do{
            System.out.println("Digite o ano: ");
            a = sc.nextInt();
        }while(a<0);
        Datas teste = new Datas(d,m,a);
        System.out.println(teste.toString());
        teste.avancar();
        System.out.println(teste.toString());
        sc.close();
    }
    
}
