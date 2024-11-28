package beecrowd;

import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;
        int tipoCombustivel;

        do {
            tipoCombustivel = sc.nextInt();

            if(tipoCombustivel < 1 || tipoCombustivel > 4) {
                System.out.println("Tipo inválido. Selecione novamente uma opção.");
            }

            if(tipoCombustivel == 1) {
                alcool += 1;
            } else if(tipoCombustivel == 2) {
                gasolina += 1;
            } else if(tipoCombustivel == 3) {
                diesel += 1;
            }

        } while (tipoCombustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
