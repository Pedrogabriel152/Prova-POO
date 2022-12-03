package br.edu.ifg.interfaces;

import java.util.Map;

public interface IMetodos {
	public void contadorDeSEquenciaChar(String sequencia);
	public Map<String, Integer> pesquisarPronomes();
	public Map<String, Integer> pesquisarArtigos();
	public void tratarArquivo();
}
