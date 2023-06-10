package GetAndSet;

public class Pessoa {
    private String nome;
    private int idade;

    // Getter para obter o nome
    public String getNome() {
        return nome;
    }

    // Setter para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obter a idade
    public int getIdade() {
        return idade;
    }

    // Setter para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // Definindo os valores usando os setters
        pessoa.setNome("João");
        pessoa.setIdade(25);
        
        // Obtendo os valores usando os getters
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}