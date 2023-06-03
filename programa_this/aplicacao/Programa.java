package programa_this.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import programa_this.entidade.Produto;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        Produto produto = new Produto(nome, quantidade, preco);

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Quanto produtos deseja adicionar: ");
        quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.println("Quanto produtos deseja remover: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
