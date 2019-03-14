package DAO;

import bean.UsuarioBean;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import myConnection.HibernatUtils;
import org.hibernate.Query;

public class UsuarioDAO
{
  public boolean salvaUsuario(UsuarioBean usuario) throws ClassNotFoundException
  {
    SessionFactory cn = HibernatUtils.getSessionFactory();
    Session session = cn.getCurrentSession();
    //Connection cn = ConectaBD.getConnection();
    String sql = "select * from aluno where nome =? and senha =?;";

    Query stm = session.createQuery(sql);
      stm.setString(1, usuario.getNome());
      stm.setString(2, usuario.getSenha());
      List list = stm.list();
      System.out.println(list);
      return false;
    }


  public boolean verificaExiste(UsuarioBean usuario) throws ClassNotFoundException
  {
    SessionFactory cn = HibernatUtils.getSessionFactory();
    Session session = cn.getCurrentSession();
    
    String sql = "select * from aluno where nome =? and senha =?;";
    boolean existe = false;
    Query stm = session.createQuery(sql);
    stm.setString(1, usuario.getNome());
    stm.setString(2, usuario.getSenha());
    List list = stm.list();
    System.out.println(list);
    
    return existe;
  }
}
/*  public void retiraUsuario(UsuarioBean usuario) throws ClassNotFoundException
  {
    Connection cn = ConectaBD.getConnection();
    String sql = "delete from aluno where nome =? and senha =?;";
    boolean deletado = false;
    try
    {
      PreparedStatement stm = cn.prepareStatement(sql);
      stm.setString(1, usuario.getNome());
      stm.setString(2, usuario.getSenha());
      stm.execute();
      ConectaBD.closeConnection();
    } catch (SQLException e)
    {
      ConectaBD.closeConnection();
    }
  }

  public void alteraNomeUsuario(UsuarioBean usuario) throws ClassNotFoundException
  {
    Connection cn = ConectaBD.getConnection();
    String sql = "update aluno set nome =? where senha =?;";
    try
    {
      PreparedStatement stm = cn.prepareStatement(sql);
      stm.setString(1, usuario.getNome());
      stm.setString(2, usuario.getSenha());
      stm.execute();
      ConectaBD.closeConnection();
    } catch (SQLException e)
    {
      ConectaBD.closeConnection();
    }
  }

  public void alteraSenhaUsuario(UsuarioBean usuario) throws ClassNotFoundException
  {
    Connection cn = ConectaBD.getConnection();
    String sql = "update aluno set senha =? where nome =?;";
    try
    {
      PreparedStatement stm = cn.prepareStatement(sql);
      stm.setString(1, usuario.getSenha());
      stm.setString(2, usuario.getNome());
      stm.execute();
      ConectaBD.closeConnection();
    } catch (SQLException e)
    {
      ConectaBD.closeConnection();
    }
  }
}*/
