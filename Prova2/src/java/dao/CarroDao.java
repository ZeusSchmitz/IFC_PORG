package dao;

import conexao.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Carro;

public class CarroDao
{

  private Connection connection;

  public CarroDao() throws ClassNotFoundException
  {
    this.connection = FabricaConexao.getConnection();
  }

  public boolean criaCarro(Carro carro)
  {
    try
    {
      String sql = "insert into Carro (nome, modelo, anoFabricacao, nomeUsuario, cor) values (?,?,?,?,?)";
      try (PreparedStatement stm = connection.prepareStatement(sql))
      {
        stm.setString(1, carro.getNome());
        stm.setString(2, carro.getModelo());
        stm.setInt(3, carro.getAnoFabricacao());
        stm.setString(4, carro.getNomeUsuario());
        stm.setString(5, carro.getCor());
        stm.execute();
      }
      return true;

    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return false;
  }

  public boolean alterarCarro(Carro carro)
  {
    try
    {
      String sql = "update Carro set nome = ?, modelo = ?, anoFabricacao = ?, nomeUsuario = ?, cor = ? where nome = ?;";
      PreparedStatement stm = connection.prepareStatement(sql);
      stm.setString(1, carro.getNome());
      stm.setString(2, carro.getModelo());
      stm.setInt(3, carro.getAnoFabricacao());
      stm.setString(4, carro.getNomeUsuario());
      stm.setString(5, carro.getCor());
      stm.setString(6, carro.getNome());
      stm.execute();
      stm.close();
      return true;

    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return false;

  }

  public boolean removerCarro(Carro carro)
  {
    try
    {
      String sql = "delete from Carro where nome = ?;";
      PreparedStatement stm = connection.prepareStatement(sql);
      stm.setString(1, carro.getNome());
      stm.execute();
      stm.close();
      return true;

    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return false;

  }

  public ArrayList<Carro> listarCarro(String nomeUsuario)
  {
    ArrayList<Carro> carros = new ArrayList<Carro>();
    String sql = "select * from Carro where nomeUsuario = ?;";
    try
    {
      PreparedStatement stm = connection.prepareStatement(sql);
      stm.setString(1, nomeUsuario);
      ResultSet resultado = stm.executeQuery();
      while (resultado.next())
      {
        System.out.println(resultado.getString("nome"));
        Carro carro = new Carro(resultado.getString("nome"), resultado.getString("cor"), resultado.getString("modelo"), resultado.getInt("anoFabricacao"), resultado.getString("nomeUsuario"));
        carros.add(carro);
      }
      stm.close();
      return carros;
    } catch (Exception e)
    {
      System.out.println("Erro - " + e.getMessage());
    }
    return null;
  }

}
