package dao;

import javax.persistence.EntityManager;
import entity.Usuario;
import util.HibernateUtil;


public class MainApp {
  public static void main(String[] args) {
    EntityManager entityManager = HibernateUtil.geteEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    Usuario usuario = new Usuario("Maria", "123");
    entityManager.persist(usuario);
    entityManager.getTransaction().commit();
    entityManager.close();

    
  }
}
