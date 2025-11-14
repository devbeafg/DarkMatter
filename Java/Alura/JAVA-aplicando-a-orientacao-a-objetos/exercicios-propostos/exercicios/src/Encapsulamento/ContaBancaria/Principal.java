package Encapsulamento.ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumeroDaConta(123);
        conta.setSaldo(1000);
        conta.setTitular("João");

        System.out.println("Número da Conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.getTitular());

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}