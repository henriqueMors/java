package MediaValorProductVector.aplicação;

public class Produto {
    
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void serNome(String nome) {
        this.nome = nome;
    }

        public double getPreco() {
        return preco;
    }

    public void serPreco(double preco) {
        this.preco = preco;
    }
}
