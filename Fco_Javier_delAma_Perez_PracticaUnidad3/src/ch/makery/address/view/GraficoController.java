package ch.makery.address.view;

import java.net.URL;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.scene.chart.StackedBarChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

/**
* @author FcoJavier 
* @version 1.0
* 
*/

public class GraficoController {
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private PieChart pieChart;
	@FXML
	private LineChart<String, Integer> LineChart;
	@FXML
	private CategoryAxis xAxis;

	@FXML
	private NumberAxis yAxis;
	@FXML
	private StackedBarChart<String, Integer> StackedBarChat;

	@FXML
	private CategoryAxis cAxis;

	@FXML
	private NumberAxis nAxis;

	@FXML
	private void initialize() {
		// Rellenamos los datos del gráfico
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data("Enero", 13),
				new PieChart.Data("Febreo", 25), new PieChart.Data("Marzo", 10), new PieChart.Data("Abril", 22),
				new PieChart.Data("Mayo", 30), new PieChart.Data("Junio", 20), new PieChart.Data("Julio", 32),
				new PieChart.Data("Agosto", 14), new PieChart.Data("Septiembre", 30), new PieChart.Data("Octubre", 18),
				new PieChart.Data("Noviembre", 13), new PieChart.Data("Diciembre", 21));

		pieChart.setData(pieChartData);

		String[] months = DateFormatSymbols.getInstance(Locale.ENGLISH).getShortMonths();
		ObservableList<String> monthNames = FXCollections.observableArrayList();
		// Se convierte el array con los meses a una ObservableList
		monthNames.addAll(Arrays.asList(months));

		// Se asignan los nombres de meses en el eje horizontal
		xAxis.setCategories(monthNames);
		XYChart.Series<String, Integer> series = new XYChart.Series<String, Integer>();
		series.setName("Ganancias 2018");

		series.getData().add(new XYChart.Data<String, Integer>("Jan", 23));
		series.getData().add(new XYChart.Data<String, Integer>("Feb", 14));
		series.getData().add(new XYChart.Data<String, Integer>("Mar", -15));
		series.getData().add(new XYChart.Data<String, Integer>("Apr", 24));
		series.getData().add(new XYChart.Data<String, Integer>("May", -34));
		series.getData().add(new XYChart.Data<String, Integer>("Jun", 36));
		series.getData().add(new XYChart.Data<String, Integer>("Jul", 22));
		series.getData().add(new XYChart.Data<String, Integer>("Aug", 45));
		series.getData().add(new XYChart.Data<String, Integer>("Sep", 43));
		series.getData().add(new XYChart.Data<String, Integer>("Oct", 17));
		series.getData().add(new XYChart.Data<String, Integer>("Nov", 29));
		series.getData().add(new XYChart.Data<String, Integer>("Dec", 25));

		// Se añade la primera serie
		LineChart.getData().add(series);
		XYChart.Series<String, Integer> series2 = new XYChart.Series<String, Integer>();

		series2.setName("Ganancias 2019");
		series2.getData().add(new XYChart.Data<String, Integer>("Jan", -33));
		series2.getData().add(new XYChart.Data<String, Integer>("Feb", 34));
		series2.getData().add(new XYChart.Data<String, Integer>("Mar", 25));
		series2.getData().add(new XYChart.Data<String, Integer>("Apr", 44));
		series2.getData().add(new XYChart.Data<String, Integer>("May", 39));
		series2.getData().add(new XYChart.Data<String, Integer>("Jun", 16));
		series2.getData().add(new XYChart.Data<String, Integer>("Jul", -55));
		series2.getData().add(new XYChart.Data<String, Integer>("Aug", 54));
		series2.getData().add(new XYChart.Data<String, Integer>("Sep", 48));
		series2.getData().add(new XYChart.Data<String, Integer>("Oct", 27));
		series2.getData().add(new XYChart.Data<String, Integer>("Nov", 37));
		series2.getData().add(new XYChart.Data<String, Integer>("Dec", 29));

		// Se añade la segunda serie
		LineChart.getData().add(series2);
		
		cAxis.setCategories(monthNames);
		XYChart.Series<String, Integer> seriesBarChart = new XYChart.Series<String, Integer>();
		seriesBarChart.setName("Ganancias 2018");

		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Jan", 23));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Feb", 14));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Mar", -10));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Apr", 24));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("May", -34));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Jun", 36));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Jul", 22));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Aug", 45));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Sep", 43));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Oct", 17));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Nov", 29));
		seriesBarChart.getData().add(new XYChart.Data<String, Integer>("Dec", 25));

		// Se añade la primera serie
		StackedBarChat.getData().add(seriesBarChart);
		XYChart.Series<String, Integer> seriesBarChart2 = new XYChart.Series<String, Integer>();

		seriesBarChart2.setName("Ganancias 2019");
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Jan", -33));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Feb", 34));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Mar", 40));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Apr", 44));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("May", 56));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Jun", 16));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Jul", -55));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Aug", 54));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Sep", 48));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Oct", 27));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Nov", 37));
		seriesBarChart2.getData().add(new XYChart.Data<String, Integer>("Dec", 29));

		// Se añade la segunda serie
		StackedBarChat.getData().add(seriesBarChart2);
	}
}
