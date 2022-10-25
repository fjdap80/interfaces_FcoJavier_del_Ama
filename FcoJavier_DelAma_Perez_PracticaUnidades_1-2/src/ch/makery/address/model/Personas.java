package ch.makery.address.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Personas {
	private SimpleStringProperty firstName;
	private SimpleStringProperty lastName;
	private SimpleStringProperty email;
	private SimpleStringProperty localidad;

	public Personas(String fName, String lName, String email, String localidad) {
		this.firstName = new SimpleStringProperty(fName);
		this.lastName = new SimpleStringProperty(lName);
		this.email = new SimpleStringProperty(email);
		this.localidad = new SimpleStringProperty(localidad);

	}

	public String getFirstName() {
		return firstName.get();
	}

	public String getLastName() {
		return lastName.get();
	}

	public String getEmail() {
		return email.get();
	}

	public String getLocalidad() {
		return localidad.get();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public void setLocalidad(String localidad) {
		this.localidad.set(localidad);
	}

}
