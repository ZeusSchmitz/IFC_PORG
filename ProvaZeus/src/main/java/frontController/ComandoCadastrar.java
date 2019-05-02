package frontController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import dao.GenericDao;
import entity.Endereco;
import entity.Filme;
import entity.Usuario;

public class ComandoCadastrar extends FrontComando
{

  @Override
  public void process() throws ServletException, IOException
  {
    GenericDao dao = new GenericDao();
    Usuario usuario = new Usuario();
    usuario.setNome(request.getParameter("nome"));
    usuario.setCpf(Integer.parseInt(request.getParameter("cpf")));
    usuario.setSenha(Integer.parseInt(request.getParameter("senha")));
    Endereco endereco = new Endereco();
    endereco.setComp(request.getParameter("comp"));
    endereco.setNum(Integer.parseInt(request.getParameter("num")));
    endereco.setNomeRua(request.getParameter("nmrua"));
    List<Endereco> endList = new ArrayList<>();
    endList.add(endereco);
    Filme listFilme = new Filme();
    listFilme.setNomeFilme(request.getParameter("nmfilme"));
    listFilme.setAno(request.getParameter("ano"));
    List<Filme> filme = new ArrayList<>();
    filme.add(listFilme);
    usuario.setEndereco(endList);
    usuario.setFilme(filme);
    dao.salvar(usuario);
    
    List<Usuario> usuarios = dao.carregarTodosUsuario();
    request.setAttribute("lista_usuario", usuarios);
    forward("listaFilm");
  }

}
