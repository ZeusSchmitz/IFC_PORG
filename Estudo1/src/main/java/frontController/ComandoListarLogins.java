package frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import dao.GenericDao;
import entity.Contato;
import entity.Usuario;

/**
 * Servlet implementation class ListarContatos
 */
public class ComandoListarLogins extends FrontComando
{
  
  @Override
  public void process() throws ServletException, IOException
  {
    GenericDao dao = new GenericDao();
    List<Usuario> login = dao.existLogin();
  }

  public boolean existe(String login, String senha)
  {
    GenericDao dao = new GenericDao();
    List<Usuario> logins = dao.usuario(login, senha);
    //boolean usuario = logins.size() >= 1;
    
    return logins.size() >= 1;
  }
}
