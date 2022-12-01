/*************************************************************************
 *  1) 
 *  Faça um programa que receba dois números e mostre o maior e o menor. 
 *  E emita uma mensagem caso os dois sejam iguais.
 *************************************************************************/

 import java.util.Scanner; 
 public class MaiorMenor
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	   int A, B; 
	   
	   System.out.println("Digite o primeiro valor ");
	   A = ler.nextInt();
	   
	   System.out.println("Digite o segundo valor ");
	   B = ler.nextInt();
	   
	   if(A>B){
	    System.out.print("Maior: "+A);
	    System.out.println("Menor: "+B);
	    
	   }
	   
	   else if(B>A) {
	       System.out.println("Maior: "+B);
	       System.out.println("Menor: "+A);
	   }
	    
	   else { 
	       System.out.println("Os valores são iguais.");
	   }

	}
}

/************************************************************
*  2)
*  Faça um programa que receba as duas notas de um aluno, 
*  calcule sua média, e que imprima a sua situação: 
*  >= 7 -> Aprovado
*  < 7 -> Reprovado
**************************************************************/

 import java.util.Scanner; 
 public class ListaCondicional
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	   int nota1, nota2; 
	   
	   System.out.println("Digite as duas notas: ");
	   nota1 = ler.nextInt();
	   nota2 = ler.nextInt();
	   
	   int media = (nota1+nota2)/2;

	   
	   if(media>=7){
	    System.out.print("Parabéns você está Aprovado!");
	   }
	   else { 
	       System.out.println("Lamento você está reprovado.");
	   }
	}
}

/************************************************************
*  3)
*  Faça um programa que receba 3 notas de um aluno, calcule e
*  mostre uma mensagem de acordo com sua média
**************************************************************/

 import java.util.Scanner; 
 public class Notas
 {
	public static void main(String[] args) {
	    
	  Scanner ler = new Scanner(System.in);
	   int nota1, nota2, nota3;
	   
	   System.out.println("Digite as três notas: ");
	   nota1 = ler.nextInt();
	   nota2 = ler.nextInt();
	   nota3 = ler.nextInt();
	   
	   int media = (nota1+nota2+nota3)/3;

	   
	   if(media>=0 && media<3){
	    System.out.print("Lamento você está reprovado.");
	   }
	   else if(media>=3 && media<7) { 
	       System.out.println("Exame.");
	   }
	   
	   else if(media>=7 && media<=10) {
	       System.out.println("Parabéns você está aprovado.");
	   }
	   
	   else {
	       System.out.println("Valor inválido.");
	   }
	}
}

/************************************************************************
*  4) 
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

/***************************************************************************
*  5) 
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

/**********************************************************************************
*  6) 
*  Construa um programa para determinar se o indivíduo está com um peso 
*  favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea)
*  que é definida como sendo a relação entre o peso (PESO – em kg) 
*  e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja, IMC= PESO/ALTURA2
***********************************************************************************/
import java.util.Scanner; 
public class Imc{ 

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

/**********************************************************************************
*  7) 
*  Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores 
*  a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o 
*  valor do salário reajustado ou uma mensagem, caso o funcionário não tenha 
*  direito ao aumento.
***********************************************************************************/
import java.util.Scanner;
public class Salario{

    public static void main(String[] args) {
        
    int salario;
        
    Scanner ler = new Scanner(System.in);
        
    System.out.println("Digite seu salario: ");
    salario = ler.nextInt(); 
        
    
    if(salario < 1.000){
	  System.out.println("Você tem direito a reajuste");
	  System.out.println("Salario Reajustado é: " +salario * 1.3);
    } 
    
	else {
	  System.out.println("Você não tem direito a reajuste");
    }
}
}


/**********************************************************************************
*  8) 
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

/************************************************************************************
 *  9)
 *  Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
 *  - não eleitor (abaixo de 16 anos); 
 *  - eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
 *  - eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)
*************************************************************************************/
import java.util.Scanner; 
public class Eleicao { 

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);   
    int  idade; 
    
    System.out.println("Digite sua idade: ");
    idade = ler.nextInt();
    
    if(idade < 16) {
        System.out.println("Não eleitor.");
    }
    else if (idade >= 18 && idade < 65) {
        System.out.println("Eleitor obrigatório."); 
    } 
    else if(idade >= 16 && idade < 18 && idade < 65) {
        System.out.println("Eleitor facultativo."); 
    }
}
}
  
