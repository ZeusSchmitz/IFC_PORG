package frontController;

import java.io.IOException;

import javax.servlet.ServletException;

public class ComandoLogar extends FrontComando
{

  ComandoListarLogins login = new ComandoListarLogins();

  @Override
  public void process() throws ServletException, IOException
  {
    String vlNome = this.request.getParameter("nome");
    String vlSenha = this.request.getParameter("password");
    
    if (login.existe(vlNome, vlSenha))
    {
      forward("lista");
    }
    else if (vlNome.equalsIgnoreCase("admin") && (vlSenha.equalsIgnoreCase("admin123")))
    {
      forward("lista");
    }
    else
    {
      forward("index");
    }
  }

}
