package fr.dawan.veat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation extends DbObject implements Serializable {
	
	@Temporal(TemporalType.DATE)
	private Date dateTimeResa;
	
	private short nombreCouverts;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Restaurant restaurant;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Utilisateur client;

	public Date getDateTimeResa() {
		return dateTimeResa;
	}

	public void setDateTimeResa(Date dateTimeResa) {
		this.dateTimeResa = dateTimeResa;
	}

	

	
	public short getNombreCouverts() {
		return nombreCouverts;
	}

	public void setNombreCouverts(short nombreCouverts) {
		this.nombreCouverts = nombreCouverts;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Utilisateur getClient() {
		return client;
	}

	public void setClient(Utilisateur client) {
		this.client = client;
	}
	
	

}