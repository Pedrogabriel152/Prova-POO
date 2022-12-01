package br.edu.ifg;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Grafico pizza = new Grafico();
		Biblioteca biblioteca = new Biblioteca();
		Metodos metodo = new Metodos(biblioteca);
		
		Map<String, Integer> metodos = metodo.pesquisarArtigos();
		
		System.out.println(metodos.get("A"));
	}

}
