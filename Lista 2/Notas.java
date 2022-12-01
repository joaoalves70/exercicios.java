/************************************************************
*  3. 
*  Faça um programa que receba 3 notas de um aluno, calcule e
*  mostre uma mensagem de acordo com sua média
**************************************************************/

 import java.util.Scanner; 
 public class Notas
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	   int nota1, nota2, nota3;
	   
	   System.out.println("Digite as três notas: ");
	   nota1 = ler.nextInt();
	   nota2 = ler.nextInt();
	   nota3 = ler.nextInt();
	   
	   int media = (nota1+nota2+nota3)/3;

	   
	   if(media>=0 && media<3){
	    System.out.print("Lamento você está reprovado.");
	   }
	   else if(media>=3 && media<7) { 
	       System.out.println("Exame.");
	   }
	   
	   else if(media>=7 && media<=10) {
	       System.out.println("Parabéns você está aprovado.");
	   }
	   
	   else {
	       System.out.println("Valor inválido.");
	   }
	}
}
