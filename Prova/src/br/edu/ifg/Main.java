package br.edu.ifg;

import java.util.Map;
import java.util.Scanner;
//C:\Users\pedrp\OneDrive\Área de Trabalho\Visio - Machado de Assis.txt
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arquivo arquivo = new Arquivo();
		Biblioteca biblioteca = new Biblioteca();
		Metodos metodo = new Metodos(biblioteca, arquivo);
		String opcao;
		
		//Exibindo o grafico
		
		Grafico pizza = new Grafico(metodo);
		
		//Mostrando resultados no console
		Map<String,Integer> quantPronomes = metodo.pesquisarPronomes();
		Map<String,Integer> quantArtigos = metodo.pesquisarArtigos();
		
		System.out.println("No arquivo existe:");
		System.out.println("\nPronomes");
		for(String key : quantPronomes.keySet()) {
			System.out.println(key+": "+quantPronomes.get(key));
		}
		System.out.println("\nArtigos");
		for(String key : quantArtigos.keySet()) {
			System.out.println(key+": "+quantArtigos.get(key));
		}
		
		System.out.println("\nDeseja procurar uma palavra em especifico: sim ou nao");
		opcao = sc.nextLine();
		opcao = opcao.toLowerCase();
		
		while(opcao.equals("sim")) {
			String sequencia;
			
			System.out.println("\nQual palavra ou frase dejesa buscar:");
			sequencia = sc.nextLine();
			
			metodo.contadorDeSEquenciaChar(sequencia);
			
			System.out.println("\nDeseja realizar outra busca: sim ou nao");
			opcao = sc.nextLine();
			opcao = opcao.toLowerCase();
		}
		
		sc.close();
		
	}

}
