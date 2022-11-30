/*************************************************************************
 *  1)
 *  Leia 3 números inteiros e imprima a média aritmética entre os números
 *************************************************************************/
import java.util.Scanner;
public class ListaSequencial
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

/*************************************************************************
 *  3) 
 *  Faça um programa que calcule e mostre a área de um losangulo.
 *************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner (System.in);
	    
	    double area, diagonalmaior, diagonalmenor;
	    
	    System.out.print("Informe o valor da diagonal maior em metros: ");
	    diagonalmaior = ler.nextDouble();
	    
	    System.out.print("Informe o valor da diagonal menor em metros: ");
	    diagonalmenor = ler.nextDouble();
	    
	    area = (diagonalmaior*diagonalmenor)/2;
	    
	    System.out.println("A area do losangulo é de: "+area+" metros");
	}
}

/****************************************************************************
 *  5) 
 *  Faça um programa que receba uma temperatura em Celsius, calcule e mostre
 *  essa temperatura em Fahrenheit. 
 ***************************************************************************/

import java.util.Scanner;
public class ConversorTemperatura
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double c, f;
		
		System.out.print("Informe a temperatura em graus celsius: ");
		c = ler.nextDouble();
		
		f = ((c*1.8)+32);
		
		System.out.print(c+"°C equivale a: "+f+"°F.");
	}
}
