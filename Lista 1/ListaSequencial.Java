/*************************************************************************
 *  1)
 *  Leia 3 números inteiros e imprima a média aritmética entre os números
 *************************************************************************/
import java.util.Scanner;
public class ListaSequencial
{
  public static void main (String[]args)
  {
     Scanner ler = new Scanner(System.in);

       double a, b, c, media;

       System.out.printf("Digite o primeiro valor: ");
       a = ler.nextInt();

       System.out.printf("Digite o segundo valor: ");
       b = ler.nextInt();

       System.out.printf("Digite o terceiro valor: ");
       c = ler.nextInt();

       media = (a+b+c)/3;

       System.out.println("Certo, a média artimética é: "+media); 
  }
}

/*************************************************************************
 *  2) 
 *  Faça um programa que receba o ano de nascimento de uma pessoa e imprima:
 *  A idade atual e a idade que ela terá em 2050
 *************************************************************************/
 
import java.util.Scanner;
public class ListaSequencial
{
  public static void main (String[]args)
  {
      Scanner ler = new Scanner (System.in);

      float ano, futuro, idade;

      System.out.printf("Bem vindo! Para começarmos, favor digite seu ano de nascimento: ");
      ano = ler.nextFloat ();

      idade = 2022 - ano;
      futuro = 2050 - ano;

      System.out.printf ("Certo, você tem: " + idade +" anos, em 2050, você terá: " + futuro + " anos.");

  }
}

/*************************************************************************
 *  3) 
 *  Faça um programa que receba a cotação do dolár em reais, e um valor que
 *  o usuário possui em dólares. Imprima este valor em reais. 
 *************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner (System.in);
		double cotacao, capital, resultado;
		
		System.out.print("Por favor me diga a cotação atual do dólar: R$ ");
		cotacao = ler.nextDouble();
		
		System.out.print("Certo, agora me diga quantos dólares você tem: $ ");
		capital = ler.nextDouble();
		
		resultado = cotacao*capital;
		
		System.out.println("Pronto, o equivalente a $ "+capital+" em reais é: R$ "+resultado);
		
	}
}

/*************************************************************************
 *  4) 
 *  Faça um programa que calcule e mostre a área de um losangulo.
 *************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner (System.in);
	    
	    double area, diagonalmaior, diagonalmenor;
	    
	    System.out.print("Informe o valor da diagonal maior em metros: ");
	    diagonalmaior = ler.nextDouble();
	    
	    System.out.print("Informe o valor da diagonal menor em metros: ");
	    diagonalmenor = ler.nextDouble();
	    
	    area = (diagonalmaior*diagonalmenor)/2;
	    
	    System.out.println("A area do losangulo é de: "+area+" metros");
	}
}



/****************************************************************************
 *  5) 
 *  Faça um programa que receba uma temperatura em Celsius, calcule e mostre
 *  essa temperatura em Fahrenheit. 
 ***************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double c, f;
		
		System.out.print("Informe a temperatura em graus celsius: ");
		c = ler.nextDouble();
		
		f = ((c*1.8)+32);
		
		System.out.print(c+"°C equivale a: "+f+"°F.");
	}
}

/*********************************************************************************
 *  6) 
 *  Faça um programa que solicite ao usuário que informe os coeficientes
 *  A, B e C de uma equação de segundo grau, e que imprima as raízes desta equação
 *********************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    double a, b, c, delta, raiz1, raiz2;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.print("Por favor informe o valor de A: ");
	    a = ler.nextDouble();
	    
	    System.out.print("Por favor informe o valor de B: ");
	    b = ler.nextDouble();
	    
	    System.out.print("Por favor informe o valor de C: ");
	    c = ler.nextDouble();
	    
	    delta = b*b - 4 * a * c;
	    
	    raiz1 = (double) (-b+Math.sqrt(delta))/(2*a);
	    
	    raiz2 = (double) (-b-Math.sqrt(delta))/(2*a);
	    
	    System.out.print("As raízes obtidas são: "+raiz1+" e "+raiz2);
	}
}

/************************************************************************************************
 *  7) 
 *  Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário
 *  calcule e mostre a quantidade de salários mínimos que este funcionário ganha.
 ***********************************************************************************************/

import java.util.Scanner;
public class ListaSequencial
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

/*************************************************************************
 *  8) 
 *  Leia um um número e imprima a tabuada de multiplicar deste número.
 *************************************************************************/
import java.util.Scanner;
public class ListaSequencial
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

/**********************************************************************
 *  9) 
 *  Receba um número positivo, calcule e mostre:
 *  O número ao quadrado, ao cubo, sua raiz quadrada e sua raiz cúbica
 *********************************************************************/
 
 import java.util.Scanner;
