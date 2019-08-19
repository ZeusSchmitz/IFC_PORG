package home;

public class TestaCasa
{
  public static void main(String[] args)
  {
    Casa casa = new Casa(
                  new Porta("Azul", 10, 20, 30), 
                  new Porta("Amarelo", 10, 20, 30), 
                  new Porta("Verde", 10, 20, 30), "Branco"
                );


    System.out.println("-------------------------Porta 1-------------------------------");
    System.out.println("Casa com porta1 na cor: " + casa.getPorta1().getCor());
    casa.getPorta1().abre();
    System.out.println("Porta está aberta? " + casa.getPorta1().estaAberta());
    casa.getPorta1().pinta("Branco");
    System.out.println("Alterada a cor da porta1 para: " + casa.getPorta1().getCor());
    System.out.println("Casa na cor: " + casa.getCor());
    casa.pinta("Bege");
    System.out.println("Alterada a cor da casa para: " + casa.getCor());
    casa.getPorta1().fecha();
    System.out.println("Porta está aberta? " + casa.getPorta1().estaAberta());
    System.out.println("--------------------------------------------------------------");
    System.out.println("-------------------------Porta 2-------------------------------");
    System.out.println("Casa com porta2 na cor: " + casa.getPorta2().getCor());
    casa.getPorta2().abre();
    System.out.println("Porta está aberta? " + casa.getPorta2().estaAberta());
    casa.getPorta2().pinta("Laranja");
    System.out.println("Alterada a cor da porta2 para: " + casa.getPorta2().getCor());
    System.out.println("Casa na cor: " + casa.getCor());
    casa.pinta("Amarela");
    System.out.println("Alterada a cor da casa para: " + casa.getCor());
    casa.getPorta2().fecha();
    System.out.println("Porta está aberta? " + casa.getPorta2().estaAberta());
    System.out.println("--------------------------------------------------------------");
    System.out.println("-------------------------Porta 3-------------------------------");
    System.out.println("Casa com porta3 na cor: " + casa.getPorta3().getCor());
    casa.getPorta3().abre();
    System.out.println("Porta está aberta? " + casa.getPorta3().estaAberta());
    casa.getPorta3().pinta("Marrom");
    System.out.println("Alterada a cor da porta3 para: " + casa.getPorta3().getCor());
    System.out.println("Casa na cor: " + casa.getCor());
    casa.pinta("Azul");
    System.out.println("Alterada a cor da casa para: " + casa.getCor());
    casa.getPorta3().fecha();
    System.out.println("Porta está aberta? " + casa.getPorta3().estaAberta());
    System.out.println("--------------------------------------------------------------");
    casa.getPorta1().abre();
    casa.getPorta2().abre();
    casa.getPorta3().abre();
    System.out.println(casa.quantasPortasEstaoAbertas() + " portas abertas");
    
  } 
}
