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
	
	@OneToMany(mappedBy = "carte",cascade = CascadeType.ALL)
	private List<Produit> produits;
	
	@OneToMany(mappedBy="carte", cascade = CascadeType.ALL)
	private List<Menu> menus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Restaurant restaurant;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Produit> getProduits(){
        return new ArrayList<Produit>(produits);
    }
    
    public void addProduits(Produit r) {
        produits.add(r);
    }
    
    public void removeProduits(Produit r) {
        produits.remove(r);
    }
    
    public List<Menu> getMenus(){
    	return new ArrayList<Menu>(menus);
    }
    
    public void addMenus(Menu m) {
        menus.add(m);
    }
    
    public void removeMenuss(Menu m) {
        menus.remove(m);
    }
	public Date getDateMaj() {
		return dateMaj;
	}
	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	

	
	
	
}
