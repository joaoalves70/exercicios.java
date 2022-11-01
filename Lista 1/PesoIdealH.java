/*************************************************************************
 *  12) 
 *  Faça um programa que receba a altura de um homem e imprima o
 *  o peso ideal do mesmo.
 *************************************************************************/

import java.util.Scanner;
public class PesoIdealH
{
	public static void main(String[] args) {
	    double h, pesoideal;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Qual a sua Altura?");
	    h = ler.nextDouble();
	    
	    pesoideal = (72.7*h)-(58);
	    
	    System.out.println("O seu peso ideal é de: "+pesoideal+ " kg.");	    	    
	    
	}
}
