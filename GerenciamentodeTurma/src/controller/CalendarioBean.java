package controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

import dao.CaledarioDao;
import entity.Calendario;

@ManagedBean
@SessionScoped
public class CalendarioBean
{

  private static final long serialVersionUID = 1L;
  private Calendario calendario;
  private CaledarioDao cd;
  private List<Calendario> CalendarioList;

  @PostConstruct
  public void init()
  {
    this.calendario = new Calendario();
    this.cd = new CaledarioDao();
    this.CalendarioList = cd.list();
  }

  public String newCalendario()
  {
    return "calendarioAluno";
  }

  public String delete(Calendario calendario)
  {
    cd.delete(calendario);
    return "calendario";
  }

  public String edit(Calendario calendario)
  {
    this.calendario = calendario;
    return "calendarioAluno";
  }

  public String save()
  {
    cd.saveOrUpdate(calendario);
    this.calendario = new Calendario();
    return "calendario?faces-redirect=true";
  }

  public void onDateSelect(SelectEvent event)
  {
    FacesContext facesContext = FacesContext.getCurrentInstance();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
  }

  // Geters and seters
  public Calendario getCalendario()
  {
    return calendario;
  }

  public void setCalendario(Calendario calendario)
  {
    this.calendario = calendario;
  }

  public CaledarioDao getCd()
  {
    return cd;
  }

  public void setCd(CaledarioDao cd)
  {
    this.cd = cd;
  }

  public List<Calendario> getCalendarioList()
  {
    this.CalendarioList = cd.list();
    return CalendarioList;
  }

  public void setCalendarioList(List<Calendario> calendarioList)
  {
    CalendarioList = calendarioList;
  }

  public static long getSerialversionuid()
  {
    return serialVersionUID;
  }

}
