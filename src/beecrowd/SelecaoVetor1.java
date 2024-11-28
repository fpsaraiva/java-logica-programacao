package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SelecaoVetor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0");

        // Declaração do vetor A com 100 elementos
        double[] listaValores = new double[5];

        // Leitura dos valores do vetor
        for (int i = 0; i < listaValores.length; i++) {
            listaValores[i] = scanner.nextDouble();
        }

        // Exibição das posições e valores menores ou iguais a 10
        for (int i = 0; i < listaValores.length; i++) {
            if (listaValores[i] <= 10) {
                System.out.println("A[" + i + "] = " + decimal.format(listaValores[i]));
            }
        }

        scanner.close();
    }
}
