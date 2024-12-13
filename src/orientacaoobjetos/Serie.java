package orientacaoobjetos;

public class Serie {

    String nome;
    int anoLancamento;
    int numeroTemporadas;
    double somatorioNotas;

    public void imprimeInformacoesSerie() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Número de Temporadas: " + numeroTemporadas);
        System.out.println("Somatório das Notas: " + somatorioNotas);
    }

    public void avaliarNota(double nota) {
        somatorioNotas = somatorioNotas + nota;
    }
}
