/*************************************************************************
 *  1)
 *  Leia 3 números inteiros e imprima a média aritmética entre os números
 *
 *************************************************************************/
import java.util.Scanner;
public class MediaAritmetica
{
  public static void main (String[]args)
  {
     Scanner ler = new Scanner(System.in);

       double a, b, c, media;

       System.out.printf("Digite o primeiro valor: ");
       a = ler.nextInt();

       System.out.printf("Digite o segundo valor: ");
       b = ler.nextInt();

       System.out.printf("Digite o terceiro valor: ");
       c = ler.nextInt();

       media = (a+b+c)/3;

       System.out.println("Certo, a média artimética é: "+media); 
  }
}
