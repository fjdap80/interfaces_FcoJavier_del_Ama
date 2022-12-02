package ch.makery.address.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class RootLayoutController {
	private BorderPane rootLayout;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private MenuItem BotonClientes;

	@FXML
	private Menu BotonEquipos;

	@FXML
	private MenuItem BotonInicio;

	@FXML
	private MenuItem BotonAyuda;

	@FXML
	private Menu BotonTutorial;

	@FXML
	void initialize() {
		assert BotonAyuda != null : "fx:id=\"BotonAyuda\" was not injected: check your FXML file 'RootLayout.fxml'.";
		assert BotonClientes != null
				: "fx:id=\"BotonClientes\" was not injected: check your FXML file 'RootLayout.fxml'.";
		assert BotonEquipos != null
				: "fx:id=\"BotonEquipos\" was not injected: check your FXML file 'RootLayout.fxml'.";
		assert BotonInicio != null : "fx:id=\"BotonInicio\" was not injected: check your FXML file 'RootLayout.fxml'.";
		assert BotonTutorial != null
				: "fx:id=\"BotonTutorial\" was not injected: check your FXML file 'RootLayout.fxml'.";

	}

	@FXML
	void abrirFichaClientes(ActionEvent event) {
		try {
			// Cargamos el archivo Controles Dinámicos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("PersonOverview.fxml"));
			BorderPane listadoControladoresClientes = (BorderPane) loader.load();
			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(listadoControladoresClientes);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void abrirFichaEquipos(ActionEvent event) {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("MainLayoutsEquipos.fxml"));
			BorderPane listadoControladoresEquipos = (BorderPane) loader.load();

			rootLayout.setCenter(listadoControladoresEquipos);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void abrirTutorial(ActionEvent event) {

		try {
			System.out.println("hola hola");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("Tutorial.fxml"));
			BorderPane Tutorial = (BorderPane) loader.load();

			rootLayout.setCenter(Tutorial);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void abrirInicioCorrecto(ActionEvent event) {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("RootLayout.fxml"));
			BorderPane Inicio = (BorderPane) loader.load();

			rootLayout.setCenter(Inicio);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void abrirAyuda(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("Tutorial.fxml"));
			BorderPane Ayuda = (BorderPane) loader.load();

			rootLayout.setCenter(Ayuda);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
		// TODO Auto-generated method stub

	}

}

