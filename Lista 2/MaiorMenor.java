/*************************************************************************
 *  1) 
 *  Faça um programa que receba dois números e mostre o maior e o menor. 
 *  E emita uma mensagem caso os dois sejam iguais.
 *************************************************************************/

 import java.util.Scanner; 
 public class MaiorMenor
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	   int A, B; 
	   
	   System.out.println("Digite o primeiro valor ");
	   A = ler.nextInt();
	   
	   System.out.println("Digite o segundo valor ");
	   B = ler.nextInt();
	   
	   if(A>B){
	    System.out.print("Maior: "+A);
	    System.out.println("Menor: "+B);
	    
	   }
	   
	   else if(B>A) {
	       System.out.println("Maior: "+B);
	       System.out.println("Menor: "+A);
	   }
	    
	   else { 
	       System.out.println("Os valores são iguais.");
	   }

	}
}
