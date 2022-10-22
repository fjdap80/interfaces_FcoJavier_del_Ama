package ch.makery.address.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Personas {
	private final SimpleStringProperty firstName;
	private final SimpleStringProperty lastName;
	private final SimpleStringProperty email;
	private final SimpleStringProperty localidad;
	
	

	public Personas(String fName, String lName,String email,String localidad) {
		this.firstName = new SimpleStringProperty(fName);
		this.lastName = new SimpleStringProperty(lName);
		this.email = new SimpleStringProperty(email);
		this.localidad = new SimpleStringProperty(localidad);
		
	}



	public SimpleStringProperty getFirstName() {
		return firstName;
	}



	public SimpleStringProperty getLastName() {
		return lastName;
	}



	public SimpleStringProperty getEmail() {
		return email;
	}



	public SimpleStringProperty getLocalidad() {
		return localidad;
	}

	
}
