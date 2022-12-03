/****************************************************
*  1) 
*  Faça um programa que faça a leitura de 5 valores
*  e para cada valor, mostre o seu dobro na tela. 
******************************************* *********/
import java.util.Scanner; 
public class ListaRepeticao{

public static void main(String[] args) {
	    
Scanner ler = new Scanner(System.in);
     
System.out.println("Digite um número: ");
	
for(int i=0; i<5; i++) { 
int num = ler.nextInt();
System.out.println("O Dobro de "+num+ " é "+2*num);
	
  } 
 }
}

/****************************************************
*  2) 
*  Faça um programa que leia um número e que imprima 
*  os números ímpares de 1 até o número informado.
******************************************* *********/
import java.util.Scanner;
public class ListaRepeticao{

public static void main(String[] args) {
	    
Scanner ler = new Scanner(System.in);
int x;

System.out.println("Digite um numero: ");
x = ler.nextInt();

for (int num = 1; num <= x; num++) {
if ((num%2) == 1) {
System.out.println(num);
   } 
  } 
 }  
}

/***************************************************
*  3) 
*  Leia um número e imprima a tabuada de multiplicar 
*  deste número. Por exemplo, para o número 5:
****************************************************/
import java.util.Scanner;
public class ListaRepeticao{

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

/**************************************************************
*  4) 
*  Faça um programa que solicite ao usuário que informe o valor
*  das temperaturas coletadas nos 10 primeiros dias do mês de 
*  janeiro de 2021, em Belo Horizonte. Imprima em seguida a 
*  média dessas temperaturas.
**************************************************************/
import java.util.Scanner;
public class ListaRepeticao{
public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
	  
int soma = 0, media; 
int temperatura[] = new int[10];
	 
for(int i = 0; i < 10; i++) {
	  
System.out.println("Digite a temperatura "+(+i+1));
temperatura[i] = leia.nextInt();
soma = temperatura[i];   
}
      
media = soma / 10;
System.out.println("A média de temperatura é "+media);
        
} 
} 

/**************************************************************
*  6) 
*  Faça um programa que leia as notas de 5 alunos, e que exiba 
*  a maior e menor notas entre elas.
**************************************************************/
import java.util.Scanner;
public class ListaRepeticao{
	
public static void main(String[] args) {
	    
Scanner ler = new Scanner(System.in);
double nota,notaM=0,notaMenor=999;
        
for(int i = 0; i<5;i++){

System.out.println("Insira a nota do aluno: "+(i+1));
nota = ler.nextDouble();

if(nota>notaM)
notaM = nota;
	
if (nota<notaMenor)
notaMenor = nota;

} 
        
System.out.println("A maior nota obtida foi "+notaM);
System.out.println("A menor nota obtida foi "+notaMenor);
	   
}
}

/**************************************************************
*  7) 
*  Faça um programa que leia a idade e peso de sete pessoas. 
*  Calcule e mostre:
*  - a quantidade de pessoas com mais de 90 kg
*  - a média das idades das sete pessoas
**************************************************************/
import java.util.Scanner;
public class ListRepeticao{

public static void main(String[] args) {
	
Scanner ler = new Scanner (System.in);
int idade, acima, media;
double peso = 0, soma = 0;
	    
for (int i = 0; i < 7; i++) {
System.out.println("Informe sua idade: ");
idade = ler.nextInt(); 
        
System.out.println("informe seu peso: ");
peso = ler.nextDouble();
	
if (peso > 90){
acima++;
}
soma = soma + idade; 
}    
	
media = soma/7;
	 
System.out.println("Há um total de "+acima+ " com mais de 90 kilos.");
System.out.println("A média de idade das pessoas é " +media);
 }
   }
