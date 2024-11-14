package aula1111;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        //Criando objeto para leiura
        Scanner t = new Scanner(System.in);
        //Mensagem para orientar usuário
        System.out.print("Por favor, digite a sua idade: ");
        //Leitura de dados usuário
        int idade = t.nextInt();

        //Estrutura de decisão - IF/ELSE
        //Se idade menor que 16
        if(idade < 16) {
            System.out.println("Ainda não é possível tirar o título de eleitor");
        } else if (idade < 18) {
            System.out.println("Voto facultativo");
            //Idade entre 18 e 70
        } else if (idade >= 18 && idade <=70) {
            System.out.println("Voto obrigatório");
            //Maior que 70
        } else {
            System.out.println("Voto facultativo");
        }
        //Fecha o leitor de dados
        t.close();
    }
}
