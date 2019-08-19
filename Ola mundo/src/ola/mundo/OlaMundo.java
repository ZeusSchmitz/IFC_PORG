package ola.mundo;

import java.util.Scanner;

public class OlaMundo
{

  public static void main(String[] args)
  {
    Scanner teclado = new Scanner(System.in);
    int vlr1 = 0;
    int vlr2 = 0;
    System.out.println("Digite um número positivo");
    vlr1 = Integer.parseInt(teclado.nextLine());
    System.out.println("Digite um número positivo");
    vlr2 = Integer.parseInt(teclado.nextLine());
    multiplica(vlr1, vlr2);
  }
  public static int multiplica(int vlr1, int vlr2)
  {
    return (vlr1 > 0 && vlr2 > 1) ? vlr1 += multiplica(vlr1, --vlr2) : (vlr1==0) ? 0 : vlr1;
  }
}
