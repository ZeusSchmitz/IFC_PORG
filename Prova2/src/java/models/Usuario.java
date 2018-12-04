package models;

public class Usuario
{

  private String login;
  private String senha;

  public Usuario()
  {
  }

  public Usuario(String login, String senha)
  {
    this.login = login;
    this.senha = senha;
  }

  public void mudarSenha(String senha)
  {
    this.senha = senha;
  }

  public String getLogin()
  {
    return login;
  }

  public String getSenha()
  {
    return senha;
  }

}
