/*****************************************************************************************
 *  11.
 *  Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. 
 *  Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem 
 *  informando que não existe mês com este número.
*****************************************************************************************/

import java.util.Scanner;
public class Mes{

    public static void main(String[] args) {
        
    int nummes;
        
    Scanner teclado = new Scanner(System.in);
        
    System.out.println("Digite um número de 1 a 12: ");
    nummes = teclado.nextInt(); 
        
    
    if(nummes < 0 || nummes > 12 ){
	  System.out.println("Não existe dia da semana");
    } 
	else if(nummes == 1) {
	  System.out.println("Janeiro");
	}
    else if(nummes == 2) {
	  System.out.println("Fevereiro");
	}
    else if(nummes == 3) {
	  System.out.println("Março");
	}
    else if(nummes == 4) {
	  System.out.println("Abril");
	}
	else if(nummes == 5) {
	  System.out.println("Maio");
	}
	else if(nummes == 6) {
	  System.out.println("Junho");
	}
	else if(nummes == 7) {
	  System.out.println("Julho");
	}
	else if(nummes == 8) {
	  System.out.println("Agosto");
	}
	else if(nummes == 9) {
	  System.out.println("Setembro");
	}
	else if(nummes == 10) {
	  System.out.println("Outubro");
	}
	else if(nummes == 11) {
	  System.out.println("Novembro");
	}
	else if(nummes == 11) {
	  System.out.println("Dezembro");
	}
}
}
