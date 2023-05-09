package aula15;

import java.util.ArrayList;
import java.util.Scanner;
public class Concursos {
	private String caracteres[] =  new String[10];
	private ArrayList<Candidato> candidatos = new ArrayList<>();

	public void addCandidato(String n, String cpf, String[] r) {
		Candidato c = new Candidato(n,cpf);
		boolean add = true;
		for(Candidato item:candidatos) {
			if(item.getCpf().equals(cpf)) {
				add = false;
				break;
			}
		}
		if(add) {
			c.setRespostas(r);
			candidatos.add(c);
			System.out.println("Cadastrado com sucesso");
		}else {
			System.out.println("Cpf já cadastrado");
		}
	}
	public void removeCandidato(String c) {
		for(int i=0;i<candidatos.size();i++) {
			if(candidatos.get(i).getCpf().equals(c)) {
				candidatos.remove(i);
				System.out.print("Canditado removido");
				break;
			}
		}
	}
	public void addRespostas() {
		String letra;
		Scanner sc = new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Adicionar resposta " + (i+1));
			letra = sc.next();
			if(letra.equals("a") || letra.equals("b") ||letra.equals("c") ||letra.equals("d") ||letra.equals("e")) {
				caracteres[i] = letra;
				i++;
			}
			sc.reset();
		}while(i!=10);
		sc.close();
	}
	public void corrigirProvas() {
		for(Candidato item:candidatos) {
			System.out.print(item.getNome() + "\t" + item.getCpf() + "\tRespostas corretas: ");
			String resposta[] = item.getRespostas();
			int r = 0;
			for(int i = 0;i<10;i++) {
				if(resposta[i].equals(this.caracteres[i])  ) {
					r++;
				}
			}
			System.out.println(r);
		}
	}
	public void corrigirProva(String c) {
		for(Candidato item:candidatos) {
			if(item.getCpf() == c) {
				System.out.print(item.getNome() + "\t" + item.getCpf() + "\tRespostas corretas: ");
				String resposta[] = item.getRespostas();
				int r = 0;
				for(int i = 0;i<10;i++) {
					if(resposta[i] == this.caracteres[i]) {
						r++;
					}
				}
				System.out.println(r);
			}
		}
	}
	public void imprimeCandidatos() {
		for(Candidato item:candidatos) {
			System.out.print(item.getNome() + "\t" + item.getCpf() + "\tRespostas corretas: ");
			String resposta[] = item.getRespostas();
			int r = 0;
			for(int i = 0;i<10;i++) {
				if(resposta[i] == this.caracteres[i]) {
					r++;
				}
			}
			System.out.println(r);
		}
	}
}
