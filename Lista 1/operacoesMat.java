/**********************************************************************
 *  9) 
 *  Receba um número positivo, calcule e mostre:
 *  O número ao quadrado, ao cubo, sua raiz quadrada e sua raiz cúbica
 *********************************************************************/
 
 import java.util.Scanner;
public class Opera
{
	public static void main(String[] args) {
	    
	    double x, quadrado, cubo, raizqua, raizcu;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.print("Me diga um número: ");
	    x = ler.nextDouble();
	    
	    quadrado = Math.pow(x,2);
	    cubo = Math.pow(x,3);
	    raizqua = Math.sqrt(x);
	    raizcu = Math.cbrt(x);
	    
	    System.out.println("Este número ao quadrado é igual a: "+quadrado);
	    System.out.println("Este número ao cubo é igual a: "+cubo);
	    System.out.println("A raiz quadrada deste número é igual a: "+raizqua);
	    System.out.println("A raiz cúbica deste número é igual a: "+raizcu);	    
	}
}
