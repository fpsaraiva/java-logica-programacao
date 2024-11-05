package aula1031;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        int senha;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        senha = teclado.nextInt();

        if(senha == 12345) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
