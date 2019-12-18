package fr.dawan.veat.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Carte extends DbObject implements Serializable {

	private String nom;
	private Date dateMaj;

	@OneToMany(mappedBy = "carte", cascade = CascadeType.ALL)
	private List<Produit> produits = new ArrayList<Produit>();

	@OneToMany(mappedBy = "carte", cascade = CascadeType.ALL)
	private List<Menu> menus = new ArrayList<Menu>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Restaurant restaurant;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Produit> getProduits() {
		return new ArrayList<Produit>(produits);
	}

	public void addProduits(Produit p) {
		produits.add(p);
	}

	public void removeProduits(Produit p) {
		produits.remove(p);
	}

	public List<Menu> getMenus() {
		return new ArrayList<Menu>(menus);
	}

	public void addMenu(Menu m) {
		menus.add(m);
	}

	public void removeMenu(Menu m) {
		menus.remove(m);
	}

	public Date getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
}
