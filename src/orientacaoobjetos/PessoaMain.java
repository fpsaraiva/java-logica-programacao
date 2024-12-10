package orientacaoobjetos;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa fernando = new Pessoa();
        fernando.nome = "Fernando";
        fernando.idade = 50;
        fernando.email = "fernando@email.com";

        fernando.fazAniversario();
        fernando.imprimeInformacoesPessoa();

        Pessoa joao = new Pessoa();
        joao.nome = "João";
        joao.idade = 30;

        joao.imprimeInformacoesPessoa();
    }
}
