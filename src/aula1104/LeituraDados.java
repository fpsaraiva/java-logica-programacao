package aula1104;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in).useLocale(Locale.US);

        //Leitura de números
        System.out.println("Olá, primeiro digita o número de tentativas: ");
        int numeroTentativas = entrada.nextInt();
        System.out.println("Foram realizadas " + numeroTentativas + "tentativas");

        System.out.println("Qual o valor de um X top na city? ");
        double valorX = entrada.nextDouble();
        System.out.println("Um X top deve custqr em média R$ " + valorX);

        //Leitura de outros tipos
        System.out.println("Você deseja continuar com o programa (S/N)? ");
        char continuacao = entrada.next().charAt(0);
        System.out.println(continuacao);

        System.out.println("Agora, você tem certeza que deseja continuar?");
        boolean terminar = entrada.nextBoolean();
        System.out.println(terminar);

    }
}
