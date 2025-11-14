package Encapsulamento.IdadePessoa;

// Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class Principal {
    public static void main(String[] args) {

        Idade idade = new Idade();

        idade.setIdade(17);
        idade.setNome("Maria");
        idade.verificarIdade();
    }
}
