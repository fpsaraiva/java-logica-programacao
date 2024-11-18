package aula1114;

import java.util.Scanner;

public class NumeroPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita a frase ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        //Inicializa a contagem de palavras
        int contador = 0;

        //Remove espaços extras no início e no final e divide a frase em palavras
        String[] palavras = frase.trim().split(" ");

        // Laço 'for' para percorrer cada palavra resultante da divisão
        for (int conta = 0; conta < palavras.length; conta++) {
            contador++;
        }

        System.out.println("Número de palavras: " + contador);

        scanner.close();
    }
}
