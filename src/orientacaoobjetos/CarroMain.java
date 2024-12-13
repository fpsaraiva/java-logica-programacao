package orientacaoobjetos;

public class CarroMain {
    public static void main(String[] args) {
        Carro celta = new Carro();

        celta.marca = "GM";
        celta.modelo = "Celta";
        celta.ano = 2012;
        celta.consumoKm = 10.0;
        celta.tanque = 40.0;
        celta.ligado = false;

        celta.ligar();
        celta.dirigir(50);
        celta.abastecer(20);
        celta.dirigir(200);
        celta.desligar();
        celta.imprimeInformacoesCarro();
    }
}
