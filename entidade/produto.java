package entidade;

public class produto {
    
    public String nome;
    public double preco;
    public int quantidade;

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
        return "Nome: " + this.nome + ", Preço: R$" + this.preco + ", Quantidade: " + this.quantidade + "Valor total em estoque: R$" + valorTotalEmEstoque();
    }


}
