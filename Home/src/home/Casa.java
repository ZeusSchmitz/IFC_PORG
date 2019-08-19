package home;

public class Casa
{
  Porta porta1, porta2, porta3;
  String cor;
  
  public Casa(Porta porta1, Porta porta2, Porta porta3, String cor)
  {
    this.porta1 = porta1;
    this.porta2 = porta2;
    this.porta3 = porta3;
    this.cor = cor;
  }

  public void pinta(String cor)
  {
    this.cor = cor;
  }
  
  public int quantasPortasEstaoAbertas()
  {
    int portasAbertas = 0;
    if(porta1.estaAberta())
      portasAbertas++;
    
    if(porta2.estaAberta())
      portasAbertas++;
    
    if(porta3.estaAberta())
      portasAbertas++;
    
    return portasAbertas;
  }
  
  public String getCor()
  {
    return cor;
  }

  public Porta getPorta1()
  {
    return porta1;
  }

  public Porta getPorta2()
  {
    return porta2;
  }

  public Porta getPorta3()
  {
    return porta3;
  }
}
