/************************************************************************************************
 *  7) 
 *  Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário
 *  calcule e mostre a quantidade de salários mínimos que este funcionário ganha.
 ***********************************************************************************************/

import java.util.Scanner;
public class SalarioMin
{
	public static void main(String[] args) {
	    
	    double salario, salariomin = 1212, qntsal;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.print("Informe o salário do funcionário: ");
	    salario = ler.nextDouble();
	    
	    qntsal = salario/salariomin;
	    
	    System.out.printf("Este funcionário recebe o equivalente a: R$ "+qntsal+" Salários Mínimos.");
	    
	}
}
