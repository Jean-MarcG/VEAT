package fr.dawan.veat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.springframework.transaction.annotation.Transactional;

import fr.dawan.veat.entities.Utilisateur;

public class UtilisateurDAO {

	@PersistenceContext
	protected EntityManager em;

	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = false)
	public void insert(Utilisateur u) {
		em.persist(u);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Utilisateur findByEmail(String email) {
		List<Utilisateur> lu = em.createQuery("FROM Utilisateur u WHERE u.email= :email").setParameter("email", email)
				.getResultList();

		Utilisateur u1 = null;

		if (lu != null && lu.size() > 0)
			u1 = lu.get(0);

		return u1;
	}

}
