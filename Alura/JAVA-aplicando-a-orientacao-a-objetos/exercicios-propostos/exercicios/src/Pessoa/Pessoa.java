package Pessoa;

// Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.

public class Pessoa {

    String nome, profissao;
    int idade;

    void apresentar(){
        System.out.println("Olá mundo! Eu me chamo " + nome + " tenho " + idade + " anos e sou "  + profissao + "!");
    }
}