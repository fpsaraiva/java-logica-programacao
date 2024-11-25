package beecrowd;

import java.util.Scanner;

public class SubstituicaoVetor1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor X com 10 elementos
        int[] X = new int[10];

        //Leitura de valores
        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
        }

        //Substituindo os valores 0 e negativos por 1
        for (int i = 0; i < 10; i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }

        //Exibindo valores
        for (int i = 0; i < 10; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }

        scanner.close();
    }

}
