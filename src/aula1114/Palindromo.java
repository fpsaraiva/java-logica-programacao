package aula1114;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        //1 - Leitura da palavra digitada pelo usuário
        String palavra = scanner.nextLine();

        //2 - Consideramos inicialmente a palavra como palíndromo
        boolean ehPalindromo = true;
        //3 - Temos a informação de tamanho da palavra
        int comprimento = palavra.length();

        //4 - Verificarmos as letras das palavras por pares
        for (int i = 0; i < comprimento / 2; i++) {
            //SE as letras não coincide, a palavra não é palĩndromo
            if (palavra.charAt(i) != palavra.charAt(comprimento - i - 1)) {
                ehPalindromo = false;
                break; // Interrompe o loop em caso de letras diferentes
            }
        }

        System.out.println("A palavra é palíndromo? " + ehPalindromo);

        scanner.close();
    }
}
