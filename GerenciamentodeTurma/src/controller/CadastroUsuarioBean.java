package controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import dao.CadastroUsuarioDao;
import entity.CadastroUsuario;

@ManagedBean
@RequestScoped
public class CadastroUsuarioBean
{

  private static final long serialVersionUID = 1L;
  private CadastroUsuario cadastroUsuario;
  private CadastroUsuarioDao cd;
  private List<CadastroUsuario> CadastroUsuarioList;

  @PostConstruct
  public void init()
  {
    this.cadastroUsuario = new CadastroUsuario();
    this.cd = new CadastroUsuarioDao();
    this.CadastroUsuarioList = cd.list();
  }

  public String newAluno()
  {
    return "cadastroUsuario";
  }

  public String delete(CadastroUsuario cadastroUsuario)
  {
    cd.delete(cadastroUsuario);
    return "cadastroUsuario";
  }

  public String edit(CadastroUsuario cadastroUsuario)
  {
    this.cadastroUsuario = cadastroUsuario;
    return "cadastroUsuario";
  }

  public String save()
  {
    cd.saveOrUpdate(cadastroUsuario);
    this.cadastroUsuario = new CadastroUsuario();
    return "cadastroUsuario";
  }

  // Geters and seters
  public String envia()
  {
    if (cadastroUsuario.getUsuario().toLowerCase().equals("admin") && cadastroUsuario.getSenha().toLowerCase().equals("admin123"))
    {
      return "cadastroUsuario?faces-redirect=true";
    }
    else
    {
        cadastroUsuario = cd.getUsuario(cadastroUsuario.getUsuario(), cadastroUsuario.getSenha());
      if (cadastroUsuario == null)
      {
        FacesContext context = FacesContext.getCurrentInstance();
        cadastroUsuario = new CadastroUsuario();
        System.out.println("Erro no login");
        context.addMessage(null, new FacesMessage("Erro", "Login inválido"));
        return null;
      }
      else
      {
        return "index?faces-redirect=true";
      }
    }
  }

  public CadastroUsuario getCadastroUsuario()
  {
    return cadastroUsuario;
  }

  public void setCadastroUsuario(CadastroUsuario cadastroUsuario)
  {
    this.cadastroUsuario = cadastroUsuario;
  }

  public CadastroUsuarioDao getCd()
  {
    return cd;
  }

  public void setCd(CadastroUsuarioDao cd)
  {
    this.cd = cd;
  }

  public List<CadastroUsuario> getCadastroUsuarioList()
  {
    this.CadastroUsuarioList = cd.list();
    return CadastroUsuarioList;
  }

  public void setCadastroUsuarioList(List<CadastroUsuario> cadastroUsuarioList)
  {
    CadastroUsuarioList = cadastroUsuarioList;
  }

  public static long getSerialversionuid()
  {
    return serialVersionUID;
  }
  
}
