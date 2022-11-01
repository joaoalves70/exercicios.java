/*************************************************************************
 *  10) 
 *  Faça um programa que leia o valor da conta de um cliente e informe 
 *  o valor da taxa do Garçom e o valor final da conta.
 *************************************************************************/
 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    double conta,valorgarcom, contafinal;
	    Scanner ler = new Scanner (System.in);
	    System.out.println("Qual o valor da conta? ");
	    conta = ler.nextDouble();
	    valorgarcom = conta*0.10;
	    contafinal= valorgarcom+conta;
	    System.out.println("A taxa do Garçom foi de: R$ "+valorgarcom+". E o valor final da conta a ser paga é de: R$ "+contafinal);	    
	}
}
