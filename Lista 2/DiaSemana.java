/*****************************************************************************************
 *  10.
 *  Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia 
 *  da semana correspondente. Caso o usuário digite um número fora desse intervalo,
 *  deverá aparecer uma mensagem informando que não existe dia da semana com esse número.
*****************************************************************************************/
import java.util.Scanner;
public class DiaSemana{

    public static void main(String[] args) {
        
    int numdia;
        
    Scanner teclado = new Scanner(System.in);
        
    System.out.println("Digite um número de 1 a 7: ");
    numdia = teclado.nextInt(); 
        
    
    if(numdia < 0 || numdia > 8 ){
	  System.out.println("Não existe dia da semana");
    } 
	else if(numdia == 1) {
	  System.out.println("Domingo");
	}
    else if(numdia == 2) {
	  System.out.println("Segunda");
	}
    else if(numdia == 3) {
	  System.out.println("Terça");
	}
    else if(numdia == 4) {
	  System.out.println("Quarta");
	}
	else if(numdia == 5) {
	  System.out.println("Quinta");
	}
	else if(numdia == 6) {
	  System.out.println("Sexta");
	}
	else if(numdia == 7) {
	  System.out.println("Sábado");
	}
}
}
