package fr.dawan.veat.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class Restaurant extends DbObject implements Serializable {

	private String nom;

	private boolean conditionsResa;

	@ManyToOne
	private Coordonnees coordonnees;

	@Enumerated(EnumType.STRING)
	private TypeCuisine cuisine;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Carte carte;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isConditionsResa() {
		return conditionsResa;
	}

	public void setConditionsResa(boolean conditionsResa) {
		this.conditionsResa = conditionsResa;
	}


	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	public TypeCuisine getCuisine() {
		return cuisine;
	}

	public void setCuisine(TypeCuisine cuisine) {
		this.cuisine = cuisine;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}
}
