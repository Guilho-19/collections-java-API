package examples;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
	public static void main(String[] args) {
		
		//Exemplo sem Generics
		Set conjuntoSemGenerics = new HashSet();
		conjuntoSemGenerics.add("Elemento 1");
		conjuntoSemGenerics.add(10);
		
		//Exemplo com Generics
		Set<String> conjuntoGenerics = new HashSet<>();
		conjuntoGenerics.add("Elemento 1");
		conjuntoGenerics.add("Elemento 2");
		
		//Iterando sobre o conjunto com Generics
		for (String elemento : conjuntoGenerics) {
			System.out.println(elemento);
		}
		
		//Iterando sobre o conjunto sem Generics
		for (Object elemento : conjuntoSemGenerics) {
			if (elemento instanceof String) {
				System.out.println(elemento);
			} else {
				System.out.println("Valor númerico: " + elemento);
			}
		}
	}
}