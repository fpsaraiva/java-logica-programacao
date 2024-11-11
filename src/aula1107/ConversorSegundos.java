package aula1107;

import java.util.Scanner;

public class ConversorSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        int segundos = scanner.nextInt();

        int minutos = segundos / 60;
        int segundos2 = minutos % 60;

        System.out.println("Tempo informado em segundos (após convertido) fica " + minutos + " minutos " + segundos2 + " segundos.");
    }
}
