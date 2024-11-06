package aula1104;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura você quer converter? ");
        double celsius = teclado.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius + " graus Celsius em Fahrenheit é igual a " + fahrenheit);
    }
}
