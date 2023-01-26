package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.TextFieldListCell;

public class FormularioEquiposController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ChoiceBox<String> ChoiceBoxSobremesa;

	@FXML
	private ComboBox<String> ComboBoxSobremesa;
	 @FXML
	private ComboBox<String> ComboMarcaPortatil;

	/*
	 * @FXML void initialize() { assert ListViewModelos != null :
	 * "fx:id=\"ListViewModelos\" was not injected: check your FXML file 'FormularioEquipos.fxml'."
	 * ; // Ítems del ListView (con la segunda línea se asigna un CellFactory para
	 * permitir que sean editables) ListViewModelos.getItems().addAll("Lista1",
	 * "Lista2", "Lista3");
	 * ListViewModelos.setCellFactory(TextFieldListCell.forListView()); // Para
	 * seleccionar más de un ítem a la vez
	 * ListViewModelos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	 */
	@FXML
	void initialize() {
		assert ChoiceBoxSobremesa != null
				: "fx:id=\"ChoiceBoxSobremesa\" was not injected: check your FXML file 'FormularioEquipos.fxml'.";
		assert ComboBoxSobremesa != null
				: "fx:id=\"ComboBoxSobremesa\" was not injected: check your FXML file 'FormularioEquipos.fxml'.";

		ChoiceBoxSobremesa.getItems().addAll("Albacete", "Toledo", "Madrid", "Caceres", "Sevilla", "Valencia",
				"Orense");

		// Ítems del ComboBox
		ComboBoxSobremesa.getItems().addAll("Combo1", "Combo2", "Combo3", "Combo4", "Combo5", "Combo6", "Combo7",
				"Combo8", "Combo9");
		
		ComboMarcaPortatil.getItems().addAll("Combo1", "Combo2", "Combo3", "Combo4", "Combo5", "Combo6", "Combo7",
				"Combo8", "Combo9");
		
		

	}

}
