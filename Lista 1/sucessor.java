/*************************************************************************
 *  11) 
 *  Faça um programa que receba um número inteiro e que imprima o:
 *  antecessor, sucessor, o dobro e a metade do número informado
 *************************************************************************/
 
import java.util.Scanner;
public class sucessor
{
	public static void main(String[] args) {
	    
	    int x, antecessor, sucessor, metade, dobro;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Digite um número: ");
	    x = ler.nextInt();
	    
	    antecessor = x-1;
	    sucessor = x+1;
	    metade = x/2;
	    dobro = x*2;
	    
	    System.out.println("Seu antecessor é: "+antecessor);
	    System.out.println("Seu sucessor é: "+sucessor);
	    System.out.println("Seu metade é: "+metade);
	    System.out.println("Seu dobro é: "+dobro);
	    
	}
}
