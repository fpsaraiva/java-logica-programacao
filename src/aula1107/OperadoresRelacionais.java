package aula1107;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        //Menor
        boolean primeiraExpressao =  89.1 < 89.1;
        //Menor ou igual
        boolean segundaExpressao = 89.1 <= 89.1;
        //Maior
        boolean terceiraExpressao = 150 > 89.1;
        //Maior ou igual
        boolean quartaExpressao = 89.1 >= 89.1;

        //Igual
        boolean valoresIguais = 511 == 510;
        //Não igual (diferente)
        boolean diferentes = 4564 != 4564;

        //Imprime resultados primeiraExpressao
        System.out.println(primeiraExpressao);
        //Imprime resultado segundaExpressao
        System.out.println(segundaExpressao);
        //Imprime resultado terceiraExpressao
        System.out.println(terceiraExpressao);
        //Imprime resultado quartaExpressao
        System.out.println(quartaExpressao);
        //Imprime resultado iguais
        System.out.println(valoresIguais);
        //Imprime resultado não iguais
        System.out.println(diferentes);
    }
}
