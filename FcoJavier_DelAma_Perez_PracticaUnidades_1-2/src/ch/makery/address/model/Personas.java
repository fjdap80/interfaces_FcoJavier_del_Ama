package ch.makery.address.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Personas {
	private final SimpleStringProperty firstName;
	private final SimpleStringProperty lastName;
	

	public Personas(String fName, String lName) {
		this.firstName = new SimpleStringProperty(fName);
		this.lastName = new SimpleStringProperty(lName);
		
	}

	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String fName) {
		firstName.set(fName);
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lName) {
		lastName.set(lName);
	}

	

}
