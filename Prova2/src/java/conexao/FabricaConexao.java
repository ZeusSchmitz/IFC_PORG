package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao
{

  private static final String URL = "jdbc:mysql://localhost/ProvaZeus";
  private static final String USER = "root";
  private static final String PASS = "";
  public static Connection cn = null;

  public static Connection getConnection() throws ClassNotFoundException
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      cn = DriverManager.getConnection(URL, USER, PASS);
      System.out.println("Conectado");      
      return cn;
    } catch (SQLException ex)
    {
      System.out.println("Nao conectou");
      cn = null;
      return cn;
    }
  }

  public static void closeConnection()
  {
    if(cn != null)
    {
      try
      {
        cn.close();
      } catch (SQLException e)
      {
        System.out.println(e);
      }
    }
  }
}
