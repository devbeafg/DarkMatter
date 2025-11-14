package Encapsulamento.Aluno;

public class Aluno {

    private String nome;
    private double notas;
    private int qtdDeNotas = 0;

    public void calcularMedia(double nota){
        notas += nota;
        qtdDeNotas++;
    }

    public double retornoMedia(){
        return notas/qtdDeNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
}
