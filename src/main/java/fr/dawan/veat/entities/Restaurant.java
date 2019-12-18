package fr.dawan.veat.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
	private List<Carte> cartes = new ArrayList<Carte>();

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

	public List<Carte> getCarte() {
		return new ArrayList<Carte>(cartes);
	}

	public void addCarte(Carte carte) {
		if (carte != null) {
			this.cartes.add(carte);
		}
	}
	
	public void removeCarte(Carte carte) {
		if (carte != null) {
			this.cartes.remove(carte);
		}
	}
}
