package Encapsulamento.Livro;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.setTitulo("Titulo 1");
        livro.setAutor("Autor");

        livro.exibirDetalhes();
    }
}
