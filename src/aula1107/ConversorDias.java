package aula1107;

import java.util.Scanner;

public class ConversorDias {

    public static void main(String[] args) {
        //Criando um objeto para ler os dias
        Scanner teclado = new Scanner(System.in);

        //Informa o que desejamos receber de informação do usuário
        System.out.println("Digite uma quantidade de dias: ");

        //Leitura das informações passadas pelo usuário
        int dias = teclado.nextInt();

        //Cálculo das semanas, considerando uma semana contendo 7 dias
        int semanas = dias / 7;
        //Cálculo dos dias que restam
        int diasRestantes = dias % 7;

        //Imprimir o resultado do nosso algoritmo
        System.out.println(dias + "dias são iguais a " + semanas + " semanas e " + diasRestantes + " dias.");

        //Fechando o objeto de leitura
        teclado.close();
    }

}
