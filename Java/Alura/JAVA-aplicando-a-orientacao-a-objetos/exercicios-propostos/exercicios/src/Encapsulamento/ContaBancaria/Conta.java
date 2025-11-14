package Encapsulamento.ContaBancaria;

// Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

public class Conta {

    private int numeroDaConta;
    private double saldo;
    private String titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {}

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}