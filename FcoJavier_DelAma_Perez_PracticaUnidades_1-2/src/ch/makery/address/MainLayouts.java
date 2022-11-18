package ch.makery.address;

import java.io.IOException;

import ch.makery.address.model.Personas;
import ch.makery.address.view.ListaControladores;
import ch.makery.address.view.ListaControladoresPrincipal;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainLayouts extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");
		initRootLayout();
		showPersonOverview();
	}

	/** Inicializa el diseño de la pantalla principal. */
	public void initRootLayout() {
		try {

// Carga el XML con el diseño principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

// Se añade el diseño principal a la escena
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Muestra el diseño de PersonOverview dentro de la pantalla principal */
	public void showPersonOverview() {
		try {
// Cargamos el archivo PersonOverview
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts.class.getResource("view/MainLayouts.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();
			
// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(personOverview);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Returns the main stage. */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}