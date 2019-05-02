package frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import dao.GenericDao;
import entity.Usuario;

/**
 * Servlet implementation class ListarContatos
 */
public class ComandoListarUsuarios extends FrontComando
{

  @Override
  public void process() throws ServletException, IOException
  {
    GenericDao dao = new GenericDao();
    List<Usuario> usuarios = dao.carregarTodosUsuario();
    request.setAttribute("lista_usuario", usuarios);
    forward("listaFilm");
  }

}
