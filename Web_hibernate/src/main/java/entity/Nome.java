package entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Nome implements Serializable
{

  String primeiro;
  String segundo;

  public String getPrimeiro()
  {
    return primeiro;
  }

  public void setPrimeiro(String primeiro)
  {
    this.primeiro = primeiro;
  }

  public String getSegundo()
  {
    return segundo;
  }

  public void setSegundo(String segundo)
  {
    this.segundo = segundo;
  }
}
