package beecrowd;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        //1 - Cria objeto de leitura
        Scanner t = new Scanner(System.in);

        //2 - Leitura dos valores
        int numero = t.nextInt();
        int hora = t.nextInt();
        double valor = t.nextDouble();

        //3 - Cálculo do salário
        double salario = hora * valor;

        //4 - Imprime os valores
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
