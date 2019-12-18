package fr.dawan.veat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.dawan.veat.entities.DbObject;

public class GenericDAO {

	public static <T extends DbObject> void create(T entity) {
		if (entity != null && entity.getId() == 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			try {
				// début de la transaction
				transaction.begin();

				// On insere la formation dans la BDD
				entityManager.persist(entity);

				// on commit tout ce qui s'est fait dans la transaction
				transaction.commit();

			} catch (Exception ex) {
				// en cas d'erreur on effectue un rollback
				transaction.rollback();

				ex.printStackTrace();
			} finally {
				entityManager.close();
			}
		}
	}

	public static <T extends DbObject> T findById(Class<T> clazz, long id) {
		EntityManager entityManager = createEntityManager();
		T entity = null;
		try {
			entity = entityManager.find(clazz, id);
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			entityManager.close();
		}
		return entity;
	}

	public static <T extends DbObject> void update(T entity) {
		if (entity.getId() > 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			try {
				// début de la transaction
				transaction.begin();

				// on met à jour la formation
				entityManager.merge(entity);

				// on commit tout ce qui a été fait dans la transaction
				transaction.commit();

			} catch (Exception ex) {
				// en cas d'erreur, on effectue un rollback
				transaction.rollback();

				ex.printStackTrace();
			} finally {
				entityManager.close();
			}
		}
	}

	/**
	 * Permet de récupérer toutes les entrées pour une table données à partir
	 * d'une entrée, pour un nombre de résultat donné
	 * 
	 * @param nbResult : le nombre de résultat que l'on souhaite récupérer
	 * @param clazz    : le type que l'on souhaite récupérer
	 * @param begin    : l'index du premier résultat que l'on souhaite récupérer
	 * @return une liste d'entrees paginée
	 */
	public static <T extends DbObject> List<T> findAll(Class<T> clazz) {
		List<T> resultat = null;
		EntityManager em = createEntityManager();
		// on crée la requete
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on execute la requette et on récupere le resultat
		resultat = query.getResultList();
		em.close();
		return resultat;
	}

	public static <T extends DbObject> List<T> findAll(Class<T> clazz, int begin, int nbResult) {
		List<T> resultat = null;
		EntityManager em = createEntityManager();
		// on crée la requete
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on parametre et on execute la requette et on récupere le resultat
		resultat = query.setFirstResult(begin)// On commence à ce numéro(begin)
				.setMaxResults(nbResult)// on charge nbResult résultats
				.getResultList();// on recupere le resultat
		em.close();
		return resultat;
	}

	public static <T extends DbObject> void remove(Class<T> clazz, long id) {
		EntityManager entityManager = createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			// début de la transaction
			transaction.begin();
			T f = entityManager.find(clazz, id);
			entityManager.remove(f);

			// on commit tout ce qui s'est fait dans la transaction
			transaction.commit();

		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
			ex.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	public static EntityManager createEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("veat");
		EntityManager entityManager = factory.createEntityManager();
		return entityManager;
	}

	public static <T extends DbObject> void deleteAll(Class<T> clazz) {
		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			Query query = em.createQuery("Delete FROM " + clazz.getName());
			query.executeUpdate();
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
}
