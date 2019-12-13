package fr.dawan.veat.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import fr.dawan.veat.dao.GenericDao;
import fr.dawan.veat.entities.TypeUtilisateur;
import fr.dawan.veat.entities.Utilisateur;

public class UtilisateurDAOTest {

	private Utilisateur utilisateur1 = new Utilisateur();
	private static final String NOM_UTILISATEUR = "Dupont";
	private static final String PRENOM_UTILISATEUR = "Mathieu";
	private static final String EMAIL_UTILISATEUR = "dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR1 = "dawan";

	private Utilisateur utilisateur2 = new Utilisateur();
	private static final String NOM_UTILISATEUR2 = "Dupont1";
	private static final String PRENOM_UTILISATEUR2 ="Mathieu";
	private static final String EMAIL_UTILISATEUR2 ="dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR2 ="dawan";
	
	
	private Utilisateur utilisateur3 = new Utilisateur();
	private static final String NOM_UTILISATEUR3 = "Dupont2";
	private static final String PRENOM_UTILISATEUR3 ="Mathieu";
	private static final String EMAIL_UTILISATEUR3 ="dupontmathieu@gmail.com";
	private static final String PWD_UTILISATEUR3 ="dawan";
	
	@PersistenceContext
	protected EntityManager em;
	
	@Before
	public void createUtilisateurTest() {

		utilisateur1.setNom(NOM_UTILISATEUR);
		utilisateur1.setPrenom(PRENOM_UTILISATEUR);
		utilisateur1.setEmail(EMAIL_UTILISATEUR);
		utilisateur1.setPwd(PWD_UTILISATEUR1);
		utilisateur1.setRole(TypeUtilisateur.CLIENT);

		GenericDao.create(utilisateur1);

		Assert.assertNotEquals(0, utilisateur1.getId());

	}

	@BeforeClass
	public static void init() {
		GenericDao.deleteAll(Utilisateur.class);
	}

	@AfterClass
	public static void clean() {
		GenericDao.deleteAll(Utilisateur.class);
	}

	@Test
	public void createUtilisateurTestError() {

		Utilisateur utilisateur = null;

		GenericDao.create(utilisateur);

		Assert.assertNull(utilisateur);

	}

	@Test
	public Utilisateur findByIdUtilisateurTest() {

		Utilisateur u = GenericDao.findById(Utilisateur.class, utilisateur1.getId());

		Assert.assertNotNull(u);
		Assert.assertEquals(NOM_UTILISATEUR, utilisateur1.getNom());
		Assert.assertEquals(PRENOM_UTILISATEUR, utilisateur1.getPrenom());
		Assert.assertEquals(EMAIL_UTILISATEUR, utilisateur1.getEmail());
		Assert.assertEquals(PWD_UTILISATEUR1, utilisateur1.getPwd());
		
		return u;
	}

	@Test
	public void updateUtilisateurTest() {

		utilisateur1.setNom("Bien");
		utilisateur1.setPrenom("JP");
		utilisateur1.setPwd("1234");
		utilisateur1.setEmail("xxx@ppp.com");
		
		
		GenericDao.update(utilisateur1);
		
		GenericDao.findById(Utilisateur.class, utilisateur1.getId());		

		Assert.assertEquals("Bien", utilisateur1.getNom());
		Assert.assertEquals("JP", utilisateur1.getPrenom());
		Assert.assertEquals("1234", utilisateur1.getPwd());
		Assert.assertEquals("xxx@ppp.com", utilisateur1.getEmail());

	}

	@Test
	public List<Utilisateur> findAllUtilisateurTest() {
				
		GenericDao.create(utilisateur2);
		GenericDao.create(utilisateur3);
		
		List<Utilisateur> listUtilisateur = GenericDao.findAll(Utilisateur.class);
		
		Assert.assertNotNull(listUtilisateur);
		Assert.assertEquals(3, listUtilisateur.size());	
		
		return listUtilisateur;
	}
	
	
	@Test
	public List<Utilisateur> findAllUtilisateurTest2() {
				
		GenericDao.create(utilisateur2);
		GenericDao.create(utilisateur3);
		
		List<Utilisateur> listUtilisateur = GenericDao.findAll(Utilisateur.class, 0, 2);
		
		Assert.assertNotNull(listUtilisateur);
		Assert.assertEquals(2, listUtilisateur.size());	
		
		return listUtilisateur;
	}
	
	@Test
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Utilisateur findByEmail(String email) {
		List<Utilisateur> lu = em.createQuery("FROM User u WHERE u.email= :email")
			.setParameter("email", email)
			.getResultList();
		Utilisateur u = null;
		if(lu!=null && lu.size()>0)
			u = lu.get(0);
		
		return u;
	}

	
	@After
	public void removeUtilisateur() {

		GenericDao.remove(Utilisateur.class, utilisateur1.getId());

		Utilisateur u = GenericDao.findById(Utilisateur.class, utilisateur1.getId());

		Assert.assertNull(u);

	}

}
