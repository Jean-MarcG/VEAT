package fr.dawan.veat.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Produit extends DbObject implements Serializable {

	private String nom;
	private String description;
	private double prixTTC;

	@ManyToOne
	private Carte carte;

	@ManyToOne
	private Menu menu;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(double prixTTC) {
		this.prixTTC = prixTTC;
	}

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	

}