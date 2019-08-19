package home;

public class Porta
{
  private boolean aberta = false;
  private String cor;
  private float dimensaoX, dimensaoY, dimensaoZ;
  
  public Porta(String cor, float dimensaoX, float dimensaoY, float dimensaoZ)
  {
    this.cor = cor;
    this.dimensaoX = dimensaoX;
    this.dimensaoY = dimensaoY;
    this.dimensaoZ = dimensaoZ;
  }

  public void abre()
  {
    this.aberta = true;   
  }
  
  public void fecha()
  {
    this.aberta = false;
  }
  
  public void pinta(String cor)
  {
    setCor(cor);
  }
  
  public boolean estaAberta()
  {
    return this.aberta == true;
  }
  
  public String getCor()
  {
    return cor;
  }

  public void setCor(String cor)
  {
    this.cor = cor;
  }

  public float getDimensaoX()
  {
    return dimensaoX;
  }

  public void setDimensaoX(float dimensaoX)
  {
    this.dimensaoX = dimensaoX;
  }

  public float getDimensaoY()
  {
    return dimensaoY;
  }

  public void setDimensaoY(float dimensaoY)
  {
    this.dimensaoY = dimensaoY;
  }

  public float getDimensaoZ()
  {
    return dimensaoZ;
  }

  public void setDimensaoZ(float dimensaoZ)
  {
    this.dimensaoZ = dimensaoZ;
  }
  
}