public class ListaSequencial
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

/*************************************************************************
 *  10) 
 *  Faça um programa que leia o valor da conta de um cliente e informe 
 *  o valor da taxa do Garçom e o valor final da conta.
 *************************************************************************/
 
import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    double conta,valorgarcom, contafinal;
	    Scanner ler = new Scanner (System.in);
	    System.out.println("Qual o valor da conta? ");
	    conta = ler.nextDouble();
	    valorgarcom = conta*0.10;
	    contafinal= valorgarcom+conta;
	    System.out.println("A taxa do Garçom foi de: R$ "+valorgarcom+". E o valor final da conta a ser paga é de: R$ "+contafinal);	    
	}
}

/*************************************************************************
 *  11) 
 *  Faça um programa que receba um número inteiro e que imprima o:
 *  antecessor, sucessor, o dobro e a metade do número informado
 *************************************************************************/
 
import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    int x, antecessor, sucessor, metade, dobro;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Digite um número: ");
	    x = ler.nextInt();
	    
	    antecessor = x-1;
	    sucessor = x+1;
	    metade = x/2;
	    dobro = x*2;
	    
	    System.out.println("Seu antecessor é: "+antecessor);
	    System.out.println("Seu sucessor é: "+sucessor);
	    System.out.println("Seu metade é: "+metade);
	    System.out.println("Seu dobro é: "+dobro);
	    
	}
}

/*************************************************************************
 *  12) 
 *  Faça um programa que receba a altura de um homem e imprima o
 *  o peso ideal do mesmo.
 *************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    double h, pesoideal;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Qual a sua Altura?");
	    h = ler.nextDouble();
	    
	    pesoideal = (72.7*h)-(58);
	    
	    System.out.println("O seu peso ideal é de: "+pesoideal+ " kg.");	    	    
	    
	}
}

/*************************************************************************
 *  13) 
 *  Faça um programa que receba a altura de uma mulher e imprima o
 *  o peso ideal da mesma.
 *************************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    double h, pesoideal;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Qual a sua Altura?");
	    h = ler.nextDouble();
	    
	    pesoideal = (62.1*h)-(44.7);
	    
	    System.out.println("O seu peso ideal é de: "+pesoideal+ " kg.");	    
	    
	}
}

/****************************************************************
 *  14) 
 *  Faça um programa que leia duas variáveis e troque o conteúdo
 *  dessas duas variáveis invertidas.
 ***************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    double x, y, xy, yx;
	    Scanner ler = new Scanner (System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    x = ler.nextDouble();
	    
	    System.out.println("Digite o segundo número:");
	    y = ler.nextDouble();
	    
	    System.out.println("O primeiro número digitado foi: "+y+". E o segundo foi: "+x);	    
	    
	}
}

/*********************************************************************
 *  15) 
 *  Considerando uma eleição de apenas dois candidatos, faça um
 *  programa que leia o número total de eleitores, o número de
 *  votos do primeiro candidato e o número de votos do segundo
 *  candidato. Em seguida, o programa deverá apresentar o percentual
 *  de votos de cada um dos candidatos e o percentual de votos nulos.
 ********************************************************************/

import java.util.Scanner;
public class ListaSequencial
{
	public static void main(String[] args) {
	    
	    
    Scanner ler = new Scanner(System.in);
    int votoTotal = 0;
    int voto1 = 0;
    int voto2 = 0;
    int votoNuloBranco = 0;

    System.out.println("Qual a quantidade total de eleitores?");
    votoTotal = ler.nextInt();

    System.out.println("Quantas pessoas votaram no primeiro candidato?");
    voto1 = ler.nextInt();

    System.out.println("Quantas pessoas votaram no segundo candidato?");
    voto2 = ler.nextInt();

    votoNuloBranco = votoTotal - voto1 - voto2;

    double voto1Pct = voto1 * 100 / votoTotal;
    double voto2Pct = voto2 * 100 / votoTotal;
    double votoNuloBrancoPct = votoNuloBranco * 100 / votoTotal;

    System.out.println("O total de votos foi de " + votoTotal);
    
    System.out.println("A quantidade total de votos no primeiro candidato foi de " + voto1 + " com " + voto1Pct  + "% dos votos");
    
    System.out.println("A quantidade total de votos no Cletinho foi de " + voto2 + " com " + voto2Pct   + "% dos votos");
    
    System.out.println(  "Quantidade de votos nulos ou brancos foi de " + votoNuloBranco + " com " + votoNuloBrancoPct + "% dos votos");
	    
	    
	}
}
