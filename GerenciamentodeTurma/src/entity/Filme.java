package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.mysql.fabric.xmlrpc.base.Data;

@Table(name = "filme")
@Entity
public class Filme implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Data ano;
	@ManyToOne
	@JoinColumn(name = "id")
	private Usuario usuario;

	public Filme() {
	}

	public Filme(Long id, String name, Data ano) {
		this.id = id;
		this.name = name;
		this.ano = ano;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data getAno() {
		return ano;
	}

	public void setAno(Data ano) {
		this.ano = ano;
	}

}
