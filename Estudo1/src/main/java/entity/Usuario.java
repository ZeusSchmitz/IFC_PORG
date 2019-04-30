package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable
{
  @Id
  @GeneratedValue

  private Integer id;
  String login;
  String senha;

  public Integer getId()
  {
    return id;
  }

  @OneToMany(cascade = CascadeType.ALL)
  private List<Contato> contato = new ArrayList<>();

  public List<Contato> getContato()
  {
    return contato;
  }

  public void setContato(List<Contato> contato)
  {
    this.contato = contato;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }
  
  public Usuario()
  {
  }

  public String getSenha()
  {
    return senha;
  }

  public void setSenha(String senha)
  {
    this.senha = senha;
  }

  public String getLogin()
  {
    return login;
  }

  public void setLogin(String login)
  {
    this.login = login;
  }
}
