package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.FabricaConexao;
import models.Usuario;

public class UsuarioDao
{
  private Connection connection;

  public UsuarioDao() throws ClassNotFoundException
  {
    this.connection = FabricaConexao.getConnection();
  }

  public boolean criaUsuario(Usuario usuario)
  {
    try
    {
      if (!existeUsuarioCadastrado(usuario.getLogin()))
      {
        String sql = "insert into Usuario (login, senha) values (?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, usuario.getLogin());
        stm.setString(2, usuario.getSenha());
        stm.execute();
        FabricaConexao.closeConnection();
        return true;
      }

    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return false;
  }

  private boolean existeUsuarioCadastrado(String login)
  {
    Usuario usuario = null;
    String sql = "select * from Usuario where login = ?;";
    try
    {
      PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setString(1, login);
      ResultSet resultado = stmt.executeQuery();
      while (resultado.next())
      {
        usuario = new Usuario(resultado.getString("login"), resultado.getString("senha"));
      }
      stmt.close();
    } catch (SQLException e)
    {
      throw new RuntimeException(e);
    }
    if (usuario != null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public Usuario buscarUsuario(Usuario usuario)
  {
    Usuario usuarioBusca = null;
    String sql = "select * from Usuario where login = ? and senha = ?;";
    try
    {
      PreparedStatement stm = connection.prepareStatement(sql);
      stm.setString(1, usuario.getLogin());
      stm.setString(2, usuario.getSenha());
      ResultSet resultado = stm.executeQuery();
      while (resultado.next())
      {
        usuarioBusca = new Usuario(resultado.getString("login"), resultado.getString("senha"));
      }
      stm.close();
      return usuarioBusca;

    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return usuarioBusca;
  }

  public boolean alterarUsuario(Usuario usuario)
  {
    try
    {
      if (existeUsuarioCadastrado(usuario.getLogin()))
      {
        String sql = "update Usuario set login = ?, senha = ? where login = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, usuario.getLogin());
        stm.setString(2, usuario.getSenha());
        stm.setString(3, usuario.getLogin());
        stm.execute();
        FabricaConexao.closeConnection();
        return true;
      }

    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return false;
  }
}
