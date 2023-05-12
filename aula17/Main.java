package aula17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Concursos c = new Concursos();
		String r[]= {"a","a","a","a","a","a","a","a","a","a"};
		c.addCandidato("Aa", "12345678910", r);
		c.addCandidato("Aab", "12345658910", r);
		
		c.addRespostas();
		c.corrigirProvas();
		//c.removeCandidato("12345678910");
		//c.corrigirProvas();
		c.corrigirProva("1234565891");
		
		Funcionario f1 = new Funcionario("sla", "12345678900");
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema de login \n"
				+ "Digite seu usuário para fazer login");
		String id = sc.next();
		Autenticacao a = new Autenticacao();
		
		a.autenticaUsuario(f1, id);
		sc.close();
	}
}
