/**************************************************************
*  7) 
*  Faça um programa que leia a idade e peso de sete pessoas. 
*  Calcule e mostre:
*  - a quantidade de pessoas com mais de 90 kg
*  - a média das idades das sete pessoas
**************************************************************/
import java.util.Scanner;
public class IdadePeso{

public static void main(String[] args) {
	
Scanner ler = new Scanner (System.in);
int idade, acima, media;
double peso = 0, soma = 0;
	    
for (int i = 0; i < 7; i++) {
System.out.println("Informe sua idade: ");
idade = ler.nextInt(); 
        
System.out.println("informe seu peso: ");
peso = ler.nextDouble();
	
if (peso > 90){
acima++;
}
soma = soma + idade; 
}    
	
media = soma/7;
	 
System.out.println("Há um total de "+acima+ " com mais de 90 kilos.");
System.out.println("A média de idade das pessoas é " +media);
 }
   }
