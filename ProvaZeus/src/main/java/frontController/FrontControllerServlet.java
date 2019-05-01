package frontController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontControllerServlet extends HttpServlet
{

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    FrontComando command = getCommand(request);
    command.init(getServletContext(), request, response);
    command.process();
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    doGet(request, response);
  }

  @Override
  public String getServletInfo()
  {
    return "Short description";
  }// </editor-fold>

  private FrontComando getCommand(HttpServletRequest request)
  {
    try
    {
      System.out.println(String.format("frontController.Comando%s", request.getParameter("comando")));
      Class type = Class
              .forName(String.format("frontController.Comando%s", request.getParameter("comando")));
      return (FrontComando) type.asSubclass(FrontComando.class).newInstance();
    } catch (Exception e)
    {
      return new ComandoDesconhecido();
    }
  }
}
