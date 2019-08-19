package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import entity.Usuario;


public class UsuarioDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplohibernate");
	private EntityManager em = factory.createEntityManager();

	public Usuario getUsuario(String nomeUsuario, String senha) {

		try {
			Usuario usuario = (Usuario) em
					.createQuery("SELECT u from Usuario u where u.nome = :nome and u.senha = :senha")
					.setParameter("nome", nomeUsuario).setParameter("senha", senha).getSingleResult();

			return usuario;
		} catch (NoResultException e) {
			return null;
		}
	}

	public boolean inserirUsuario(Usuario usuario) {
		try {
			em.persist(usuario);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletarUsuario(Usuario usuario) {
		try {
			em.remove(usuario);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
