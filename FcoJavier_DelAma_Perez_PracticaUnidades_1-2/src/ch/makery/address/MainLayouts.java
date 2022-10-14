package ch.makery.address;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainLayouts extends Application {
	private BorderPane rootLayout;
private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el diseño del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Mostramos la escena del AnchorPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Muestra el diseño de PersonOverview dentro de la pantalla principal
	 */
	public void showR() {
		try {
			// Cargamos el archivo PersonOverview
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts.class.getResource("view/MainLayouts.fxml"));
			BorderPane personOverview = (BorderPane) loader.load();

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
