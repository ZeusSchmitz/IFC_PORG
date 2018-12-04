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

    if (usuario.getLogin() != null)
    {
      System.out.println(usuario.getLogin());
      CarroDao carroDao = null;
      
      ArrayList<Carro> listaNova = null;

      if (request.getParameter("acao").equals("cadastrar"))
      {
        Carro carro = new Carro(request.getParameter("nome"), request.getParameter("cor"), request.getParameter("modelo"), Integer.parseInt(request.getParameter("anoFabricacao")), usuario.getLogin());
        try
        {
          carroDao = new CarroDao();
          carroDao.criaCarro(carro);
        } catch (ClassNotFoundException e)
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      else if (request.getParameter("acao").equals("alterar"))
      {
        Carro carro = new Carro(request.getParameter("nome"), request.getParameter("cor"), request.getParameter("modelo"), Integer.parseInt(request.getParameter("anoFabricacao")), usuario.getLogin());
        try
        {
          carroDao = new CarroDao();
          carroDao.alterarCarro(carro);
        } catch (ClassNotFoundException e)
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      else if (request.getParameter("acao").equals("remover"))
      {
        Carro carro = new Carro(request.getParameter("nome"), usuario.getLogin());
        try
        {
          carroDao = new CarroDao();
          carroDao.removerCarro(carro);
        } catch (ClassNotFoundException e)
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      try
      {
        carroDao = new CarroDao();
        gerenciadorSessao = new GerenciadorSessao(request.getSession());
        usuario = gerenciadorSessao.buscarUsuario();
        listaNova = carroDao.listarCarro(usuario.getLogin());
        ArrayList<String> detalheCarro = new ArrayList<String>();
        for (Carro carro2 : listaNova)
        {
          detalheCarro.add(new String(carro2.getNome() + " - " + carro2.getModelo()));
        }
        request.setAttribute("listaCarro", detalheCarro);
      } catch (ClassNotFoundException e)
      {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
    }
    else
    {
      request.getRequestDispatcher("index.jsp").forward(request, response);
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
