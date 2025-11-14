import br.com.alura.screenmatch.modelos.Filme;

// Instância de objeto
public class Principal {
    public static void main(String[] args) {
        // referência do objeto
        Filme filme = new Filme();

        // alimentando atributos do objeto
        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " +filme.pegaMedia());
    }
}