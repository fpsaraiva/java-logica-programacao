package orientacaoobjetos;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Carlos da Silva";
        conta.numeroConta = "12345-6";
        conta.saldo = 1000.00;

        conta.mostrarInformacoes();
        conta.depositar(500);
        conta.mostrarSaldo();
        conta.sacar(200);
        conta.sacar(1500);
        conta.sacar(-50);
        conta.mostrarSaldo();
        conta.mostrarInformacoes();
    }
}
