package dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.TransactionalException;

import entity.Usuario;
import fabricaConecxao.FabricaJPA;
import javax.persistence.Query;

public class GenericDao
{

  public boolean salvar(Object objeto)
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    boolean resultado = true;
    try
    {
      entityManager.getTransaction().begin();

      entityManager.persist(objeto);

      entityManager.getTransaction().commit();
    } catch (EntityExistsException | TransactionalException e)
    {
      resultado = false;
      FabricaJPA.shutdown();
    }

    return resultado;
  }

  public List<Usuario> carregarTodosContato()
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Usuario> usuario;
    try
    {
      String jpql = "from Contato";
      TypedQuery<Usuario> q = entityManager.createQuery(jpql, Usuario.class);
      usuario = q.getResultList();
    } catch (EntityExistsException | TransactionalException e)
    {
      usuario = null;
      FabricaJPA.shutdown();
    }

    return usuario;
  }

  public List<Usuario> existLogin()
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Usuario> contatos = null;
    try
    {
      String jpql = "from Usuario";
      TypedQuery<Usuario> q = entityManager.createQuery(jpql, Usuario.class);
      contatos = q.getResultList();
    } catch (EntityExistsException | TransactionalException e)
    {
      contatos = null;
      FabricaJPA.shutdown();
    }

    return contatos;
  }
  
  public List<Usuario> usuario(String login, String senha)
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Usuario> usuario;

    try
    {
      String jpql = "select login from Usuario where login = " + "'" + login + "'" + " and senha = " + "'" + senha + "'";
      Query q = entityManager.createQuery(jpql);
      usuario = q.getResultList();
    } catch (EntityExistsException | TransactionalException e)
    {
      usuario = null;
      FabricaJPA.shutdown();
    }
    
    return usuario;
  }
}
