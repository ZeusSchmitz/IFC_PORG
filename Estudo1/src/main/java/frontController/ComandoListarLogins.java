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
  public boolean equals(Object o)
  {
    GenericDao dao = new GenericDao();
    List<Contato> login = dao.existLogin((String) o);
    
    return true; //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void process() throws ServletException, IOException
  {
  }

}
