package fr.dawan.veat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.veat.entities.Utilisateur;



public class UtilisateurDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	
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
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Utilisateur> findAll(int start, int nbElts) {
		List<Utilisateur> lu = em.createQuery("FROM User u")
							.setFirstResult(start)
							.setMaxResults(nbElts)
			.getResultList();
		return lu;
	}
	
	@Transactional(readOnly = true)
	public long count() {
		Long nb = (Long) em.createQuery("SELECT COUNT(u.id) FROM User u")
			.getSingleResult();
		return nb;
	}
	
	@Transactional(readOnly = false)
	public void insert(Utilisateur u) {
		em.persist(u);
	}
	
	
	
	
}

