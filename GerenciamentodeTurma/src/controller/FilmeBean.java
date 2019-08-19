package controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.FilmeDao;
import entity.Filme;

@ManagedBean
@SessionScoped
public class FilmeBean {

	private static final long serialVersionUID = 1L;
	private Filme filme;
	private FilmeDao ad;
	private List<Filme> FilmeList;

	@PostConstruct
	public void init() {
		this.filme = new Filme();
		this.ad = new FilmeDao();
		this.FilmeList = ad.list();
	}

	public String newAluno() {
		return "manageAluno";
	}

	public String delete(Filme filme) {
		ad.delete(filme);
		return "filme";
	}

	public String edit(Filme filme) {
		this.filme = filme;
		return "manageFilme";
	}

	public String save() {
		ad.saveOrUpdate(filme);
		this.filme = new Filme();
		return "aluno";
	}

	// Geters and seters
	public Filme getAluno() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public FilmeDao getAd() {
		return ad;
	}

	public void setAd(FilmeDao ad) {
		this.ad = ad;
	}

	public List<Filme> getAlunoList() {
		this.FilmeList = ad.list();
		return FilmeList;
	}

	public void setAlunoList(List<Filme> filmeList) {
		FilmeList = filmeList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
