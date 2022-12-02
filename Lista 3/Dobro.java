/****************************************************
*  1) 
*  Faça um programa que faça a leitura de 5 valores
*  e para cada valor, mostre o seu dobro na tela. 
******************************************* *********/
import java.util.Scanner; 
public class Dobro{

public static void main(String[] args) {
	    
Scanner ler = new Scanner(System.in);
     
System.out.println("Digite um número: ");
	
for(int i=0; i<5; i++) { 
int num = ler.nextInt();
System.out.println("O Dobro de "+num+ " é "+2*num);
	
  } 
 }
}
