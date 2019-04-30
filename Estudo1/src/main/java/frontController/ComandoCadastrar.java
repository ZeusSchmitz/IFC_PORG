package frontController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import dao.GenericDao;
import entity.Contato;
import entity.Nome;
import entity.Telefone;
import entity.Url;
import entity.Usuario;

public class ComandoCadastrar extends FrontComando
{

  @Override
  public void process() throws ServletException, IOException
  {
    GenericDao dao = new GenericDao();
    Nome nome = new Nome();
    nome.setPrimeiro(request.getParameter("primeiro"));
    nome.setSegundo(request.getParameter("segundo"));
    Usuario login = new Usuario();
    ArrayList<Usuario> logins = new ArrayList<>();
    login.setLogin(request.getParameter("login"));
    login.setSenha(request.getParameter("senha"));
    logins.add(login);
    String notas = "";
    Url site = new Url();
    site.setEndereco(request.getParameter("url"));
    Telefone t1 = new Telefone();
    Telefone t2 = new Telefone();
    ArrayList<Telefone> telefones = new ArrayList<>();
    t1.setTelefone(request.getParameter("telefone"));
    t2.setTelefone(request.getParameter("celular"));
    telefones.add(t1);
    telefones.add(t2);
    boolean favoritos;
    if (request.getParameter("favoritos").equals("1"))
    {
      favoritos = true;
    }
    else
    {
      favoritos = false;
    }
    Usuario usuario = new Usuario();
    Contato novo = new Contato(nome, notas, site, favoritos, 1);
    ArrayList<Contato> cont = new ArrayList<Contato>();
    cont.add(novo);
    usuario.setContato(cont);
    novo.setTelefones(telefones);
    dao.salvar(novo);
    List<Contato> contatos = dao.carregarTodosContato();
    request.setAttribute("lista_contatos", contatos);
    forward("lista");

  }

}
