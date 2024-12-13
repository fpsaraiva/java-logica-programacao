package orientacaoobjetos;

public class Aluno {

    String nome;
    int idade;
    boolean frequentaLogicaProgramacao;

    public void imprimeInformacoesAluno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Frequenta UC Lógica de Programação: " + this.frequentaLogicaProgramacao);
    }
}
