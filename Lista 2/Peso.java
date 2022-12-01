/***************************************************************************
*  5. 
*  Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa 
*  calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
*  Peso ideal (homens) = (72,7 * H) – 58. 
*  Peso ideal (mulheres) = (62,1 * H) – 44,7
****************************************************************************/
import java.util.Scanner; 
public class Peso{ 

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);   
       
    double  altura, pesoideal;
    String genero;
    
    System.out.println("Digite sua altura:");
    altura = ler.nextDouble();
    
    System.out.println("Digite seu sexo (M) ou (F):");
    genero = ler.next();
    
    if(genero.equals("M")) {
        pesoideal = 72.7*altura - 58;
    }
    else {
        pesoideal = 62.1*altura - 44.7;
    } 
  
    System.out.println("O seu peso ideal é " +pesoideal);
}
}

