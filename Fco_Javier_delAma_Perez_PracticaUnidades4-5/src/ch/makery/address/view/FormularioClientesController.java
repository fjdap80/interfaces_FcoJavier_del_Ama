package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

/**
* @author FcoJavier 
* @version 1.0
* 
*/

/**
 * Clase desde la cual se asignan los controles que se van 
 * a utilizar en la página FormularioClientes.fxml
 * 
 */

public class FormularioClientesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> choiceProvincia;

    @FXML
    void initialize() {
        assert choiceProvincia != null : "fx:id=\"choiceProvincia\" was not injected: check your FXML file 'FormularioClientes.fxml'.";
        choiceProvincia.getItems().addAll("Albacete", "Toledo", "Madrid", "Caceres", "Sevilla", "Valencia", "Orense");    
                                   
    }

}
