/*************************************************************************
 *  13) 
 *  Faça um programa que receba a altura de uma mulher e imprima o
 *  o peso ideal da mesma.
 *************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double h, pesoideal;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Qual a sua Altura?");
	    h = ler.nextDouble();
	    
	    pesoideal = (62.1*h)-(44.7);
	    
	    System.out.println("O seu peso ideal é de: "+pesoideal+ " kg.");	    
	    
	}
}
