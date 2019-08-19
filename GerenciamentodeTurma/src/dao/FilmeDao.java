package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import entity.Filme;

public class FilmeDao
{

  public void saveOrUpdate(Filme filme)
  {
    EntityManager em = util.HibernateUtil
            .geteEntityManagerFactory().createEntityManager();
    try
    {
      em.getTransaction().begin();

      if (filme.getId() == null)
      {
        em.persist(filme);
      }
      else
      {
        em.merge(filme);
      }

      em.getTransaction().commit();
    } catch (Exception e)
    {
      em.getTransaction().rollback();
    }
  }

  public void delete(Filme filme)
  {
    EntityManager em = util.HibernateUtil
            .geteEntityManagerFactory().createEntityManager();
    try
    {
      em.getTransaction().begin();
      Filme al = em.find(Filme.class, filme.getId());
      em.remove(al);
      em.getTransaction().commit();
    } catch (Exception e)
    {
      em.getTransaction().rollback();
    }
  }

  public List<Filme> list()
  {
    List<Filme> result = null;
    try
    {
      EntityManager em = util.HibernateUtil
              .geteEntityManagerFactory().createEntityManager();
      Query query = em.createQuery("select a from Aluno a");
      result = query.getResultList();
    } catch (Exception e)
    {
      e.printStackTrace();
    }
    return result;
  }

}
