package Encapsulamento.Produto;

public class Produto {

    private String nome;
    private double preco;

    public double aplicarDesconto(double desconto){
       return preco -= ((desconto / 100)* preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
