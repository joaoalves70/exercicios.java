/**************************************************************
*  4) 
*  Faça um programa que leia o sexo e o peso de 10 pessoas
*  e mostre quantas pessoas do sexo masculino possuem peso entre 
*  60 e 80 kg, bem como a quantidade de mulheres que possuem 
*  peso entre 50 e 70 kg.
**************************************************************/
import java.util.Scanner;
public class Peso{
public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
int contM = 0, contF = 0;
String sexo; 
Float peso;
        
for(int i = 0;i < 10;i++){
System.out.println("Seu sexo é M ou F? ");
sexo = leia.next();
        
System.out.println("Digite seu peso: ");
peso = leia.nextFloat();
        
    
if (sexo.equals("m") && (peso >= 60 && peso <= 80)){
contM = contM + 1;
}
      
else if (sexo.equals("f") && (peso >= 50 && peso <= 70)) {
contF = contF + 1;

} 
        
  }
 
System.out.println(contM);
System.out.println(contF);
} 
  }
