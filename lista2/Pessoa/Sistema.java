package Pessoa;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		/*
		 * Pessoa teste = new Pessoa(sc.next()); sc.reset(); Pessoa teste1 = new
		 * Pessoa(sc.nextInt()); sc.close();
		 */
		Aluno aluno1 = new Aluno("12345678912");
		Aluno aluno2 = new Aluno("76445688912");
		Instrutor professor = new Instrutor("98765432111");
		Curso ingles = new Curso();
		ingles.setProfessor(professor);
		ingles.setCurso("Ingles");
		ingles.setAlunos(aluno2);
		ingles.setAlunos(aluno1);
		System.out.println(ingles.toString());
		sc.close();
	}
}
