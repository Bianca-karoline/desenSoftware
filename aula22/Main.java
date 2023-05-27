package aula22;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> inteiros = new ArrayList<>();
		inteiros.add(10);
		inteiros.add(50);
		inteiros.add(41);
		inteiros.add(0);
		inteiros.add(-1);
		
		System.out.println("Antes de ordenar: " + inteiros);
		Collections.sort(inteiros);
		System.out.println("Depois de ordenar: " + inteiros);
		
		ArrayList<Integer> inteiros2 = new ArrayList<>();
		inteiros2.add(30);
		inteiros2.add(52);
		inteiros2.add(20);
		inteiros2.add(-10);
		inteiros2.add(100);
		System.out.println("A lista têm elementos não repetidos? " + Collections.disjoint(inteiros, inteiros2));
		System.out.println("Valor minímo da Lista 1: " + Collections.min(inteiros) + "\nValor máximo da Lista 2: " + Collections.max(inteiros2));
		Collections.reverse(inteiros2);
		System.out.println("Lista 2 reverse: " + inteiros2);
		
		System.out.println("----------------------------------------------------------");
		ArrayList<String> lista1 = new ArrayList<>();
		lista1.add("Mariana");
		lista1.add("André");
		lista1.add("João");
		lista1.add("Matheus");
		System.out.println("Lista desordenada: "+lista1);
		Collections.sort(lista1);
		System.out.println("Lista ordenada: "+lista1);
		System.out.println("Busca: "+Collections.binarySearch(lista1, "Mariana"));
		ArrayList<String> lista2 = new ArrayList<>();
		lista2.add("Mariana");
		lista2.add("Andreia");
		lista2.add("Carlos");
		lista2.add("Miguel");
		//Editando elementos
		Collections.sort(lista2);
		int index = Collections.binarySearch(lista2, "Mariana");
		if(index >=0 ) {
			lista2.set(index, "Marina");
			System.out.println("Lista editada: " + lista2);
		}
		System.out.println("----------------------------------------------------------");
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Juliana", "003", "13/01/1999"));
		pessoas.add(new Pessoa("Marcos", "001", "23/02/1999"));
		pessoas.add(new Pessoa("Antonio", "002", "03/07/1999"));
		System.out.println("Lista desordenada: " + pessoas);
		Collections.sort(pessoas);
		System.out.println("Lista ordenada: " + pessoas);
		
		System.out.println("----------------------------------------------------------");
		Map<String, Pessoa> mapPerson = new HashMap<String, Pessoa>();
		mapPerson.put("Marcos", pessoas.get(0));
		mapPerson.put("Antonio", pessoas.get(1));
		System.out.println(mapPerson.get("Marcos"));
		
	}

}
