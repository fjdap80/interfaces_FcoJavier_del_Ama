package ch.makery.address.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
* @author FcoJavier 
* @version 1.0
* 
*/

/**
 * Clase desde la cual se asignan los controles que se van 
 * a utilizar en la página RootLayout.fxml
 */
public class RootLayoutController {
	@FXML
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
	
	/**
	* Método abrirFichaEquipos() el cual accede a "FormularioEquipos.fxml"
	*
	* @param event 
	*/

	@FXML
	void abrirFichaEquipos(ActionEvent event) {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("FormularioEquipos.fxml"));
			AnchorPane Equipos = (AnchorPane) loader.load();

			rootLayout.setCenter(Equipos);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	* Método abrirFormularioClientes() el cual accede a "FormularioClientes.fxml"
	*
	* @param event 
	*/
	@FXML
	void abrirFormularioClientes(ActionEvent event) {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("FormularioClientes.fxml"));
			BorderPane DatosClientes = (BorderPane) loader.load();

			rootLayout.setCenter(DatosClientes);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	* Método abrirTutorial() el cual accede a "Instrucciones.fxml"
	*
	* @param event 
	*/
	@FXML
	void abrirTutorial(ActionEvent event) {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("Instrucciones.fxml"));
			BorderPane Tutorial = (BorderPane) loader.load();

			rootLayout.setCenter(Tutorial);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	* Método abrirInicioCorrecto() el cual accede a "RootLayout.fxml"
	*
	* @param event 
	*/
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
	/**
	* Método abrirGrafico() el cual accede a "Grafico.fxml"
	*
	* @param event 
	*/

	@FXML
	void abrirGrafico(ActionEvent event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(RootLayoutController.class.getResource("Grafico.fxml"));
			AnchorPane Inicio = (AnchorPane) loader.load();

			rootLayout.setCenter(Inicio);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
		// TODO Auto-generated method stub

	}

}
