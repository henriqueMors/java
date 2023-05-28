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
        
        System.out.println(produto);

        sc.close();
    }
}
