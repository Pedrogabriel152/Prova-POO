package br.edu.ifg;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import br.edu.ifg.interfaces.IArquivo;

public class Arquivo implements IArquivo{
	
	private String caminho; 
	
	public Arquivo() {
		definirCaminhoDoArquivo();
	}
	
	@Override
	public void definirCaminhoDoArquivo() {
		Scanner sc = new Scanner(System.in);
		String caminho;
		
		System.out.println("Digite o caminho completo do arquivo");
		caminho = sc.nextLine();
		
		this.setCaminho(caminho);
	}
	
	@Override
	public String abrirArquivo() {
		Path caminho = Paths.get(this.getCaminho());
		try {
		byte[] texto = Files.readAllBytes(caminho);
		String leitor = new String(texto);
		return leitor;
		} catch(Exception erro) {
			return erro.getMessage();
		}
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	
	
}