package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import entity.CadastroUsuario;

public class CadastroUsuarioDao
{

  public CadastroUsuario getUsuario(String nomeUsuario, String senha)
  {
    EntityManager em = util.HibernateUtil.geteEntityManagerFactory().createEntityManager();

    try
    {
      CadastroUsuario cadastroUsuario = (CadastroUsuario) em
              .createQuery("SELECT c from CadastroUsuario c where c.usuario = :usuario and c.senha = :senha")
              .setParameter("usuario", nomeUsuario).setParameter("senha", senha).getSingleResult();

      return cadastroUsuario;
    } catch (NoResultException e)
    {
      return null;
    }
  }

  public void saveOrUpdate(CadastroUsuario cadastroUsuario)
  {
    EntityManager em = util.HibernateUtil
            .geteEntityManagerFactory().createEntityManager();
    try
    {
      em.getTransaction().begin();

      if (cadastroUsuario.getId() == null)
      {
        em.persist(cadastroUsuario);
      }
      else
      {
        em.merge(cadastroUsuario);
      }

      em.getTransaction().commit();
    } catch (Exception e)
    {
      em.getTransaction().rollback();
    }
  }

  public void delete(CadastroUsuario cadastroUsuario)
  {
    EntityManager em = util.HibernateUtil
            .geteEntityManagerFactory().createEntityManager();
    try
    {
      em.getTransaction().begin();
      CadastroUsuario usuario = em.find(CadastroUsuario.class, cadastroUsuario.getId());
      em.remove(usuario);
      em.getTransaction().commit();
    } catch (Exception e)
    {
      em.getTransaction().rollback();
    }
  }

  public List<CadastroUsuario> list()
  {
    List<CadastroUsuario> result = null;
    try
    {
      EntityManager em = util.HibernateUtil
              .geteEntityManagerFactory().createEntityManager();
      Query query = em.createQuery("select cadastroUsuario from CadastroUsuario cadastroUsuario");
      result = query.getResultList();
    } catch (Exception e)
    {
      e.printStackTrace();
    }
    return result;
  }

}
