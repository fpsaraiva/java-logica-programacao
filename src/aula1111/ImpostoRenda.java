package aula1111;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor dia do salário: ");
        double salarioDia = teclado.nextDouble();
        System.out.println("Digite a quantidade de dias trabalhados: ");
        int dias = teclado.nextInt();

        double salarioTotal = salarioDia + dias;

        double desconto;

        if (salarioTotal < 2259.20) {
            desconto = 0;
            System.out.println("Isento. Você não foi descontado");
        } else if (salarioTotal >= 2259.21 && salarioTotal <= 2826.65) {
            desconto = salarioTotal * 0.075;
            System.out.println("Você foi descontado R$" + desconto);
        } else if (salarioTotal > 2826.66 && salarioTotal <= 3571.05) {
            desconto = salarioTotal * 0.15;
            System.out.println("Você foi descontado " + desconto);
        } else if (salarioTotal >= 3571.06 && salarioTotal <+ 4644.68) {
            desconto = calculaDesconto(salarioTotal, 0.225);
            System.out.println("Você foi descontado " + desconto);
        } else if (salarioTotal > 4644.68) {
            desconto = calculaDesconto(salarioTotal, 0.275);
            System.out.println("Você foi descontado " + desconto);
        }
    }

    public static double calculaDesconto(double salarioTotal, double porcentagem) {
        return salarioTotal * porcentagem;
    }
}
