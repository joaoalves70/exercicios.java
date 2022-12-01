/*****************************************************************************************
 *  12.
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
