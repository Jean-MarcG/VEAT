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

	private Utilisateur utilisateur1 = new Utilisateur();
	private static final String NOM_UTILISATEUR = "Dupont";
	private static final String PRENOM_UTILISATEUR = "Mathieu";
	private static final String EMAIL_UTILISATEUR = "dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR = "dawan";

	private Utilisateur utilisateur2 = new Utilisateur();
	private static final String NOM_UTILISATEUR1 = "Dupont1";
	private static final String PRENOM_UTILISATEUR1 ="Mathieu";
	private static final String EMAIL_UTILISATEUR1 ="dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR1 ="dawan";
	
	
	private Utilisateur utilisateur3 = new Utilisateur();
	private static final String NOM_UTILISATEUR2 = "Dupont2";
	private static final String PRENOM_UTILISATEUR2 ="Mathieu";
	private static final String EMAIL_UTILISATEUR2 ="dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR2 ="dawan";

	@Before
	public void createUtilisateurTest() {

		utilisateur1.setNom(NOM_UTILISATEUR);
		utilisateur1.setPrenom(PRENOM_UTILISATEUR);
		utilisateur1.setEmail(EMAIL_UTILISATEUR);
		utilisateur1.setPwd(PWD_UTILISATEUR);
		utilisateur1.setRole(TypeUtilisateur.CLIENT);

		GenericDAO.create(utilisateur1);

		Assert.assertNotEquals(0, utilisateur1.getId());

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

		Utilisateur u = GenericDAO.findById(Utilisateur.class, utilisateur1.getId());

		Assert.assertNotNull(u);
		Assert.assertEquals(NOM_UTILISATEUR, utilisateur1.getNom());
		Assert.assertEquals(PRENOM_UTILISATEUR, utilisateur1.getPrenom());
		Assert.assertEquals(EMAIL_UTILISATEUR, utilisateur1.getEmail());
		Assert.assertEquals(PWD_UTILISATEUR, utilisateur1.getPwd());

	}

	@Test
	public void updateUtilisateurTest() {

		utilisateur1.setNom("Bien");
		utilisateur1.setPrenom("JP");
		utilisateur1.setPwd("1234");
		utilisateur1.setEmail("xxx@ppp.com");
		
		
		GenericDAO.update(utilisateur1);
		
		GenericDAO.findById(Utilisateur.class, utilisateur1.getId());		

		Assert.assertEquals("Bien", utilisateur1.getNom());
		Assert.assertEquals("JP", utilisateur1.getPrenom());
		Assert.assertEquals("1234", utilisateur1.getPwd());
		Assert.assertEquals("xxx@ppp.com", utilisateur1.getEmail());

	}

	@Test
	public void findAllUtilisateurTest() {
		
		GenericDAO.deleteAll(Utilisateur.class);
		
		GenericDAO.create(utilisateur2);
		GenericDAO.create(utilisateur3);
		
		List<Utilisateur> listUtilisateur = GenericDAO.findAll(Utilisateur.class);
		
		Assert.assertNotNull(listUtilisateur);
		Assert.assertEquals(2, listUtilisateur.size());	
		
		GenericDAO.deleteAll(Utilisateur.class);

	}
	
	
	@Test
	public void findAllUtilisateurTest2() {
		
		GenericDAO.deleteAll(Utilisateur.class);
		
		GenericDAO.create(utilisateur2);
		GenericDAO.create(utilisateur3);
		
		List<Utilisateur> listUtilisateur = GenericDAO.findAll(Utilisateur.class, 0, 2);
		
		Assert.assertNotNull(listUtilisateur);
		Assert.assertEquals(2, listUtilisateur.size());	
		
		GenericDAO.deleteAll(Utilisateur.class);

	}
	

	
	@After
	public void removeUtilisateur() {

		GenericDAO.remove(Utilisateur.class, utilisateur1.getId());

		Utilisateur u = GenericDAO.findById(Utilisateur.class, utilisateur1.getId());

		Assert.assertNull(u);

	}

}
