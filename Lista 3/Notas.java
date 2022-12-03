/**************************************************************
*  6) 
*  Faça um programa que leia as notas de 5 alunos, e que exiba 
*  a maior e menor notas entre elas.
**************************************************************/
import java.util.Scanner;
public class Main{
	
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
