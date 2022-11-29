package br.edu.ifg;

import java.util.HashMap;
import java.util.Map;

public class Metodos {
	private Biblioteca biblioteca;
	private String path;
	
	public Metodos(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	public void contadorDeSEquenciaChar(String sequencia) {
	
	}
	
	public Map<String, Integer> pesquisarPronomes() {
		String[] quebraArquivo = this.getPath().split(" ");
		Map<String,String> pronomes = this.getBiblioteca().getPronomes();
		Map<String,Integer> quantPronomes = new HashMap<String, Integer>();
		int quantEu =0;
		int quantTu = 0;
		int quantEle = 0;
		int quantNos = 0;
		int quantVos = 0;
		int quantEles = 0;
		
		for(int i=0;i<quebraArquivo.length;i++) {
			String[] separacao = quebraArquivo[i].split(",");
			
			for(int j=0;j<separacao.length;j++) {
				
				for(String key : pronomes.keySet()) {
					
					if(pronomes.get(key).equals(separacao[j])) {
						if(pronomes.get(key).equals("EU") || 
							pronomes.get(key).equals("eu") ||
							pronomes.get(key).equals("Eu")) {
							
							quantEu++;
						}
						if(pronomes.get(key).equals("TU") || 
								pronomes.get(key).equals("tu") ||
								pronomes.get(key).equals("Tu")) {
							
								quantTu++;
						}
						if(pronomes.get(key).equals("Ele") || 
								pronomes.get(key).equals("ELE") ||
								pronomes.get(key).equals("ele")) {
							
								quantEle++;
						}
						if(pronomes.get(key).equals("Ela") || 
								pronomes.get(key).equals("ELA") ||
								pronomes.get(key).equals("ela")) {
							
								quantEle++;
						}
						if(pronomes.get(key).equals("Eles") || 
								pronomes.get(key).equals("ELES") ||
								pronomes.get(key).equals("eles")) {
							
								quantEles++;
						}
						if(pronomes.get(key).equals("Elas") || 
								pronomes.get(key).equals("ELAS") ||
								pronomes.get(key).equals("elas")) {
							
								quantEles++;
						}
						
						if(pronomes.get(key).equals("NÓS") || 
								pronomes.get(key).equals("nós") ||
								pronomes.get(key).equals("Nós")) {
							
								quantNos++;
						}
						if(pronomes.get(key).equals("VÓS") || 
								pronomes.get(key).equals("vós") ||
								pronomes.get(key).equals("Vós")) {
							
								quantVos++;
						}
					}
				}
			}
			
		}
		
		quantPronomes.put("Eu", quantEu);
		quantPronomes.put("Tu", quantTu);
		quantPronomes.put("Ele/Ela", quantEle);
		quantPronomes.put("Nós", quantNos);
		quantPronomes.put("Vós", quantVos);
		quantPronomes.put("Eles/Elas", quantEles);
		
		return quantPronomes;
	}
	
	public Map<String, Integer> pesquisarArtigos() {
		String[] quebraArquivo = this.getPath().split(" ");
		Map<String,String> artigos = this.getBiblioteca().getArtigos();
		Map<String,Integer> quantArtigos = new HashMap<String, Integer>();
		int quantA =0;
		int quantO = 0;
		int quantAs = 0;
		int quantOs = 0;
		
		for(int i=0;i<quebraArquivo.length;i++) {
			String[] separacao = quebraArquivo[i].split(",");
			
			for(int j=0;j<separacao.length;j++) {
				
				for(String key : artigos.keySet()) {
					
					if(artigos.get(key).equals(separacao[j])) {
						if(artigos.get(key).equals("A") || 
							artigos.get(key).equals("a")) {
							
							quantA++;
						}
						if(artigos.get(key).equals("O") || 
								artigos.get(key).equals("o")) {
							
								quantO++;
						}
						if(artigos.get(key).equals("As") || 
								artigos.get(key).equals("AS") ||
								artigos.get(key).equals("as")) {
							
								quantAs++;
						}
						
						if(artigos.get(key).equals("OS") || 
								artigos.get(key).equals("os") ||
								artigos.get(key).equals("Os")) {
							
								quantOs++;
						}
					}
				}
			}
			
		}
		
		quantArtigos.put("A", quantA);
		quantArtigos.put("O", quantO);
		quantArtigos.put("As", quantAs);
		quantArtigos.put("Os", quantOs);
		
		return quantArtigos;
	}
	
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}