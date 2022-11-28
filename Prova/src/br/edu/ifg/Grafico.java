package br.edu.ifg;



import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class Grafico extends JFrame {

	public Grafico() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gráfico");
		setSize(950,700);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);
	}
	
	public void criarGrafico() {
		DefaultPieDataset pizza = new DefaultPieDataset();
		pizza.setValue("Teste", 40);
		pizza.setValue("Teste2", 20);
		pizza.setValue("Teste3", 40);
		
		JFreeChart grafico = ChartFactory.createPieChart("testeGrafico", pizza, true, true, false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}

	public static void main(String[] args) {
		new Grafico();
		
	}

}
