package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;

public class ListaControladores {
	private ObservableList<String> data = FXCollections.observableArrayList();
	private ObservableList<String> names = FXCollections.observableArrayList();

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField choice1;

	@FXML
	private ChoiceBox<Object> localidad;

	@FXML
	void initialize() {
		
		localidad.setItems(
				FXCollections.observableArrayList("Madrid", "Barcelona","Andalucía", "Galicia"));
		localidad.setValue("Seleccionar");

		for (int i = 0; i < 10; i++) {
			data.add("Indeterminate(pick a choice)");

		}
		assert choice1 != null : "fx:id=\"choice1\" was not injected: check your FXML file 'MainLayouts.fxml'.";
		assert localidad != null : "fx:id=\"localidad\" was not injected: check your FXML file 'MainLayouts.fxml'.";

	}

}
