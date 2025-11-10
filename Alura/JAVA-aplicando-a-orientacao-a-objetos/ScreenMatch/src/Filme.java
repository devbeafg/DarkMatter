// Abstração - criação do objeto
public class Filme {
    // atributos do objeto (características)
    String nome;
    int anoLancamento, duracaoEmMinutos;
    private int totalAvaliacoes;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    //métodos (comportamentos)
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}