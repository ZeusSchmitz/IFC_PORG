package gerenciador;

import javax.servlet.http.HttpSession;

import models.Usuario;

public class GerenciadorSessao
{
  private Usuario usuario;
  HttpSession session;

  public GerenciadorSessao(HttpSession session)
  {
    this.session = session;
    this.usuario = (Usuario) this.session.getAttribute("usuarioSessao");
    if (this.usuario == null)
    {
      this.usuario = new Usuario();
    }
  }

  public void adicionarUsuario(Usuario novo_usuario)
  {
    this.usuario = novo_usuario;
    this.session.removeAttribute("usuarioSessao");
    //this.session.setMaxInactiveInterval(15);
    this.session.setAttribute("usuarioSessao", this.usuario);
  }

  public Usuario buscarUsuario()
  {
    return this.usuario;
  }
}