package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Url implements Serializable
{
  @Column(name = "nome_site")
  String nome;
  String endereco;

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getEndereco()
  {
    return endereco;
  }

  public void setEndereco(String endereco)
  {
    this.endereco = endereco;
  }

}
