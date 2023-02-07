package ch.makery.address.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTreeCell;

/**
* @author FcoJavier 
* @version 1.0
* 
* 
*/

/**
 * Clase desde la cual se asignan los controles que se van a utilizar en la
 * página FormularioEquipos.fxml
 * 
 */
public class FormularioEquiposController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;
	@FXML
	private ComboBox<String> ComboBoxSobremesa;
	@FXML
	private ComboBox<String> ComboMarcaPortatil;
	@FXML
	private ComboBox<String> ComboBoxModeloPortatil;
	@FXML
	private TreeView<String> TreeViewSobremesa;

	@FXML
	void initialize() {

		assert ComboBoxSobremesa != null
				: "fx:id=\"ComboBoxSobremesa\" was not injected: check your FXML file 'FormularioEquipos.fxml'.";

		
		ComboBoxSobremesa.getItems().addAll("HP", "Lenovo", "Asus", "Dell", "Samsung", "MSI", "Apple");

		ComboMarcaPortatil.getItems().addAll("HP", "Lenovo", "Asus", "Dell", "Samsung", "MSI", "Combo7");
		ComboBoxModeloPortatil.getItems().addAll("Chromebook", "IdeaPad", "Galaxy Book", "XPS", "Gaming GL66",
				"MacBook", "ViviBook");
		TreeItem<String> rootItem = new TreeItem<String>("Modelos");

		// TreeItem<String> javaItem = new TreeItem<String>(MacBooks");
		rootItem.getChildren().add(new TreeItem<String>("Legion"));
		rootItem.getChildren().add(new TreeItem<String>("Pavilion"));
		rootItem.getChildren().add(new TreeItem<String>("Nitro"));
		rootItem.getChildren().add(new TreeItem<String>("Omen"));
		rootItem.getChildren();

		// Para que sea editable necesitamos especificar un CellFactory con el tipo que
		// corresponda
		TreeViewSobremesa.setCellFactory(TextFieldTreeCell.forTreeView());

		// Expadimos por defecto el ítem raíz
		rootItem.setExpanded(true);
		TreeViewSobremesa.setRoot(rootItem);
		System.out.println(TreeViewSobremesa.getExpandedItemCount());

	}

}
