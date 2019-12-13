package fr.dawan.veat.DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dawan.veat.dao.GenericDao;
import fr.dawan.veat.entities.Carte;
import fr.dawan.veat.entities.Menu;
import fr.dawan.veat.entities.Produit;
import fr.dawan.veat.entities.Restaurant;
import fr.dawan.veat.entities.Utilisateur;

public class CarteDAOTest {

	// List<Produit> produits = new ArrayList<Produit>();
	// List<Menu> menus = new ArrayList<Menu>();

	private Restaurant restaurant = new Restaurant();
	private Carte carte1 = new Carte();
	private Carte carte2 = new Carte();
	private Carte carte3 = new Carte();
	
	
	private Produit produit = new Produit();
	private Menu menu = new Menu();
	
	Date date = new Date();
    long timeEnMs = date.getTime();
    Date dateTime = new Date(timeEnMs); 
	
	
	
	
	@Before
	public void createCarte() throws ParseException {

		restaurant.setNom("Chez Flo");
		
		carte1.setDateMaj(new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2007"));
		carte1.setNom("gastro");

		produit.setNom("NomProduit1");
		produit.setDescription("salade");
		produit.setPrixTTC(15.0);

		menu.setNom("midi");
		menu.setCarte(carte1);
		carte1.addMenu(menu);

		restaurant.addCarte(carte1);
		carte1.setRestaurant(restaurant);

		produit.setMenu(menu);
		menu.addProduits(produit);

		GenericDao.create(restaurant);

		Assert.assertNotEquals(0, restaurant.getId());
		Assert.assertNotEquals(0, carte1.getId());
		Assert.assertNotEquals(0, menu.getId());
		Assert.assertNotEquals(0, produit.getId());
	}

	@BeforeClass
	public static void init() {
		cleanDB();
	}

	@AfterClass
	public static void clean() {
		cleanDB();
	}

	private static void cleanDB() {
		GenericDao.deleteAll(Restaurant.class);
		GenericDao.deleteAll(Produit.class);
		GenericDao.deleteAll(Menu.class);
		GenericDao.deleteAll(Carte.class);
	}

	@Test
	public void createUtilisateurTestError() {

		Carte carte = null;

		GenericDao.create(carte);

		Assert.assertNull(carte);
	}

	@Test
	public void findByIdCarteTest() {

		Carte u = GenericDao.findById(Carte.class, carte1.getId());

		Assert.assertNotNull(u);
	}

	@Test
	public void updateUtilisateurTest() throws ParseException {
		
		
		carte1.setNom("diarrhée");
		carte1.setDateMaj(dateTime);

		GenericDao.update(carte1);

		GenericDao.findById(Carte.class, carte1.getId());

		Assert.assertEquals("diarrhée", carte1.getNom());
		Assert.assertEquals(dateTime, carte1.getDateMaj());
	}
	
	@Test
	public void findAllCarteTest() {
		
		

		List<Carte> listCarte = GenericDao.findAll(Carte.class);
		
		Assert.assertNotNull(listCarte);
		Assert.assertEquals(3, listCarte.size());	

	}
	
	@Test
	public void findAllCarteTest2() {
				
		GenericDao.create(carte2);
		GenericDao.create(carte3);
		
		List<Carte> listCarte = GenericDao.findAll(Carte.class, 0, 2);
		
		Assert.assertNotNull(listCarte);
		Assert.assertEquals(2, listCarte.size());	
		
	}

	@After
	public void removeCarte() {
		GenericDao.remove(Restaurant.class, restaurant.getId());
		System.out.println(carte1.getId());

		Carte u = GenericDao.findById(Carte.class, carte1.getId());

		Assert.assertNull(u);
	}
}
