package Encapsulamento.Aluno;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Flávia");
        aluno.calcularMedia(6.7);
        aluno.calcularMedia(2.7);
        aluno.calcularMedia(7);

        System.out.println("Média final: " + aluno.retornoMedia());
    }
}