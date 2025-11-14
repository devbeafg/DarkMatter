package java_curso;

// Modificadores de acessos
// public -> acessível a todas as classes dentro do projeto
// default -> padrão sem definição de acesso
// private -> acessível somente dentro da própria classe
// protected -> acessível por todas as classes do mesmo pacote


public class Carro {

    String modelo;

    public static void main(String[]args){
        System.out.println("testee");
    }

    // Construtor
    public Carro(String modelo){
        System.out.println("Carro criado!");
        this.modelo = modelo;
    }

    // método
    public void acelerar(){
        System.out.println("Carro acelerado!" + this.modelo);
    }
}
