package orientacaoobjetos;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Carlos";
        aluno1.idade = 40;
        aluno1.frequentaLogicaProgramacao = false;

        aluno2.nome = "Joana";
        aluno2.idade = 25;
        aluno2.frequentaLogicaProgramacao = true;

        aluno1.imprimeInformacoesAluno();
        aluno2.imprimeInformacoesAluno();
    }
}
