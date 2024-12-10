package orientacaoobjetos;

public class Celular {

    String marca;
    String cor;
    double tamanhoTela;
    double memoria;
    boolean cameraFrontal;
    boolean cameraTraseira;
    int capacidadeBateria;
    double preco;
    boolean cameraLigada;

    public void baterFoto() {
        cameraLigada = true;
    }
}
