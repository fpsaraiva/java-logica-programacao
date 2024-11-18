package aula1114;

import java.util.Scanner;

public class EncontrarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a palavra ao usuário
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar a contagem

        // Inicializa o contador de vogais
        int contadorVogais = 0;

        // Laço 'for' para percorrer cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            // Verifica se o caractere é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais: " + contadorVogais);

        scanner.close();
    }
}