/*****************************************************************************************
 *  10)
 *  Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia 
 *  da semana correspondente. Caso o usuário digite um número fora desse intervalo,
 *  deverá aparecer uma mensagem informando que não existe dia da semana com esse número.
*****************************************************************************************/
import java.util.Scanner;
public class DiaSemana{

    public static void main(String[] args) {
        
    int numdia;
        
    Scanner teclado = new Scanner(System.in);
        
    System.out.println("Digite um número de 1 a 7: ");
    numdia = teclado.nextInt(); 
        
    
    if(numdia < 0 || numdia > 8 ){
	  System.out.println("Não existe dia da semana");
    } 
	else if(numdia == 1) {
	  System.out.println("Domingo");
	}
    else if(numdia == 2) {
	  System.out.println("Segunda");
	}
    else if(numdia == 3) {
	  System.out.println("Terça");
	}
    else if(numdia == 4) {
	  System.out.println("Quarta");
	}
	else if(numdia == 5) {
	  System.out.println("Quinta");
	}
	else if(numdia == 6) {
	  System.out.println("Sexta");
	}
	else if(numdia == 7) {
	  System.out.println("Sábado");
	}
}
}
  
/*****************************************************************************************
 *  11)
 *  Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. 
 *  Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem 
 *  informando que não existe mês com este número.
*****************************************************************************************/

import java.util.Scanner;
public class Mes{

    public static void main(String[] args) {
        
    int nummes;
        
    Scanner teclado = new Scanner(System.in);
        
    System.out.println("Digite um número de 1 a 12: ");
    nummes = teclado.nextInt(); 
        
    
    if(nummes < 0 || nummes > 12 ){
	  System.out.println("Não existe dia da semana");
    } 
	else if(nummes == 1) {
	  System.out.println("Janeiro");
	}
    else if(nummes == 2) {
	  System.out.println("Fevereiro");
	}
    else if(nummes == 3) {
	  System.out.println("Março");
	}
    else if(nummes == 4) {
	  System.out.println("Abril");
	}
	else if(nummes == 5) {
	  System.out.println("Maio");
	}
	else if(nummes == 6) {
	  System.out.println("Junho");
	}
	else if(nummes == 7) {
	  System.out.println("Julho");
	}
	else if(nummes == 8) {
	  System.out.println("Agosto");
	}
	else if(nummes == 9) {
	  System.out.println("Setembro");
	}
	else if(nummes == 10) {
	  System.out.println("Outubro");
	}
	else if(nummes == 11) {
	  System.out.println("Novembro");
	}
	else if(nummes == 11) {
	  System.out.println("Dezembro");
	}
}
}

/*****************************************************************************************
 *  12)
 *  Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
 *  1 – Somar
 *  2 – Subtrair 
 *  3 – Multiplicar
 *  4 – Dividir
 *  5 – Sair
 *  Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
*****************************************************************************************/

import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int Opcao = 0;
        double Valor1, Valor2, Resultado;

                    System.out.println();
                    System.out.println("Calculadora em Java");
                    System.out.println();
                    System.out.println("1. Soma");
                    System.out.println("2. Subtrair");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Sair");
                    System.out.println();
                    System.out.println("Escolha a opção:");
                    Opcao = leia.nextInt();

    
        if (Opcao == 1) {
                    System.out.println("Soma");
                    System.out.println("Entre com o primeiro valor:");
                    Valor1 = leia.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    Valor2 = leia.nextDouble();
                    Resultado = Valor1 + Valor2;
                    System.out.println("O Resultado é:" + Resultado);
            }   
        else if (Opcao == 2) {
                    System.out.println("Subtrair");
                    System.out.println("Entre com o primeiro valor:");
                    Valor1 = leia.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    Valor2 = leia.nextDouble();  
                    Resultado = Valor1 - Valor2;
                    System.out.println("O Resultado é:" + Resultado);
            }       
        else if (Opcao == 3) {
                    System.out.println("Multiplicar");
                    System.out.println("Entre com o primeiro valor:");
                    Valor1 = leia.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    Valor2 = leia.nextDouble();
                    Resultado = Valor1 * Valor2;
                    System.out.println("O Resultado é:" + Resultado);
            } 
        else if (Opcao == 4) {
                    System.out.println("Dividir");
                    System.out.println("Entre com o primeiro valor:");
                    Valor1 = leia.nextDouble();
                    System.out.println("Entre com o segundo valor:");
                    Valor2 = leia.nextDouble();
                    Resultado = Valor1 / Valor2;
                    System.out.println("O Resultado é:" + Resultado);
            } 
        else if (Opcao == 5) {
                 System.out.println("Programa finalizado");   
            }
        }
    
    }
