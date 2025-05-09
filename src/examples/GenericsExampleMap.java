package examples;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
	public static void main(String[] args) {
		
		//Exemplo sem Generics
		Map mapSemGenerics = new HashMap();
		mapSemGenerics.put("Chave 1", 10);
		mapSemGenerics.put("Chave 2", "valor"); //Permite qualquer tipo de dado
		
		//Exemplo com Generics
		Map<String, Integer> mapGenerics = new HashMap<>();
		mapGenerics.put("Chave 1", 10);
		mapGenerics.put("Chave 2", 20);
		
		//Iterando sobre o mapa com Generics
		for (Map.Entry<String, Integer> entry : mapGenerics.entrySet()) {
			String chave = entry.getKey();
			int valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
		
		//Iterando sobre o mapa sem Generics
		for (Object obj : mapSemGenerics.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			String chave = (String) entry.getKey();
			Object valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
	}
}