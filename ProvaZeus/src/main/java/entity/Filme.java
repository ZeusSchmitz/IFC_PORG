package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Filme implements Serializable
{

  @Id
  @GeneratedValue
  private Long id;
  private String nomeFilme;
  private String ano;

  public Filme()
  {
  }

  public Filme(String nomeFilme, String ano)
  {
    this.nomeFilme = nomeFilme;
    this.ano = ano;
  }

  public String getNomeFilme()
  {
    return nomeFilme;
  }

  public void setNomeFilme(String nomeFilme)
  {
    this.nomeFilme = nomeFilme;
  }

  public String getAno()
  {
    return ano;
  }

  public void setAno(String ano)
  {
    this.ano = ano;
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

}
