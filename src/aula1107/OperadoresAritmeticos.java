package aula1107;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        //Adição
        int soma = 88 + 100;
        System.out.println(soma);

        //Subtração
        double subtrair = 55.8 - 99.46;
        System.out.println(subtrair);

        //Multiplicação
        String mensagemPadrao = "Resultado da ";

        double multiplicar = 547 * 12.789787;
        //Como fazer para arredondar um valor?
        //Outros métodos: floor(), ceil()
        double multiplicarArredondar = Math.round(multiplicar);

        System.out.println(mensagemPadrao + "mulitplicacao" + multiplicar);
        System.out.println("Número arredondado é: " + multiplicarArredondar);

        //Divisão
        double divisao = 888 / 54;
        System.out.println(mensagemPadrao + "divisão" + divisao);

        //Módulo
        double modulo = 151 % 6;
        System.out.println(modulo);
    }
}
