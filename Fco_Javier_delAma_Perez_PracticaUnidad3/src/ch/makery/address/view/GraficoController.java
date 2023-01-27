package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class GraficoController {
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
    private PieChart pieChart;

	@FXML
	private void initialize() {
		// Rellenamos los datos del gráfico
		ObservableList<PieChart.Data> pieChartData = 
				FXCollections.observableArrayList(
				new PieChart.Data("Grapefruit", 13), 
				new PieChart.Data("Oranges", 25), 
				new PieChart.Data("Plums", 10),
				new PieChart.Data("Pears", 22), 
				new PieChart.Data("Apples", 30));
		pieChart.setData(pieChartData);
	}
}
