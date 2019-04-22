package frontController;

import java.io.IOException;

import javax.servlet.ServletException;
import frontController.ComandoListarLogins;

public class ComandoLogar extends FrontComando
{
  ComandoListarLogins login = new ComandoListarLogins();
  
  @Override
  public void process() throws ServletException, IOException
  {
    if(login.equals(this.request.getParameter("login")))
    {
      System.out.println("Foi");
    }
    if (this.request.getParameter("login").equals(this.request.getParameter("password")))
    {
      forward("lista");
    }
    else
    {
      forward("index");
    }

  }

}
