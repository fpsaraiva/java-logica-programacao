package aula1104;

public class VariaveisTipos {

    /*
    Crie uma classe chamada VariaveisTipos, e nela declare e inicialize variáveis de todos os tipos primitivos vistos
    em sala de aula (byte, short, int, long, float, double, char, boolean) e imprima os valorfpsaraiva@es de todos eles no console.
     */

    public static void main(String[] args) {

        byte valorNumerico = 125;
        short valorNumeroShort = 12512;
        int numeroInteiro = 500;
        long numeroLong = 5000L;

        float pontoFloat = 156.4f;
        double valorEmDouble = 156.4;

        char simboloDePresencaChamada = 'P';

        boolean valorNegativoOuPositivo = false;

        System.out.println("O valor do byte é " + valorNumerico + ". O valor do short é " + valorNumeroShort);
        System.out.println(numeroInteiro);
        System.out.println(numeroLong);

        System.out.println(pontoFloat);
        System.out.println(valorEmDouble);

        System.out.println(simboloDePresencaChamada);

        System.out.println(valorNegativoOuPositivo);
    }
}
