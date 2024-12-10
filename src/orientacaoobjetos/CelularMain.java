package orientacaoobjetos;

public class CelularMain {
    public static void main(String[] args) {

        //Criado o objeto
        Celular celular1 = new Celular();

        //Definidas as características do objeto
        celular1.marca = "Samsung";
        celular1.tamanhoTela = 7.6;
        celular1.capacidadeBateria = 4400;

        //Exibindo características do objeto Celular
        System.out.println(celular1.marca);
        System.out.println(celular1.tamanhoTela);
        System.out.println(celular1.capacidadeBateria);

        //Criando outro objeto
        Celular celular2 = new Celular();
        celular2.marca = "Apple";

        System.out.println(celular2.marca);
    }
}
