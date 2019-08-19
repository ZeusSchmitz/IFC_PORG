package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.UsuarioDao;
import entity.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean
{

  private UsuarioDao usuarioDao = new UsuarioDao();
  private Usuario usuario = new Usuario();

  public String envia()
  {

    usuario = usuarioDao.getUsuario(usuario.getNome(), usuario.getSenha());
    if (usuario == null)
    {
      usuario = new Usuario();
      FacesContext.getCurrentInstance().addMessage(
              null,
              new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                      "Erro no Login!"));
      return null;
    }
    else
    {
      return "GerenciamentodeTurmas/cadastroUsuario.xhtml";
    }

  }

  public Usuario getUsuario()
  {
    return usuario;
  }

  public void setUsuario(Usuario usuario)
  {
    this.usuario = usuario;
  }
}
