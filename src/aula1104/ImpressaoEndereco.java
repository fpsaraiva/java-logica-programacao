package aula1104;

import java.util.Scanner;

public class ImpressaoEndereco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o endereço da rua em que você estuda?");
        String enderecoRua = leitor.nextLine();

        System.out.println("Qual o número?");
        int numero = leitor.nextInt();

        System.out.println("Qual o bairro?");
        String bairro = leitor.next();

        System.out.println("Qual o CEP?");
        String cep = leitor.next();

        System.out.println("O endereço completo do SENAI Criciúma é: " + enderecoRua + ", " + numero + ". " + bairro + " - CEP " + cep);
    }
}
