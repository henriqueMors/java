package GetAndSet;

import java.util.Scanner;

public class Pessoa {
    private String nome;  // Atributo privado para armazenar o nome
    private int idade;    // Atributo privado para armazenar a idade

    public String getNome() {  // Getter para obter o nome
        return nome;  // Retorna o valor armazenado no atributo nome
    }

    public void setNome(String nome) {  // Setter para definir o nome
        this.nome = nome;  // Atribui o valor passado como argumento ao atributo nome
    }

    public int getIdade() {  // Getter para obter a idade
        return idade;  // Retorna o valor armazenado no atributo idade
    }

    public void setIdade(int idade) {  // Setter para definir a idade
        this.idade = idade;  // Atribui o valor passado como argumento ao atributo idade
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();  // Criação de um objeto da classe Pessoa

        Scanner scanner = new Scanner(System.in);  // Criação de um objeto da classe Scanner para ler as entradas do usuário

        // Solicitando e lendo o nome do usuário
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();  // Lê uma linha de texto digitada pelo usuário

        // Solicitando e lendo a idade do usuário
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();  // Lê um número inteiro digitado pelo usuário

        // Definindo os valores usando os setters
        pessoa.setNome(nome);  // Define o nome da pessoa com o valor lido
        pessoa.setIdade(idade);  // Define a idade da pessoa com o valor lido

        // Obtendo os valores usando os getters
        System.out.println("Nome: " + pessoa.getNome());  // Imprime o nome da pessoa
        System.out.println("Idade: " + pessoa.getIdade());  // Imprime a idade da pessoa

        scanner.close();  // Fecha o Scanner
    }
}
