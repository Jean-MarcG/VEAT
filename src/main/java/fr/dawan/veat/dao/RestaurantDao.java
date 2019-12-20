package fr.dawan.veat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.veat.entities.Restaurant;

public class RestaurantDao {

	@PersistenceContext
	protected EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Restaurant findByName(String nom) {

		List<Restaurant> lr = em.createQuery("FROM Restaurant r WHERE r.name= :name").setParameter("name", nom)
				.getResultList();
		Restaurant r = null;
		if (lr != null && lr.size() > 0)
			r = lr.get(0);

		return r;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Restaurant findById(Long id) {

		List<Restaurant> lr = em.createQuery("FROM Restaurant r WHERE r.id= :id").setParameter("id", id)
				.getResultList();
		Restaurant r = null;
		if (lr != null && lr.size() > 0)
			r = lr.get(0);

		return r;
	}
	//@Todo faire une requete avec par exemple "FROM Restaurant r WHERE r.coordonnee.ville = :ville" 
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Restaurant> findByVille(String ville) {

		List<Restaurant> lr = em.createQuery("FROM Restaurant r WHERE r.coordonnees.ville = :ville").setParameter("ville", ville)
				.getResultList();
		return lr;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Restaurant> findByPays(String pays) {

		List<Restaurant> lr = em.createQuery("FROM Restaurant r1 WHERE r1.coordonnees.pays = :pays").setParameter("pays", pays)
				.getResultList();
		return lr;
	}
	

	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Restaurant> findAll(int start, int nbElts) {
		List<Restaurant> lr = em.createQuery("FROM Restaurant r")
							.setFirstResult(start)
							.setMaxResults(nbElts)
			.getResultList();
		return lr;
	}
	
	
	@Transactional(readOnly = true)
	public long count() {
		Long nb = (Long) em.createQuery("SELECT COUNT(r.id) FROM Restaurant r")
			.getSingleResult();
		return nb;
	}
	
	@Transactional(readOnly = false)
	public void insert(Restaurant r) {
		em.persist(r);
	}
	
	@Transactional(readOnly = false)
	public int delete1(long id) {
		int nb = em.createQuery("DELETE FROM Restaurant r WHERE r.id= :id")
					.setParameter("id", id)
					.executeUpdate();
		return nb;
	}
	

}
