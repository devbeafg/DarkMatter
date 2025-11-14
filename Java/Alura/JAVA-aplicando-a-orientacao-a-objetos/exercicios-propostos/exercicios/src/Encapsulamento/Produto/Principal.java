package Encapsulamento.Produto;

public class Principal {
    public static void main(String[] args) {

        Produto produto = new Produto();


        produto.setNome("Extrato de tomate");
        produto.setPreco(5.00);


        System.out.println("Antes: " + produto.getPreco());

        System.out.println("Desconto: " + produto.aplicarDesconto(5));
    }
}