/****************************************************
*  2) 
*  Faça um programa que leia um número e que imprima 
*  os números ímpares de 1 até o número informado.
******************************************* *********/
import java.util.Scanner;
public class Impares {

public static void main(String[] args) {
	    
Scanner ler = new Scanner(System.in);
int x;

System.out.println("Digite um numero: ");
x = ler.nextInt();

for (int num = 1; num <= x; num++) {
if ((num%2) == 1) {
System.out.println(num);
   } 
  } 
 }  
}
