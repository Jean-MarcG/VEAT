package fr.dawan.veat.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Menu extends DbObject implements Serializable {

	private String nom;
	private double prixTTC;
	
	@OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
	private List<Produit> produits;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Carte carte;
	
	
	
	
	
	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(double prixTTC) {
		this.prixTTC = prixTTC;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	

}
