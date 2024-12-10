package orientacaoobjetos;

public class Pessoa {

    String nome;
    int idade;
    String email;

    public void imprimeInformacoesPessoa() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.email);
    }

    public void fazAniversario() {
        this.idade = idade + 1;
    }
}
