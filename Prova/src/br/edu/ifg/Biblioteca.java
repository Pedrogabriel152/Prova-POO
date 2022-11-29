package br.edu.ifg;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	
	private Map<String,String> pronomes;
	private Map<String,String> artigos;
	
	public Biblioteca() {
		Map<String,String> pronomes = new HashMap<String, String>();
		Map<String,String> artigos = new HashMap<String, String>();
		
		//Pronome Ele e suas variações
		pronomes.put("Ele", "Ele");
		pronomes.put("Eles", "Eles");
		pronomes.put("ele", "ele");
		pronomes.put("eles", "eles");
		pronomes.put("ELE", "ELE");
		pronomes.put("ELES", "ELES");
		
		//Pronome Ela e suas variações
		pronomes.put("Ela", "Ela");
		pronomes.put("Elas", "Elas");
		pronomes.put("ela", "ela");
		pronomes.put("elas", "elas");
		pronomes.put("ELA", "ELA");
		pronomes.put("ELAS", "ELAS");
		
		//Pronome Eu e suas variações
		pronomes.put("Eu", "Eu");
		pronomes.put("EU", "EU");
		pronomes.put("eu", "eu");
		
		//Pronome Tu e suas variações
		pronomes.put("Tu", "Tu");
		pronomes.put("TU", "TU");
		pronomes.put("tu", "tu");
		
		//Pronome Nós e suas variações
		pronomes.put("Nós", "Nós");
		pronomes.put("NÓS", "NÓS");
		pronomes.put("nós", "nós");
		
		//Pronome Vós e suas variações
		pronomes.put("Vós", "Vós");
		pronomes.put("VÓS", "VÓS");
		pronomes.put("vós", "vós");
		
		//Artigos O e suas variações
		artigos.put("O", "O");
		artigos.put("os", "os");
		artigos.put("o", "o");
		artigos.put("OS", "OS");
		
		//Artigos A e suas variações
		artigos.put("A", "A");
		artigos.put("as", "as");
		artigos.put("a", "a");
		artigos.put("AS", "AS");

		this.setPronomes(pronomes);
		this.setArtigos(artigos);
		
	}
	
	
	public Map<String, String> getPronomes() {
		return pronomes;
	}
	
	public void setPronomes(Map<String, String> pronomes) {
		this.pronomes = pronomes;
	}
	
	public Map<String, String> getArtigos() {
		return artigos;
	}
	
	public void setArtigos(Map<String, String> artigos) {
		this.artigos = artigos;
	}

	
}
