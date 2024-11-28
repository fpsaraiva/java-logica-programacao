package beecrowd;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String oqFoiDigitado = entrada.nextLine();

        String[] lista = oqFoiDigitado.split(" ");

        int a = Integer.parseInt(lista[0]);
        int b = Integer.parseInt(lista[1]);
        int c = Integer.parseInt(lista[2]);

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");
    }
}
