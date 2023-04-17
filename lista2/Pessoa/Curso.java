package Pessoa;

import java.util.ArrayList;

public class Curso {
	private String curso;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private Instrutor professor;
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void getAlunos() {
		for(Aluno a:alunos) {
			System.out.println(a.getCpf());
		}
	}
	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}
	public String getProfessor() {
		return professor.getCpf();
	}
	public void setProfessor(Instrutor professor) {
		this.professor = professor;
	}
	public String toString() {
		String al = new String();
		for(Aluno a:alunos) {
			al += a.getCpf() + "\n";
		};
		String texto = "Curso: " + this.curso + "\tInstrutor: "+ this.getProfessor() + "\n"+
				al;
		return texto;
	}
	
}
