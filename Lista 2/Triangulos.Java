/************************************************************************
*  3. 
*  Dados três valores X,Y,Z, verificar se eles podem ser os 
*  comprimentos dos lados de um triângulo. Se eles não formarem 
*  um triângulo escrever uma mensagem. Considerar que o comprimento 
*  de cada lado de um triângulo é menor que a soma dos outros dois lados.

*************************************************************************/
import java.util.Scanner;
public class Triangulos
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	float x, y, z; 
	
	System.out.println("Informe o valor de x, y e z:");
    x = ler.nextFloat();
    y = ler.nextFloat();
    z = ler.nextFloat();
	
    if (x == y && y == z){ 
    System.out.println("Triângulo equilátero");
    }
    
    else if ( x == y || x == z || y== z){
     System.out.println("Triângulo isósceles");
     
    }
    
    else { 
        System.out.println("Não é um triângulo");
    }    
}
}
