package dao;

import java.util.ArrayList;
import models.Carro;
import models.Usuario;

public class Teste
{

  public static void main(String[] args) throws ClassNotFoundException
  {
    System.out.println("Olá mundo");

   
    CarroDao carroDao = new CarroDao();
    Carro carro = new Carro("fusca", "cinza", "Volks", 1999, "Zec");
    boolean insereCarro = carroDao.criaCarro(carro);
    System.out.println("insereCarro = " + insereCarro);

    ArrayList<Carro> carros = carroDao.listarCarro("Zec");
    System.out.println("qtdade carros = " + carros);

    boolean alteraCarro = carroDao.alterarCarro(carro);
    System.out.println("alteraCarro = " + alteraCarro);

//    boolean excluiCarro = carroDao.removerCarro(carro);
//    System.out.println("excluiCarro = " + excluiCarro);
  }
}
