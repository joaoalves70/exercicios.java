/*************************************************************************
 *  8) 
 *  Leia um um número e imprima a tabuada de multiplicar deste número.
 *************************************************************************/
import java.util.Scanner;
public class Tabuada
{
	public static void main(String[] args) {
	    int num;
        Scanner ler = new Scanner(System.in);
	    System.out.println("Digite um número: ");
 	    n1 = ler.nextInt();
 	    for (int i = 0; i < 10; i++){
 	       System.out.println(n1+"x"+i+"="+(n1*i));
 	    }
	}
}
