package AbstracaoInstancia.Carro;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "HB20";
        carro.cor = "Branco";
        carro.ano = 2015;
        carro.fichaTecnica();

        carro.idadeCarro(2025);
        System.out.println("Idade: " + carro.idadeAtual() + " anos");
    }
}