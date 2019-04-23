package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable
{
  @Id
  String login;
  String senha;

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
