package servlet;

import DAO.UsuarioDAO;
import bean.UsuarioBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter())
    {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet Servlet</title>");      
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
      out.println("</body>");
      out.println("</html>");
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    String destino = "/index.html";
    String nome = request.getParameter("nome");
    String senha = request.getParameter("senha");

    UsuarioDAO uDao = new UsuarioDAO();
    UsuarioBean u = new UsuarioBean(nome, senha);
    try
    {
      if(uDao.verificaExiste(u))
      {
        destino = "/BemVindo.html";
      }
      else if (nome.equals("admin") && (senha.equals("admin123")))
      {
        destino = "/cadastro.jsp";
      }
    } catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
    }
    request.getRequestDispatcher(destino).forward(request, response);
  }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    doGet(request, response);
  }
  @Override
  public String getServletInfo()
  {
    return "Short description";
  }// </editor-fold>

}
