package br.edu.ifg;



import java.util.Map;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import br.edu.ifg.interfaces.IGrafico;


public class Grafico extends JFrame implements IGrafico{
	private Metodos metodos;

	public Grafico(Metodos metodos) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gráfico");
		setSize(950,700);
		setLocationRelativeTo(null);
		this.metodos = metodos;
		criarGrafico();
		setVisible(true);
	}
	
	@Override
	public void criarGrafico() {
		Map<String,Integer> quantPronomes = this.getMetodos().pesquisarPronomes();
		Map<String,Integer> quantArtigos = this.getMetodos().pesquisarArtigos();
		DefaultPieDataset pizza = new DefaultPieDataset();
		
		for(String key : quantPronomes.keySet()) {
			if(quantPronomes.get(key) != 0) {
				pizza.setValue(key, quantPronomes.get(key));
			}
		}
		for(String key : quantArtigos.keySet()) {
			if(quantArtigos.get(key) != 0) {
				pizza.setValue(key, quantArtigos.get(key));
			}
		}
		
		JFreeChart grafico = ChartFactory.createPieChart("Grafico", pizza, true, true, false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}

	public Metodos getMetodos() {
		return metodos;
	}

	public void setMetodos(Metodos metodos) {
		this.metodos = metodos;
	}

}
