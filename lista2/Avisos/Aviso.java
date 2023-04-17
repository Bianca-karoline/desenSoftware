package Avisos;

public class Aviso {
	private double indice;
	
	public void setIndice(double indice) {
		this.indice = indice;
	}
	public String notificacao() {
		String texto= "";
		if(indice<= 0.16) {
			texto =  "Índice de poluição aceitável";
		}else if(indice <0.4) {
			texto = "O 1º grupo deve diminuir 50% de suas atividades";
		}else if(indice <0.5) {
			texto = "As industras do grupo 1 e 2 devem parar suas atividades";
		}else {
			texto = "Todos os grupos devem parar suas atividades";
		}
		
		return texto;
	}
}
