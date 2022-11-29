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
		pizza.setValue("b", 5);
		pizza.setValue("o", 200);
		pizza.setValue("AS", 40);
		
		JFreeChart grafico = ChartFactory.createPieChart("Grafico", pizza, true, true, false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}

}
