/*************************************************************************
 *  3) 
 *  Faça um programa que receba a cotação do dolár em reais, e um valor que
 *  o usuário possui em dólares. Imprima este valor em reais. 
 *************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner (System.in);
		double cotacao, capital, resultado;
		
		System.out.print("Por favor me diga a cotação atual do dólar: R$ ");
		cotacao = ler.nextDouble();
		
		System.out.print("Certo, agora me diga quantos dólares você tem: $ ");
		capital = ler.nextDouble();
		
		resultado = cotacao*capital;
		
		System.out.println("Pronto, o equivalente a $ "+capital+" em reais é: R$ "+resultado);
		
	}
}
