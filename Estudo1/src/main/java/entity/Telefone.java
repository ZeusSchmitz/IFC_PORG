package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable
{
  @Id
  String telefone;
  String tipo;

  public String getTelefone()
  {
    return telefone;
  }

  public void setTelefone(String telefone)
  {
    this.telefone = telefone;
  }

  public String getTipo()
  {
    return tipo;
  }

  public void setTipo(String tipo)
  {
    this.tipo = tipo;
  }
}
