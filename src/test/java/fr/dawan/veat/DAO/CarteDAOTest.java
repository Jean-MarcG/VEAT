package fr.dawan.veat.DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dawan.veat.dao.GenericDAO;
import fr.dawan.veat.entities.Carte;
import fr.dawan.veat.entities.Menu;
import fr.dawan.veat.entities.Produit;
import fr.dawan.veat.entities.Restaurant;

public class CarteDAOTest {
	
//	List<Produit> produits = new ArrayList<Produit>();
//	List<Menu> menus = new ArrayList<Menu>();
	
	
	
	private  Restaurant restaurant = new Restaurant();
	private  Carte carte = new Carte();
	private  Produit produit = new Produit();
	private  Menu menu = new Menu();

	
	@Before
	public void createCarte() throws ParseException {
		
		restaurant.setNom("Chez Flo");
		
		carte.setDateMaj(new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2007"));
		carte.setNom("gastro");
		
		produit.setNom("NomProduit1");
		produit.setDescription("salade");
		produit.setPrixTTC(15.0);
		produit.setCarte(carte);
			
		menu.setNom("midi");
		menu.setCarte(carte);		
		carte.addMenu(menu);
		
		restaurant.addCarte(carte);
		carte.setRestaurant(restaurant);
		
		produit.setMenu(menu);
		menu.addProduits(produit);
		
		GenericDAO.create(restaurant);
		
		Assert.assertNotEquals(0, restaurant.getId());
		Assert.assertNotEquals(0, carte.getId());
		Assert.assertNotEquals(0, menu.getId());
		Assert.assertNotEquals(0, produit.getId());
	}
	
	
	@BeforeClass
	public static void init() {
		GenericDAO.deleteAll(Carte.class);
	}

	@AfterClass
	public static void clean() {
		GenericDAO.deleteAll(Carte.class);
	}

	@Test
	public void createUtilisateurTestError() {
		
		Carte carte = null;

		GenericDAO.create(carte);

		Assert.assertNull(carte);

	}
	
	@After
	public void removeCarte() {
		GenericDAO.remove(Carte.class, carte.getId());
		System.out.println(carte.getId());

		Carte u = GenericDAO.findById(Carte.class, carte.getId());

		Assert.assertNull(u);
	}
}
