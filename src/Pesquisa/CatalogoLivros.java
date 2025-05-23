package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2002);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2008);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2010);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2015);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2020);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
		System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2000, 2003));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
		
	}
}
