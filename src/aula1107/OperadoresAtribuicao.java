package aula1107;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        //Atribuição - Atribuir valor para uma variável
        String texto = "Estamos estudando operadore";

        int valor1 = 15000;
        int soma = 10;
        int subtracao = 1;

        //soma = soma + 1;
        soma += valor1;
        System.out.println(soma);

        subtracao -= valor1;
        System.out.println(subtracao);

        //*= /= %=

        int numero = 100;

        //Auto-incremento
        System.out.println(numero++);
        System.out.println(++numero);

        //Auto-decremento
        System.out.println(--numero);
    }
}
