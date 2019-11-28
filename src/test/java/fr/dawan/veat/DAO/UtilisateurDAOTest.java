package fr.dawan.veat.DAO;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dawan.veat.dao.GenericDAO;
import fr.dawan.veat.entities.TypeUtilisateur;
import fr.dawan.veat.entities.Utilisateur;

public class UtilisateurDAOTest {

	Utilisateur utilisateur = new Utilisateur();
	private static final String NOM_UTILISATEUR = "Dupont";
	private static final String PRENOM_UTILISATEUR = "Mathieu";
	private static final String EMAIL_UTILISATEUR = "dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR = "dawan";

	Utilisateur utilisateur1 = new Utilisateur();
	private static final String NOM_UTILISATEUR1 = "Dupont1";
	private static final String PRENOM_UTILISATEUR1 ="Mathieu";
	private static final String EMAIL_UTILISATEUR1 ="dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR1 ="dawan";
	
	
	Utilisateur utilisateur2 = new Utilisateur();
	private static final String NOM_UTILISATEUR2 = "Dupont2";
	private static final String PRENOM_UTILISATEUR2 ="Mathieu";
	private static final String EMAIL_UTILISATEUR2 ="dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR2 ="dawan";

	@Before
	public void createUtilisateurTest() {

		utilisateur.setNom(NOM_UTILISATEUR);
		utilisateur.setPrenom(PRENOM_UTILISATEUR);
		utilisateur.setEmail(EMAIL_UTILISATEUR);
		utilisateur.setPwd(PWD_UTILISATEUR);
		utilisateur.setRole(TypeUtilisateur.CLIENT);

		GenericDAO.create(utilisateur);

		Assert.assertNotEquals(0, utilisateur.getId());

	}

	@BeforeClass
	public static void init() {
		GenericDAO.deleteAll(Utilisateur.class);
	}

	@AfterClass
	public static void clean() {
		GenericDAO.deleteAll(Utilisateur.class);
	}

	@Test
	public void createUtilisateurTestError() {

		Utilisateur utilisateur = null;

		GenericDAO.create(utilisateur);

		Assert.assertNull(utilisateur);

	}

	@Test
	public void findByIdUtilisateurTest() {

		Utilisateur u = GenericDAO.findById(Utilisateur.class, utilisateur.getId());

		Assert.assertNotNull(u);
		Assert.assertEquals(NOM_UTILISATEUR, utilisateur.getNom());
		Assert.assertEquals(PRENOM_UTILISATEUR, utilisateur.getPrenom());
		Assert.assertEquals(EMAIL_UTILISATEUR, utilisateur.getEmail());
		Assert.assertEquals(PWD_UTILISATEUR, utilisateur.getPwd());

	}

	@Test
	public void updateUtilisateurTest() {

		utilisateur.setNom("Bien");
		utilisateur.setPrenom("JP");
		utilisateur.setPwd("1234");
		utilisateur.setEmail("xxx@ppp.com");
		
		
		GenericDAO.update(utilisateur);
		
		GenericDAO.findById(Utilisateur.class, utilisateur.getId());		

		Assert.assertEquals("Bien", utilisateur.getNom());
		Assert.assertEquals("JP", utilisateur.getPrenom());
		Assert.assertEquals("1234", utilisateur.getPwd());
		Assert.assertEquals("xxx@ppp.com", utilisateur.getEmail());

	}

	@Test
	public void findAllUtilisateurTest() {
		
		GenericDAO.deleteAll(Utilisateur.class);
		
		GenericDAO.create(utilisateur1);
		GenericDAO.create(utilisateur2);
		
		List<Utilisateur> listUtilisateur = GenericDAO.findAll(Utilisateur.class);
		
		Assert.assertNotNull(listUtilisateur);
		Assert.assertEquals(2, listUtilisateur.size());	
		
		GenericDAO.deleteAll(Utilisateur.class);

	}
	
	
	@Test
	public void findAllUtilisateurTest2() {
		
		GenericDAO.deleteAll(Utilisateur.class);
		
		GenericDAO.create(utilisateur1);
		GenericDAO.create(utilisateur2);
		
		List<Utilisateur> listUtilisateur = GenericDAO.findAll(Utilisateur.class, 0, 2);
		
		Assert.assertNotNull(listUtilisateur);
		Assert.assertEquals(2, listUtilisateur.size());	
		
		GenericDAO.deleteAll(Utilisateur.class);

	}
	

	
	@After
	public void removeUtilisateur() {

		GenericDAO.remove(Utilisateur.class, utilisateur.getId());

		Utilisateur u = GenericDAO.findById(Utilisateur.class, utilisateur.getId());

		Assert.assertNull(u);

	}

}
