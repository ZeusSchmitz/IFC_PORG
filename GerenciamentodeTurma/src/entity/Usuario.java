package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  @Column
  String nome;
  @Column
  String senha;

  public Usuario()
  {
    // TODO Auto-generated constructor stub
  }

  public Usuario(String nome, String senha)
  {
    this.nome = nome;
    this.senha = senha;
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getSenha()
  {
    return senha;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public void setSenha(String senha)
  {
    this.senha = senha;
  }

}
