/**********************************************************************************
*  8. 
*  Faça um programa que receba a idade de um nadador e mostre a sua categoria
***********************************************************************************/
import java.util.Scanner;
public class Main{

    import java.util.Scanner; 
    public class Main{ 

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);   
       
    int  idade; 
    
    System.out.println("Digite a sua idade:");
    idade = ler.nextInt();
    
    if(idade <= 7) {
        System.out.println("Sua categoria é Infantil");
    }
    else if (idade >= 8 && idade < 10) {
        System.out.println("Sua categoria é Juvenil"); 
    } 
    else if(idade >= 11 && idade < 15) {
        System.out.println("Sua categoria é Adolescente"); 
    } 
    else if(idade >= 16 && idade < 30) {
        System.out.println("Sua categoria é Adulto"); 
    } 
    else if(idade > 30) {
        System.out.println("Sua categoria é Senior");
    } 
   
}
}
