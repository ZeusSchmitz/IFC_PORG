package servlet;

import dao.UsuarioDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Usuario;
import gerenciador.GerenciadorSessao;
import java.util.ArrayList;
import models.Carro;
import dao.*;

public class UsuarioServlet extends HttpServlet
{

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    String login = request.getParameter("login");
    String senha = request.getParameter("senha");
    Usuario usuario = new Usuario(login, senha);
    GerenciadorSessao gerenciadorSessao = new GerenciadorSessao(request.getSession());
    UsuarioDao usuarioDao = null;
    CarroDao carroDao = null;
    ArrayList<String> detalheCarro = new ArrayList<String>();
    try
    {
      usuarioDao = new UsuarioDao();
      carroDao = new CarroDao();
    } catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    if (request.getParameter("acao").equals("entrar"))
    {
      usuario = usuarioDao.buscarUsuario(usuario);
      if (usuario != null)
      {
        //response.getWriter().append("Entrar");
        gerenciadorSessao.adicionarUsuario(usuario);        
        ArrayList<Carro> carros = carroDao.listarCarro(usuario.getLogin());
        for (Carro carro : carros)
        {
          String detalhe = carro.getNome() + " - " + carro.getModelo();
          detalheCarro.add(detalhe);
        }
        request.setAttribute("listaCarro", detalheCarro);
        request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
      }
      else
      {
        response.getWriter().append("Usuário Inválido");        
      }
      System.out.println("Cadastro");
    }
    else if (request.getParameter("acao").equals("cadastrar"))
    {
      boolean sucesso = usuarioDao.criaUsuario(usuario);
      gerenciadorSessao.adicionarUsuario(usuario);
      ArrayList<Carro> carros = carroDao.listarCarro(usuario.getLogin());
      response.getWriter().append("Cadastro");
      System.out.println("Alterar");
    }
    else if (request.getParameter("acao").equals("esqSenha"))
    {
      boolean sucesso = usuarioDao.alterarUsuario(usuario);
      gerenciadorSessao.adicionarUsuario(usuario);
      ArrayList<Carro> carros = carroDao.listarCarro(usuario.getLogin());
      response.getWriter().append("Esqueci senha");
      System.out.println("Remover");
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
