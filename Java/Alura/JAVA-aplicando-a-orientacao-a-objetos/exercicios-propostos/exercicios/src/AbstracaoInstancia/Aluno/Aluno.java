package AbstracaoInstancia.Aluno;

// Crie uma classe AbstracaoInstancia.Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe AbstracaoInstancia.Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

public class Aluno {
    String nome;
    int idade;

    void fichaAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
