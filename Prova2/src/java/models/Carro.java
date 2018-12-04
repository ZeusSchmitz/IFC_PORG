package models;

public class Carro
{

  private String nome;
  private String cor;
  private String modelo;
  private int anoFabricacao;
  private String nomeUsuario;

  public Carro(String nome, String cor, String modelo, int anoFabricacao, String nomeUsuario)
  {
    this.nome = nome;
    this.cor = cor;
    this.modelo = modelo;
    this.anoFabricacao = anoFabricacao;
    this.nomeUsuario = nomeUsuario;
  }

  public String getNomeUsuario()
  {
    return nomeUsuario;
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getCor()
  {
    return cor;
  }

  public void setCor(String cor)
  {
    this.cor = cor;
  }

  public String getModelo()
  {
    return modelo;
  }

  public void setModelo(String modelo)
  {
    this.modelo = modelo;
  }

  public int getAnoFabricacao()
  {
    return anoFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao)
  {
    this.anoFabricacao = anoFabricacao;
  }

}
