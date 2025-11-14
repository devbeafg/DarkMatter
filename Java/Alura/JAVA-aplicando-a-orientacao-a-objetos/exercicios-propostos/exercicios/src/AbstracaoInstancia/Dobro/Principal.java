package AbstracaoInstancia.Dobro;

// Crie uma classe com um método que recebe um número como parâmetro e retorna o dobro desse número.
public class Principal {
    public static void main(String[] args) {

        Dobro dobro = new Dobro();
        dobro.numero = 4;
        System.out.println("O dobro do número " + dobro.numero + " é " + dobro.dobra() + "!");
    }
}