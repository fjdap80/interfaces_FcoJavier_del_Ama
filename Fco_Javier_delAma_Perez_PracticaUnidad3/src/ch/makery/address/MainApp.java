package ch.makery.address;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
* Clase Main donde se inicia la aplicación
* 
* @author FcoJavier 
* @version 1.0
* 
*/

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	/**
	* Método start() que recibe un objeto de la clase Stage.
	*
	* @param primaryStage es el objeto y contenedor principal
	*/
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Práctica clase");

		initRootLayout();
	}

	/**
	 * Método initRootLayout(). Inicializa el diseño de la pantalla principal..
	 */
	
	public void initRootLayout() {
		try {
			// Carga el diseño del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Mostramos la escena del BorderPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Getter para que los controladores accedan al Stage con la ventana
	* principal
	*
	* @return El Stage vuelve a la ventana principal
	*/


	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}