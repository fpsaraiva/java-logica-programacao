package orientacaoobjetos;

public class ContatoMain {
    public static void main(String[] args) {
        // Criando objeto da classe Contato
        Contato contato = new Contato();

        // Atribuindo valores aos atributos do objeto
        contato.nome = "José";
        contato.telefone = "555000111";
        contato.telefonePrincipal = true;
        contato.email = "jose@email.com";

        // Exibindo as informações do objeto
        contato.imprimirnfosContato();
    }
}
