package beecrowd;

import java.util.Scanner;

public class PreenchimentoVetor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor N com 10 elementos
        int[] N = new int[10];

        // Leitura do valor inicial
        N[0] = scanner.nextInt();

        // Preenchendo o vetor com o dobro do valor anterior
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }

        // Exibindo o vetor no formato solicitado
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        scanner.close();
    }
}
