package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Endereco;

public class EnderecoDao {

	  public void saveOrUpdate(Endereco endereco)
	  {
	    EntityManager em = util.HibernateUtil
	            .geteEntityManagerFactory().createEntityManager();
	    try
	    {
	      em.getTransaction().begin();

//	      if (endereco.getId() == null)
//	      {
	        em.persist(endereco);
/*	      }
	      else
	      {
	        em.merge(endereco);
	      }*/

	      em.getTransaction().commit();
	    } catch (Exception e)
	    {
	      em.getTransaction().rollback();
	    }
	  }

	public List<Endereco> list() {
		List<Endereco> result = null;
		try {
			EntityManager em = util.HibernateUtil.geteEntityManagerFactory().createEntityManager();
			Query query = em.createQuery("select a from Aluno a");
			result = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
