/*************************************************************************
 *  2) 
 *  Faça um programa que receba o ano de nascimento de uma pessoa e imprima:
 *  A idade atual e a idade que ela terá em 2050
 *************************************************************************/
 
import java.util.Scanner;
public class Idade
{
  public static void main (String[]args)
  {
      Scanner ler = new Scanner (System.in);

      float ano, futuro, idade;

      System.out.printf("Bem vindo! Para começarmos, favor digite seu ano de nascimento: ");
      ano = ler.nextFloat ();

      idade = 2022 - ano;
      futuro = 2050 - ano;

      System.out.printf ("Certo, você tem: " + idade +" anos, em 2050, você terá: " + futuro + " anos.");

  }
}
