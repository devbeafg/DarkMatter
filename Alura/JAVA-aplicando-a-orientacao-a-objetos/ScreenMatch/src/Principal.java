// Instância de objeto
public class Principal {
    public static void main(String[] args) {
        // referência do objeto
        Filme filme = new Filme();

        // alimentando atributos do objeto
        filme.nome = "O poderoso chefão";
        filme.anoLancamento = 1970;
        filme.duracaoEmMinutos = 180;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalAvaliacoes());
        System.out.println(filme.pegaMedia());
    }
}