package programa_this_scrg.entidade;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(){
        //Para utilizar as variaveis locais
    }

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double valorTotalEmEstoque() {
        return this.preco * this.quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Preço: R$" 
                        + String.format("%.2f", this.preco) 
                        + ", Quantidade: " + this.quantidade + ", Valor total em estoque: R$" 
                        + String.format("%.2f", valorTotalEmEstoque());
    }


}
