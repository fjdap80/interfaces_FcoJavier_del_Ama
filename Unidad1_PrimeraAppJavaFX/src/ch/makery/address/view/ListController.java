package ch.makery.address.view;

import ch.makery.address.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListController {

    @FXML
    private TableColumn<Person,String > firstNamecol1;

    @FXML
    private TableColumn<Person,String> lastNameCol2;

    @FXML
    private TableView<Person> table1;
    
    @FXML
    void initialize() {
        assert firstNamecol1 != null : "fx:id=\"firstNamecol1\" was not injected: check your FXML file 'PersonOverview.fxml'.";
        assert lastNameCol2 != null : "fx:id=\"lastNameCol2\" was not injected: check your FXML file 'PersonOverview.fxml'.";
        assert table1 != null : "fx:id=\"table1\" was not injected: check your FXML file 'PersonOverview.fxml'.";

    }
    ObservableList<Person> data = FXCollections.observableArrayList(
    		 new Person("Jacob", "Smith"),
    		 new Person("Isabel", "Johnson"),
    		 new Person("Ethan", "Williams"),
    		 new Person("Emma", "Jones"),
    		 new Person("Michael", "Brown")
    		 );
    
    		 // Se rellena la tabla con objetos de la clase Person
    		 table1.setItems(data);
    		} 

