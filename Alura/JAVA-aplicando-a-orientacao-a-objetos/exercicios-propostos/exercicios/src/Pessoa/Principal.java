package Pessoa;

// Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "Rute";
        pessoa01.idade = 19;
        pessoa01.profissao = "Escritora";

        Pessoa pessoa02 = new Pessoa();
        pessoa02.nome = "Ruiz";
        pessoa02.idade = 26;
        pessoa02.profissao = "Barbeiro";

        pessoa01.apresentar();
        pessoa02.apresentar();
    }
}