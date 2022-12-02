/***************************************************
*  3) 
*  Leia um número e imprima a tabuada de multiplicar 
*  deste número. Por exemplo, para o número 5:
****************************************************/
import java.util.Scanner;
public class Tabuada{

public static void main(String[] args) {
int n;
	    
Scanner ler = new Scanner(System.in);

System.out.println("Digite um numero: ");
n = ler.nextInt();
        
for (int i = 0; i < 10; i++){
 	      
System.out.println(n + " x "+ i + " = " + (n*i));
}   
  }
     }
