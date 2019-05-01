package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco implements Serializable
{
  @Id
  private String nomeRua;
  private int num;
  private String comp;

  public String getNomeRua()
  {
    return nomeRua;
  }

  public void setNomeRua(String nomeRua)
  {
    this.nomeRua = nomeRua;
  }

  public int getNum()
  {
    return num;
  }

  public void setNum(int num)
  {
    this.num = num;
  }

  public String getComp()
  {
    return comp;
  }

  public void setComp(String comp)
  {
    this.comp = comp;
  }
  
}
