/**************************************************************
*  4) 
*  Faça um programa que solicite ao usuário que informe o valor
*  das temperaturas coletadas nos 10 primeiros dias do mês de 
*  janeiro de 2021, em Belo Horizonte. Imprima em seguida a 
*  média dessas temperaturas.
**************************************************************/
import java.util.Scanner;
public class Temperatura{
public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
	  
int soma = 0, media; 
int temperatura[] = new int[10];
	 
for(int i = 0; i < 10; i++) {
	  
System.out.println("Digite a temperatura "+(+i+1));
temperatura[i] = leia.nextInt();
soma = temperatura[i];   
}
      
media = soma / 10;
System.out.println("A média de temperatura é "+media);
        
} 
} 
