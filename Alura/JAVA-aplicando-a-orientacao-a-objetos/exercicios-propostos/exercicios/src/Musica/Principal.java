package Musica;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "Bem Querer";
        musica.artista = "João Batista";
        musica.anoLancamento = 2010;
        musica.ficha();

        musica.avaliar(8);
        musica.avaliar(5);
        musica.avaliar(10);
        System.out.println("Avaliação: " + musica.calcularMedia());
        System.out.println("Quantidade de avaliações: " + musica.numAvaliacoes);
    }
}