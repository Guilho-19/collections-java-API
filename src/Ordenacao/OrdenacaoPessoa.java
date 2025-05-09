package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Nome 1", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 28, 1.57);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 34, 1.86);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 24, 1.78);
		ordenacaoPessoa.adicionarPessoa("Nome 5", 65, 1.55);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
}
