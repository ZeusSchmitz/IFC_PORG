package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Calendario;


public class CaledarioDao {
	
	public void saveOrUpdate(Calendario calendario) {
		EntityManager em = util.HibernateUtil
				.geteEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();

			if (calendario.getId() == null)
				em.persist(calendario);
			else
				em.merge(calendario);

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	public void delete(Calendario calendario) {
		EntityManager em = util.HibernateUtil
				.geteEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Calendario c = em.find(Calendario.class, calendario.getId());
			em.remove(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	public List<Calendario> list() {
		List<Calendario> result = null;
		try {
			EntityManager em = util.HibernateUtil
					.geteEntityManagerFactory().createEntityManager();
			Query query = em.createQuery("select c from Calendario c");
			result = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
