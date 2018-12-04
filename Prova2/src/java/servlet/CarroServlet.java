package servlet;

import dao.CarroDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Carro;
import models.Usuario;
import gerenciador.GerenciadorSessao;

public class CarroServlet extends HttpServlet
{

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    GerenciadorSessao gerenciadorSessao = new GerenciadorSessao(request.getSession());
    Usuario usuario = gerenciadorSessao.buscarUsuario();
    HttpSession session = request.getSession();

    if (usuario != null)
    {
      System.out.println(usuario.getLogin());
      CarroDao carroDao = null;
      Carro carro = new Carro(request.getParameter("nome"), request.getParameter("cor"), request.getParameter("modelo"), Integer.parseInt(request.getParameter("anoFabricacao")), usuario.getLogin());
      ArrayList<Carro> listaNova = null;
      try
      {
        carroDao = new CarroDao();
      } catch (ClassNotFoundException e)
      {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      if (request.getParameter("acao").equals("cadastrar"))
      {
        carroDao.criaCarro(carro);
        listaNova = carroDao.listarCarro(usuario.getLogin());
        System.out.println("Cadastro");
      }
      else if (request.getParameter("acao").equals("alterar"))
      {
        carroDao.alterarCarro(carro);
        listaNova = carroDao.listarCarro(usuario.getLogin());
        System.out.println("Alterar");
      }
      else if (request.getParameter("acao").equals("remover"))
      {
        carroDao.removerCarro(carro);
        
        //validar lista vazia
        
        listaNova = carroDao.listarCarro(usuario.getLogin());
        System.out.println("Remover");
      }
      ArrayList<String> detalheCarro = new ArrayList<String>();
      for (Carro carro2 : listaNova)
      {
        detalheCarro.add(new String(carro2.getNome() + " - " + carro.getModelo()));
      }
      session.setAttribute("listaCarro", detalheCarro);
      request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
    }
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
