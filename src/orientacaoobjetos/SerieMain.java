package orientacaoobjetos;

public class SerieMain {
    public static void main(String[] args) {
        Serie simpsons = new Serie();
        Serie supernatural = new Serie();

        simpsons.nome = "Simpsons";
        simpsons.anoLancamento = 1989;
        simpsons.numeroTemporadas = 35;
        simpsons.somatorioNotas = 0;

        simpsons.avaliarNota(9.5);
        simpsons.avaliarNota(10);
        simpsons.imprimeInformacoesSerie();

        supernatural.nome = "Supernatural";
        supernatural.anoLancamento = 2005;
        supernatural.numeroTemporadas = 15;
        supernatural.somatorioNotas = 0;

        supernatural.avaliarNota(9.0);
        supernatural.imprimeInformacoesSerie();
    }
}
