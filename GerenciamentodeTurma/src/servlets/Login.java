package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UsuarioBean;
import dao.UsuarioDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet
{

  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Login()
  {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   * response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    // TODO Auto-generated method stub
    String nomeUsuario = request.getParameter("nomeUsuario");
    String senha = request.getParameter("senha");

    UsuarioBean usuario = new UsuarioBean();
    UsuarioDao usuarioDao = new UsuarioDao();

    //usuario = usuario.envia()
    if (usuario != null)
    {
      request.setAttribute("hashCode", senha.hashCode());
      request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
    }
    else
    {
      request.setAttribute("aviso", "Senha diferente de nome!");
      request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   * response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}
