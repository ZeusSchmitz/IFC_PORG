package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contato implements Serializable
{

  @Id
  @GeneratedValue
  private Integer id;

  private Nome nome;
    
  private String notas;

  private Url site;

  public Integer getId_usuario()
  {
    return id_usuario;
  }

  public void setId_usuario(Integer id_usuario)
  {
    this.id_usuario = id_usuario;
  }

  private Integer id_usuario;
  
  @OneToMany(cascade = CascadeType.ALL)
  private List<Telefone> telefones = new ArrayList<>();
  
  private boolean favoritos;

  public Contato()
  {
    // TODO Auto-generated constructor stub
  }

  public Contato(Nome nome, String notas, Url site, boolean favoritos, int id_usuario)
  {
    this.nome = nome;
    this.notas = notas;
    this.site = site;
    this.favoritos = favoritos;
    this.id_usuario = id_usuario;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Nome getNome()
  {
    return nome;
  }

  public void setNome(Nome nome)
  {
    this.nome = nome;
  }

  public String getNotas()
  {
    return notas;
  }

  public void setNotas(String notas)
  {
    this.notas = notas;
  }

  public Url getSite()
  {
    return site;
  }

  public void setSite(Url site)
  {
    this.site = site;
  }

  public List<Telefone> getTelefones()
  {
    return telefones;
  }

  public void setTelefones(List<Telefone> telefones)
  {
    this.telefones = telefones;
  }

  public boolean isFavoritos()
  {
    return favoritos;
  }

  public void setFavoritos(boolean favoritos)
  {
    this.favoritos = favoritos;
  }
}
