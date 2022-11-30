/*********************************************************************************
 *  6) 
 *  Faça um programa que solicite ao usuário que informe os coeficientes
 *  A, B e C de uma equação de segundo grau, e que imprima as raízes desta equação
 *********************************************************************************/

import java.util.Scanner;
public class EquacaoSegGrau
{
	public static void main(String[] args) {
	    
	    double a, b, c, delta, raiz1, raiz2;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.print("Por favor informe o valor de A: ");
	    a = ler.nextDouble();
	    
	    System.out.print("Por favor informe o valor de B: ");
	    b = ler.nextDouble();
	    
	    System.out.print("Por favor informe o valor de C: ");
	    c = ler.nextDouble();
	    
	    delta = b*b - 4 * a * c;
	    
	    raiz1 = (double) (-b+Math.sqrt(delta))/(2*a);
	    
	    raiz2 = (double) (-b-Math.sqrt(delta))/(2*a);
	    
	    System.out.print("As raízes obtidas são: "+raiz1+" e "+raiz2);
	}
}
