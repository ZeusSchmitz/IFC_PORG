package entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CaledarioAluno")
@Entity
public class Calendario implements Serializable
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String data;
  private String descricaoAtividade;

  public Calendario()
  {

  }

  public Calendario(Long id, String data, String descricaoAtividade)
  {
    super();
    this.id = id;
    this.data = data;
    this.descricaoAtividade = descricaoAtividade;
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getData()
  {
    return data;
  }

  public void setData(String data)
  {
    this.data = data;
  }

  public String getDescricaoAtividade()
  {
    return descricaoAtividade;
  }

  public void setDescricaoAtividade(String descricaoAtividade)
  {
    this.descricaoAtividade = descricaoAtividade;
  }

}
