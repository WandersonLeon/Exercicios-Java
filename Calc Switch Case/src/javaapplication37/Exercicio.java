
package javaapplication37;

import java.util.*;

public class Exercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Declaração variaveis
        double num1, num2;
        String operacao = "";
        boolean continuar = true;

        //Leitura do teclado
        while (continuar) {
            System.out.print("Informe o primeiro numero:");
            num1 = teclado.nextDouble();
            System.out.print("Informe o segundo numero:");
            num2 = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Escolha uma operaçao (+, -, *, /, sqrt, pow): ");

            operacao = teclado.nextLine();

            double resultado = 0;
            boolean operacaoValida = true;

            //Escolha caso
            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("ERRO: Divisao por ZERO nao permitida.");
                        operacaoValida = false;
                    }
                    break;
                case "sqrt":
                    resultado = (int) Math.sqrt(num1);
                    break;
                case "pow":
                    resultado = (int) Math.pow(num1, num2);
                    break;
                default:

                    System.out.println("Operacaoo invalida.");
                    operacaoValida = false;

            }
            if (operacaoValida) {
                System.out.println("O resultado da operacao e " + resultado);
            }
            System.out.println("Deseja realizar outra operacao? (s/n)");
            String resposta = teclado.next();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }

            System.out.println("Calculadora encerrada!");
        }
    }
}
