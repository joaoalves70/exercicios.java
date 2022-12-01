/**********************************************************************************
*  6. 
*  Construa um programa para determinar se o indivíduo está com um peso 
*  favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea)
*  que é definida como sendo a relação entre o peso (PESO – em kg) 
*  e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja, IMC= PESO/ALTURA2
***********************************************************************************/
import java.util.Scanner; 
public class Main{ 

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);   
    float  peso, altura, imc;
    
    System.out.println("Digite sua altura:");
    altura = ler.nextFloat();
    
    System.out.println("Digite seu peso em Kilos" );
    peso = ler.nextFloat();
    
    imc = peso/(altura*altura);
    
    if(imc<20) {
        System.out.println("Seu IMC é "+imc+" você está abaixo do peso");
    }
    
    else if (imc>= 20 && imc<25) {
        System.out.println("Seu IMC é "+imc+" você está no peso Normal"); 
    } 
    
    else if(imc>= 25 && imc<30) {
        System.out.println("Seu IMC é "+imc+" você está com sobre Peso"); 
    } 
    
    else if(imc>= 30 && imc<40) {
        System.out.println("Seu IMC é "+imc+" você está com Obesidade"); 
    } 
    
    else if(imc>40) {
        System.out.println("Seu IMC é "+imc+" você está com Obesidade Mórbida"); 
    }    
}
}

