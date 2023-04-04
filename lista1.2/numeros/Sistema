import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        ConjuntoInteiro novo = new ConjuntoInteiro();
        ConjuntoInteiro inteiro = new ConjuntoInteiro();
        int option = 0, j, i;
        String menu = "------ Menu ------ \n " +
                "1 - Registrar conjunto 1 de inteiros" +
                "2 - Registar conjunto 2 de inteiros" +
                "3 - Fazer união dos conjuntos" +
                "4 - Interseção dos conjuntos" +
                "5 - Diferença dos conjuntos" +
                "6 - Exibir conjunto 1 de inteiros" +
                "0 - Sair";
        do{
            System.out.println(menu);
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Digite quantos números deseja adicionar:");
                    j = sc.nextInt();
                    for(i = 0; i < j; i++){
                        System.out.println("Digite o número " + i );
                        novo.newNum(sc.nextInt());
                        sc.reset();
                    }
                    break;
                case 2:
                    System.out.println("Digite quantos números deseja adicionar:");
                    j = sc.nextInt();
                    for(i = 0; i < j; i++){
                        System.out.println("Digite o número " + i );
                        inteiro.newNum(sc.nextInt());
                        sc.reset();
                    }
                    break;
                case 3:
                    for(int i = 0; i <inteiro.size();i++){
                        novo.uniao(inteiro.getElementos(i));
                    }   
                    System.out.println(novo.toString());
                    break;
                case 4:
                    for(int i = 0; i <inteiro.size();i++){
                        novo.intersecao(inteiro.getElementos(i));
                    }
                    System.out.println(novo.intersecao());
                    break;
                case 5:
                    for( i = 0; i <inteiro.size();i++){
                        novo.diferenca(inteiro.getElementos(i));
                    }  
                    System.out.println(novo.diferenca());
                    break;
                case 6:
                    System.out.println(novo.toString());
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida... \n Digite novamente");
                    break;
            }
        }while(option != 0);

        sc.close();
    }
}
