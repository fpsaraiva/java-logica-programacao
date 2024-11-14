package aula1113;

import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero, somaPares = 0;

        //Laço que permite usuário informar 10 números
        for(int contador = 0; contador < 10; contador++) {
            numero = leitor.nextInt();

            //Lógica para somar número ao total, caso seja par
            if(numero % 2 == 0) {
                somaPares = somaPares + numero;
            }
        }

        System.out.println("A soma total de pares é :" + somaPares);

        leitor.close();
    }
}
