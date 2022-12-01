/************************************************************
*  2. Faça um programa que receba as duas notas de um aluno, 
*  calcule sua média, e que imprima a sua situação: 
*  >= 7 -> Aprovado
*  < 7 -> Reprovado
**************************************************************/

 import java.util.Scanner; 
 public class Aprovado
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	   int nota1, nota2; 
	   
	   System.out.println("Digite as duas notas: ");
	   nota1 = ler.nextInt();
	   nota2 = ler.nextInt();
	   
	   int media = (nota1+nota2)/2;

	   
	   if(media>=7){
	    System.out.print("Parabéns você está Aprovado!");
	   }
	   else { 
	       System.out.println("Lamento você está reprovado.");
	   }

	}
}
