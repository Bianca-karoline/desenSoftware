package Pesquisa;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option, indexMaior = 0,indexMenor = 0, qtdSalario = 0, qtdMulher = 0;
		String letra = new String();
		ArrayList<Pesquisa> pesquisa = new ArrayList<>();
		Pesquisa a = new Pesquisa();
		String menu = "------Menu------ \n"+
				"1- Para cadastrar dados \n"+
				"2- Para ver a maior e menor idade cadastrada \n"+
				"3- Quantidade de habitantes do gênero masculino com sálario até 1000 \n"+
				"4- Quantidade de habitantes do gênero feminino \n"+
				"0- Encerrar o sistema";
		do {
			System.out.println(menu);
			option= sc.nextInt();
			switch(option) {
			case 1:
					System.out.println("Digite a idade do habitante: ");
					a.setIdade(sc.nextInt());
					sc.reset();
					do {
						System.out.println("Digite o gênero do habitante[F/M]:");
						letra = sc.next();
						sc.reset();
					}while(!letra.equals("F") && !letra.equals("M"));
					a.setGenero(letra);
					System.out.println("Digite a renda do habitante");
					a.setRenda(sc.nextDouble());
					sc.reset();
					pesquisa.add(a);
					break;
			case 2:
				for(int i=0;i<pesquisa.size();i++) {
					if(pesquisa.get(i).getIdade()<pesquisa.get(indexMenor).getIdade()) {
						indexMenor = i;
					}
					if(pesquisa.get(i).getIdade()>pesquisa.get(indexMaior).getIdade()) {
						indexMaior = i;
					}
				}
				System.out.println("Menor idade: " + pesquisa.get(indexMenor).getIdade() + "\nMaior idade: "+ pesquisa.get(indexMaior).getIdade());
				break;
			case 3:
				for(Pesquisa b:pesquisa) {
					if(b.getGenero().equals("M") && b.getRenda()<=1000) {
						qtdSalario++;
					}
				}
				System.out.println(qtdSalario);
				break;
			case 4:
				for(Pesquisa b:pesquisa) {
					if(b.getGenero().equals("F")) {
						qtdMulher++;
					}
				}
				System.out.println(qtdMulher);
			}
		}while(option!=0);
		
		sc.close();
	}
}
