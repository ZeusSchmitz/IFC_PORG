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
    endereco.setNum(Integer.parseInt(request.getParameter("comp")));
    endereco.setComp(request.getParameter("rua"));
    List<Filme> filme = new ArrayList<>();
    usuario.setEndereco((List<Endereco>) endereco);
    dao.salvar(usuario);
  }

}
