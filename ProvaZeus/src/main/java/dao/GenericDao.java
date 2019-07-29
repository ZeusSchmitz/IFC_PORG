package dao;

import entity.Filme;
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
  private static String nome;
  private static String senha;

  public static String getNome()
  {
    return nome;
  }

  public static void setNome(String nome)
  {
    GenericDao.nome = nome;
  }

  public static String getSenha()
  {
    return senha;
  }

  public static void setSenha(String senha)
  {
    GenericDao.senha = senha;
  }
      
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

  public List<Usuario> carregarTodosUsuario()
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Usuario> usuario;
    try
    {
      String jpql = "from Usuario";
      TypedQuery<Usuario> q = entityManager.createQuery(jpql, Usuario.class);
      usuario = q.getResultList();
    } catch (EntityExistsException | TransactionalException e)
    {
      usuario = null;
      FabricaJPA.shutdown();
    }

    return usuario;
  }
  
  public List<Usuario> carregarUsuario()
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Usuario> usuario;
    try
    {
      String jpql = "select * from Usuario where nome = " + "'" + getNome() + "'" + " and senha = " + "'" + getSenha() + "";
      TypedQuery<Usuario> q = entityManager.createQuery(jpql, Usuario.class);
      usuario = q.getResultList();
    } catch (EntityExistsException | TransactionalException e)
    {
      usuario = null;
      FabricaJPA.shutdown();
    }

    return usuario;
  }

  public List<Filme> listarFilmes(String idUs)
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Filme> filme;

    try
    {
      String jpql = "select f.id, f.nomeFilme, f.ano from usuario_filme a, filme f where a.Usuario_id = " + "'" + idUs + "'" + " and f.id = " + " a.filme_id";
      Query q = entityManager.createQuery(jpql);
      filme = q.getResultList();
    } catch (EntityExistsException | TransactionalException e)
    {
      filme = null;
      FabricaJPA.shutdown();
    }
    
    return filme;
  }

public List<Usuario> usuario(String nome, String senha)
  {
    EntityManager entityManager = FabricaJPA.getEntityManagerFactory().createEntityManager();
    List<Usuario> usuario;

    try
    {
      String jpql = "select id from Usuario where nome = " + "'" + nome + "'";
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
