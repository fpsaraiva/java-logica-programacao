package aula1113;

import java.util.Scanner;

public class NovoCaixaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor que você deseja sacar: ");
        int valor = teclado.nextInt();

        //Caso o valor digitado seja negativo
        if (valor <= 0) {
            System.out.println("O valor informado deve ser maior que zero.");
        } else {
            // Algoritmo que realiza a contagem das cédulas
            int notas100 = valor / 100;
            valor = valor % 100;

            int notas50 = valor / 50;
            valor = valor % 50;

            int notas20 = valor / 20;
            valor = valor % 20;

            int notas10 = valor / 10;
            valor = valor % 10;

            int notas5 = valor / 5;
            valor = valor % 5;

            // Exibição da quantidade de cédulas
            System.out.println("Cédulas entregues:");
            if (notas100 > 0) {
                System.out.println(notas100 + " notas de R$ 100");
            }

            if (notas50 > 0) {
                System.out.println(notas50 + " notas de R$ 50");
            }

            if (notas20 > 0) {
                System.out.println(notas20 + " notas de R$ 20");
            }

            if (notas10 > 0) {
                System.out.println(notas10 + " notas de R$ 10");
            }

            if (notas5 > 0) {
                System.out.println(notas5 + " notas de R$ 5");
            }

            // Verifica se algum valor ficou sem ser distribuído
            if (valor > 0) {
                System.out.println("Valor de R$ " + valor + " não pode ser sacado com as cédulas disponíveis.");
            }
        }

        teclado.close();
    }
}
