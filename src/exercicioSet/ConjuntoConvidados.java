package exercicioSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private static Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public static int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + contarConvidados() + " dentro do Set de Convidados");
	
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235); //Não salvo por foi impedido pelo Hash por ter o código de convite duplicado
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
		conjuntoConvidados.adicionarConvidado("Convidado 5", 1237);
		System.out.println("Existem " + contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existem " + contarConvidados() + " dentro do Set de Convidados");
		
	}
}
