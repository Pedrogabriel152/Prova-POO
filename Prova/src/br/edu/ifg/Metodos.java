package br.edu.ifg;

import java.util.HashMap;
import java.util.Map;

public class Metodos {
	private Biblioteca biblioteca;
	private String path = " Visio\r\n"
			+ " \r\n"
			+ "\r\n"
			+ " \r\n"
			+ "\r\n"
			+ "A Eras pálida. E os cabelos,a\ra\n"
			+ " Aéreos, soltos novelos a,a\ra\n"
			+ " Sobre as espáduas caíam\ra\n"
			+ " Os olhos meio-cerrados\ra\n"
			+ " A De volúpia e de ternura a\r\n"
			+ " Entre lágrimas luziam\r\n"
			+ " E os braços entrelaçados,\r\n"
			+ " Como cingindo a ventura,\r\n"
			+ " Ao teu seio me cingiram\r\n"
			+ "\r\n"
			+ "\r\n"
			+ " Depois, naquele delírio,\r\n"
			+ " Suave, doce martírio\r\n"
			+ " De pouquíssimos instantes\r\n"
			+ " Os teus lábios sequiosos,\r\n"
			+ " Frios trêmulos, trocavam\r\n"
			+ " Os beijos mais delirantes,\r\n"
			+ " E no supremo dos gozos\r\n"
			+ " Ante os anjos se casavam\r\n"
			+ " Nossas almas palpitantes\r\n"
			+ " Depois a verdade,\r\n"
			+ " A fria realidade,\r\n"
			+ " A solidão, a tristeza;\r\n"
			+ " Daquele sonho desperto,\r\n"
			+ " Olhei… silêncio de morte\r\n"
			+ " Respirava a natureza —\r\n"
			+ " Era a terra, era o deserto,\r\n"
			+ " Fora-se o doce transporte,\r\n"
			+ " Restava a   a fria certeza.\r\n"
			+ "\r\n"
			+ " \r\n"
			+ " Desfizera-se a mentira:\r\n"
			+ " Tudo aos meus olhos fugira;\r\n"
			+ " Tu e o teu olhar ardente,\r\n"
			+ " Lábios trêmulos e frios,\r\n"
			+ " O abraço longo e apertado,\r\n"
			+ " O beijo doce e veemente;\r\n"
			+ " Restavam meus desvarios,\r\n"
			+ " E o incessante cuidado,\r\n"
			+ " E a fantasia doente.\r\n"
			+ "\r\n"
			+ "\r\nA "
			+ "A E agora te vejo. E fria\r\na "
			+ "A Tão outra estás da que eu via\r\nA "
			+ " Naquele sonho encantado!\r\n"
			+ " És outra, calma, discreta,\r\n"
			+ " Com o olhar indiferente,\r\n"
			+ " Tão outro do olhar sonhado,\r\n"
			+ " Que a minha alma de poeta\r\n"
			+ " Não vê se a imagem presente\r\n"
			+ " Foi a imagem do passado.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ " Foi, sim, mas visão apenas;\r\n"
			+ " Daquelas visões amenas\r\n"
			+ " Que à mente dos infelizes\r\n"
			+ " Descem vivas e animadas,\r\n"
			+ " Cheias de luz e esperança\r\n"
			+ " E de celestes matizes:\r\n"
			+ " Mas, apenas dissipadas,\ra\n"
			+ " Fica uma leve lembrança,\r\n"
			+ " Não ficam outras raízes.\r\n"
			+ "\r\n"
			+ "\r\n"
			+ " Inda assim, embora sonho,\r\n"
			+ " Mas sonho doce e risonho,\r\n"
			+ " Desse-me Deus que fingida\r\n"
			+ " Tivesse aquela ventura\r\n"
			+ " Noite por noite, hora a hora,\r\n"
			+ " No que me resta de vida,\r\n"
			+ " Que, já livre da amargura,\r\n"
			+ " Alma, que em dores me chora,\r\n"
			+ " Chorara de agradecida!\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "  Machado de Assis";
	
	public Metodos(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
		this.tratarArquivo();
	}
	
	public void contadorDeSEquenciaChar(String sequencia) {
	
	}
	
	public Map<String, Integer> pesquisarPronomes() {
		String[] quebraArquivo = this.getPath().split(" ");
		Map<String,String> pronomes = this.getBiblioteca().getPronomes();
		Map<String,Integer> quantPronomes = new HashMap<String, Integer>();
		int quantEu = 0;
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
	
	public void tratarArquivo() {
		String arquivo = this.getPath();
		
		for(int i=0;i<arquivo.length();i++) {
			
			if(arquivo.charAt(i) == '\r' || arquivo.charAt(i) == '\n') {
				arquivo =  arquivo.substring(0,i)+' '+arquivo.substring(i+1);
			}
		}
		
		this.setPath(arquivo);
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