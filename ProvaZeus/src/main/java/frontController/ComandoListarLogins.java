package frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import dao.GenericDao;
import entity.Usuario;

/**
 * Servlet implementation class ListarContatos
 */
public class ComandoListarLogins extends FrontComando
{
  
  @Override
  public void process() throws ServletException, IOException
  {
    System.out.println("Verifica usu�rio");
  }

  public boolean existe(String nome, String senha)
  {
    GenericDao dao = new GenericDao();
    List<Usuario> logins = dao.usuario(nome, senha);
    
    return logins.size() >= 1;
  }
}
