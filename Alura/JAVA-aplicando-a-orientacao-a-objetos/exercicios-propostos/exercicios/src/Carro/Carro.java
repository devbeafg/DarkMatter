package Carro;

// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {

    String modelo, cor;
    int ano, idade;

    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    void idadeCarro(int anoAtual){
        idade = anoAtual - ano;
    }

    int idadeAtual(){
        return idade;
    }
}