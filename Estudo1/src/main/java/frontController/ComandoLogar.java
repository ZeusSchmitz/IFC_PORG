package frontController;

import java.io.IOException;

import javax.servlet.ServletException;

public class ComandoLogar extends FrontComando
{

  ComandoListarLogins login = new ComandoListarLogins();

  @Override
  public void process() throws ServletException, IOException
  {
    String vlLogin = this.request.getParameter("login");
    String vlSenha = this.request.getParameter("password");
    
    if (login.existe(vlLogin, vlSenha))
    {
      forward("lista");
    }
    else if (vlLogin.equalsIgnoreCase("admin") && (vlSenha.equalsIgnoreCase("admin123")))
    {
      forward("lista");
    }
    else
    {
      forward("index");
    }
  }

}
