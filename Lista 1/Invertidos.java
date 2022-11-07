/****************************************************************
 *  14) 
 *  Faça um programa que leia duas variáveis e troque o conteúdo
 *  dessas duas variáveis invertidas.
 ***************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double x, y, xy, yx;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    x = ler.nextDouble();
	    
	    System.out.println("Digite o segundo número:");
	    y = ler.nextDouble();
	    
	    System.out.println("O primeiro número digitado foi: "+y+". E o segundo foi: "+x);	    
	    
	}
}
