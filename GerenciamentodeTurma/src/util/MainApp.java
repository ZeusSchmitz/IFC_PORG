package util;

import javax.persistence.EntityManager;

import entity.CadastroUsuario;




public class MainApp {
  public static void main(String[] args) {
    EntityManager entityManager = HibernateUtil.geteEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    CadastroUsuario usuario = new CadastroUsuario("Administrador", "admin", "Sistema", "47-988569884", "administradorsgt@gmail.com", "admin", "123");
    entityManager.persist(usuario);
    entityManager.getTransaction().commit();
    entityManager.close();

  }
}
