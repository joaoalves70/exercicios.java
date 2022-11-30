/*************************************************************************
 *  2) 
 *  Faça um programa que receba as duas notas de um aluno, calcule sua média
 *  e que imprima a sua situação: 
 *  >= 7 -> Aprovado
 *  < 7 -> Reprovado
 *************************************************************************/

 import java.util.Scanner; 
 public class Main
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	  double nota1, nota2;
	  
	  System.out.println("Informe a primeira e a segunda nota: ");
	  nota1 = ler.nextDouble();
	  nota2 = ler.nextDouble();
	  
	  double media = (nota1+nota2)/2;
	  
	  if (media>=7){
	      System.out.println("Parabéns você está aprovado!");
	  } else {
	      System.out.println("Lamento mas você está reprovado!");
	  }
	}
}
