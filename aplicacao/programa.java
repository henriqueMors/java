package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.produto;

public class programa {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produto produto = new produto();
        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        
        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Quanto produtos deseja adicionar: ");
        int quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println("Dados atualizados: " + produto);
        /*
        System.out.println();
        System.out.println("Quanto produtos deseja remover: ");
        int quantidade = sc.nextInt();
        produto.removerProduto(quantidade);
        */

        sc.close();
    }
}
