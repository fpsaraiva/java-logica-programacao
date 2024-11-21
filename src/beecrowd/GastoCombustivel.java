package beecrowd;

import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        //1 - Cria objeto de leitura
        Scanner t = new Scanner(System.in);

        //2 - Leitura dos valores
        int tempo = t.nextInt();
        int velociddade = t.nextInt();

        //3 - Cálculo da distancia e litros
        double distancia = velociddade * tempo;
        double litros = distancia / 12;

        //4 - Imprime resultado
        System.out.printf("%.3f", litros);
    }
}
