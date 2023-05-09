package aula15;

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
		
	}
}
