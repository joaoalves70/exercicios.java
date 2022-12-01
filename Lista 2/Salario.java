/**********************************************************************************
*  7. 
*  Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores 
*  a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o 
*  valor do salário reajustado ou uma mensagem, caso o funcionário não tenha 
*  direito ao aumento.
***********************************************************************************/
import java.util.Scanner;
public class Salario{

    public static void main(String[] args) {
        
    int salario;
        
    Scanner ler = new Scanner(System.in);
        
    System.out.println("Digite seu salario: ");
    salario = ler.nextInt(); 
        
    
    if(salario < 1.000){
	  System.out.println("Você tem direito a reajuste");
	  System.out.println("Salario Reajustado é: " +salario * 1.3);
    } 
    
	else {
	  System.out.println("Você não tem direito a reajuste");
    }
}
}


