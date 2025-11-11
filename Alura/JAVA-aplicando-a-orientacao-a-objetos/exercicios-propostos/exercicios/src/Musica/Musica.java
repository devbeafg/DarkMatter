package Musica;

// Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {

    String titulo, artista;
    int anoLancamento, avaliacao, numAvaliacoes;

    void ficha(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calcularMedia(){
        return avaliacao/numAvaliacoes;
    }
}