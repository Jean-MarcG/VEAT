package fr.dawan.veat.DAO;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.dawan.veat.dao.GenericDAO;
import fr.dawan.veat.entities.Carte;
import fr.dawan.veat.entities.Menu;
import fr.dawan.veat.entities.Produit;
import fr.dawan.veat.entities.Restaurant;

public class CarteDAOTest {
	
	
	Carte carte;
//	List<Produit> produits = new ArrayList<Produit>();
//	List<Menu> menus = new ArrayList<Menu>();
	Restaurant restaurant;
	
	
	@Before
	public void createCarte() throws ParseException {
		Restaurant restaurant = new Restaurant();
		restaurant.setNom("Chez Flo");
		
		Carte carte = new Carte();
		carte.setDateMaj(new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2007"));
		carte.setNom("gastro");
		
		Produit produit = new Produit();
		produit.setNom("NomProduit1");
		produit.setDescription("salade");
		produit.setPrixTTC(15.0);
		produit.setCarte(carte);
			
		Menu menu = new Menu();
		menu.setNom("midi");
		
		produit.setMenu(menu);
		menu.setCarte(carte);		
		
		menu.addProduits(produit);
		carte.addMenu(menu);
		restaurant.setCarte(carte);
		GenericDAO.create(restaurant);
		
		Assert.assertNotEquals(0, restaurant.getId());
		Assert.assertNotEquals(0, carte.getId());
		Assert.assertNotEquals(0, menu.getId());
		Assert.assertNotEquals(0, produit.getId());
	}
	

	@Test
	public void test() {
	}

}
