package orientacaoobjetos;

public class Contato {

    String nome;
    String telefone;
    boolean telefonePrincipal;
    String email;

    public void imprimirnfosContato() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Telefone principal: " + this.telefonePrincipal);
        System.out.println("E-mail: " + this.email);
    }
}
