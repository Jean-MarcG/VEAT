package fr.dawan.veat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest   extends TestCase
{
    public void testCreationBDD() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veat");
    	EntityManager em = emf.createEntityManager();
    	em.close();
    	assertTrue(true);
    }
}
