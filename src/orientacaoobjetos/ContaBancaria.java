package orientacaoobjetos;

public class ContaBancaria {

    String titular;
    String numeroConta;
    double saldo;

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void mostrarInformacoes() {
        System.out.println("===== Informações da Conta =====");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo: R$ " + this.saldo);
    }
}
