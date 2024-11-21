package aula1121;

public class Vetores {
    public static void main(String[] args) {
        //Declaração do array/vetor e atribuição de um tamanho;
        int[] notas = new int[5];
        //int[] maisNotas = {1, 2, 6, 10};

        notas[0] = 1;
        notas[1] = 2;
        notas[2] = 6;
        notas[3] = 10;
        notas[4] = 20;

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);
        }
    }
}
