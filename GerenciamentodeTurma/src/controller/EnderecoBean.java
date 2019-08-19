package controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.EnderecoDao;
import entity.*;

@ManagedBean
@SessionScoped
public class EnderecoBean {

	  private Endereco endereco;
	  private List<Endereco> enderecoList;
	  private EnderecoDao ad;

	  @PostConstruct
	  public void init()
	  {
	    this.endereco = new Endereco();
	    this.ad = new EnderecoDao();
	    this.enderecoList = ad.list();
	  }
	  
	  public String save()
	  {
		ad.saveOrUpdate(endereco);
	    this.endereco = new Endereco();
	    return "endereco";
	  }

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Endereco> getEnderecoList() {
		return enderecoList;
	}

	public void setEnderecoList(List<Endereco> enderecoList) {
		this.enderecoList = enderecoList;
	}
	  	  
}
