package fr.dawan.veat.DAO;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import fr.dawan.veat.dao.ReservationDAO;
import fr.dawan.veat.entities.Reservation;
import fr.dawan.veat.entities.Utilisateur;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ReservationDAOTest {

	private Reservation reservation1 = new Reservation();
	private Utilisateur utilisateur1 = new Utilisateur();
	
//	Date date = new Date();
//    long timeEnMs = date.getTime();
//    Date dateTime = new Date(timeEnMs);
	
	private static final String NOM_UTILSATEUR = "Dupont";
	private static final String PRENOM_UTILISATEUR = "Mathieu";
	private static final String EMAIL_UTILISATEUR = "dupontmathieu@gmail.com";
	private static final Date DATE_RESERVATION = new Date();
	private static final short NOMBRE_COUVERT = 12; 
	

	
	@Before
	public void reserverRestaurant() throws ParseException {
		
		//restaurant.getId();
		utilisateur1.setNom(NOM_UTILSATEUR);
		utilisateur1.setPrenom(PRENOM_UTILISATEUR);
		utilisateur1.setEmail(EMAIL_UTILISATEUR);
		// utilisateur.setCoordonnees("");
		
		
		reservation1.setDateTimeResa(new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2007"));
		reservation1.setNombreCouverts((short) 12);
		
		
		ReservationDAO.create(reservation1);
		
		Assert.assertNotEquals(1, utilisateur1.getId());
	}

	@BeforeClass
	public static void init() {
		ReservationDAO.creerReservation(Reservation.class);
	}
	
	@AfterClass
	public static void clean() {
		ReservationDAO.creerReservation(Reservation.class);
	}
	
	@Test
	public void createReservationTestError() {

		Reservation reservation = null;
		
		ReservationDAO.create(reservation1);
		
		Assert.assertNotNull(reservation1);
		
	}
	
	@After
	public void removeReservation() {
		ReservationDAO.removeReservation(Reservation.class, reservation1.getId());
		System.out.println(reservation1.getId());
		
		Reservation r = ReservationDAO.findById(Reservation.class, reservation1.getId());
		
		Assert.assertNull(r);
	}
	
	

}
