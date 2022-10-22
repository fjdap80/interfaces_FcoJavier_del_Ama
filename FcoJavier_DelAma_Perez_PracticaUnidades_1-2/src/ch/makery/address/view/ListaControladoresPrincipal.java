package ch.makery.address.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ListaControladoresPrincipal {
	
	private BorderPane rootLayout;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BotonClientes;

    @FXML
    private Button BotonEquipos;

    @FXML
    void abrirFichaClientes(ActionEvent event) {
    	try {
    		// Cargamos el archivo Controles Dinámicos
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(ListaControladoresPrincipal.class.getResource("MainLayoutsClientes.fxml"));
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
    		// Cargamos el archivo Controles Dinámicos
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(ListaControladoresPrincipal.class.getResource("MainLayoutsEquipos.fxml"));
    		BorderPane listadoControladoresEquipos = (BorderPane) loader.load();
    		// Se sitúa en el centro del diseño principal
    		rootLayout.setCenter(listadoControladoresEquipos);
    		} catch (IOException e) {
    		e.printStackTrace();
    		}

    }

    @FXML
    void initialize() {
        assert BotonClientes != null : "fx:id=\"BotonClientes\" was not injected: check your FXML file 'RootLayout.fxml'.";
        assert BotonEquipos != null : "fx:id=\"BotonEquipos\" was not injected: check your FXML file 'RootLayout.fxml'.";

    }
   
	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout=rootLayout;
		// TODO Auto-generated method stub
		
	}

}