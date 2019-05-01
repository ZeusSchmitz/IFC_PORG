package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable
{
  @Id
  @GeneratedValue
  private Long id;

  private String nome;
  
  private Integer cpf;
  
  private Integer senha;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Endereco> endereco = new ArrayList<>();
  
  @ManyToMany(cascade = CascadeType.ALL)
  private List<Filme> filme = new ArrayList<>();

  public Usuario(String nome, Integer cpf, Integer senha)
  {
    this.nome = nome;
    this.cpf = cpf;
    this.senha = senha;
  }

  public Usuario()
  {
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public Integer getCpf()
  {
    return cpf;
  }

  public void setCpf(Integer cpf)
  {
    this.cpf = cpf;
  }

  public Integer getSenha()
  {
    return senha;
  }

  public void setSenha(Integer senha)
  {
    this.senha = senha;
  }

  public List<Endereco> getEndereco()
  {
    return endereco;
  }

  public void setEndereco(List<Endereco> endereco)
  {
    this.endereco = endereco;
  }
  public List<Filme> getFilme()
  {
    return filme;
  }

  public void setFilme(List<Filme> filme)
  {
    this.filme = filme;
  }

}
