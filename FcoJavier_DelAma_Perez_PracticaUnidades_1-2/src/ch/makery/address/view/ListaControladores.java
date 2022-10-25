package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;
import ch.makery.address.model.Personas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaControladores {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Personas,String > ColNombre;

    @FXML
    private TableColumn<Personas,String> colApellidos;

    @FXML
    private TableColumn<Personas,String> colEmail;

    @FXML
    private TableColumn<Personas,String> colLocalidad;

    @FXML
    private ChoiceBox<?> localidad;

    @FXML
    private TableView<Personas> tablaDatos;

    @FXML
    void initialize() {
    	
    	ColNombre.setCellValueFactory(new PropertyValueFactory<Personas,String>("firstName"));
    	colApellidos.setCellValueFactory(new PropertyValueFactory<Personas,String>("lastName"));
    	colEmail.setCellValueFactory(new PropertyValueFactory<Personas,String>("email"));
    	colLocalidad.setCellValueFactory(new PropertyValueFactory<Personas,String>("localidad"));
    	
        assert ColNombre != null : "fx:id=\"ColNombre\" was not injected: check your FXML file 'MainLayoutsClientes.fxml'.";
        assert colApellidos != null : "fx:id=\"colApellidos\" was not injected: check your FXML file 'MainLayoutsClientes.fxml'.";
        assert colEmail != null : "fx:id=\"colEmail\" was not injected: check your FXML file 'MainLayoutsClientes.fxml'.";
        assert colLocalidad != null : "fx:id=\"colLocalidad\" was not injected: check your FXML file 'MainLayoutsClientes.fxml'.";
        assert localidad != null : "fx:id=\"localidad\" was not injected: check your FXML file 'MainLayoutsClientes.fxml'.";
        assert tablaDatos != null : "fx:id=\"tablaDatos\" was not injected: check your FXML file 'MainLayoutsClientes.fxml'.";

        ObservableList<Personas> data = FXCollections.observableArrayList(
       		 new Personas("Jacob", "Smith","Bruno@gmail.com","Aranjuez"),
       		 new Personas("Mariano", "Ortega","Mariano@gmail.com","Sevilla"),
       		 new Personas("Roberto", "Jimenez","Roberto@gsumail.com","Albacete"),
       		 new Personas("Pepito", "Garcia","Pepito@gsumail.com","Valencia"),
       		 new Personas("Juan", "Gomez","Juan@gsumail.com","Alicante"),
       		 new Personas("Rocio", "Fernandez","Rocio@gsumail.com","Madrid"),
       		 new Personas("Ana", "Romero","Ana@gsumail.com","Toledo"),
       		 new Personas("Pedro", "Ramirez","Pedro@gsumail.com","Cuenca"),
       		 new Personas("Rosario", "Suarez","Rosario@gsumail.com","Romangordo")
       		 );
       
       		 // Se rellena la tabla con objetos de la clase Person
       		 tablaDatos.setItems(data);
       		} 
    }
    


