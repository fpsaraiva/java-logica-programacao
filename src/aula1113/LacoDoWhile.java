package aula1113;

import java.util.Scanner;

public class LacoDoWhile {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("O número sorteado foi " + aleatorio);

        Scanner sc = new Scanner(System.in);

        int palpite;

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = sc.nextInt();

            //Continua no laço, caso o palpite não seja correto
        } while (aleatorio != palpite);

        System.out.println("Parabéns, você acertou! O número sorteado foi o " + aleatorio);
        sc.close();
    }
}
