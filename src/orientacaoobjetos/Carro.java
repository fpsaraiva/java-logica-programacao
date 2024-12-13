package orientacaoobjetos;

public class Carro {

    String marca;
    String modelo;
    int ano;
    double consumoKm; // Consumo em km/L
    double tanque; // Capacidade de combustível atual
    boolean ligado = false; // Indica se o carro está ligado ou desligado


    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void dirigir(double distancia) {
        if (ligado) {
            double combustivelNecessario = distancia / consumoKm;
            if (combustivelNecessario <= tanque) {
                tanque -= combustivelNecessario;
                System.out.println("Você dirigiu " + distancia + " km. Combustível restante: " + tanque + " L.");
            } else {
                System.out.println("Combustível insuficiente para dirigir " + distancia + " km.");
            }
        } else {
            System.out.println("O carro está desligado. Ligue o carro antes de dirigir.");
        }
    }

    public void abastecer(double quantidade) {
        if (quantidade > 0) {
            tanque += quantidade;
            System.out.println("Você abasteceu " + quantidade + " L. Combustível total: " + tanque + " L.");
        } else {
            System.out.println("Quantidade inválida para abastecimento.");
        }
    }

    public void imprimeInformacoesCarro() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Consumo (km/L): " + this.consumoKm);
        System.out.println("Combustível no tanque (L): " + this.tanque);
        System.out.println("Ligado: " + this.ligado);
    }
}
