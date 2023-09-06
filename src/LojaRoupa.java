package src;

import java.util.Scanner;

public class LojaRoupa {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorItem = 150;

        System.out.printf("\nO valor do ítem é de R$%.2f\n\n", valorItem);
        System.out.println("Informe o método de compra:");
        System.out.println("0. À vista com 10% de desconto.");
        System.out.println("1. Cartão - Informe o número de parcelas.");
        System.out.println("2. Crediário - Informe o número de parcelas.");
        System.out.println("Escolha uma opção: ");
        
        int opcao = sc.nextInt();
        double desconto = 0.0;
        int qtdParcelas = sc.nextInt();
        double valorParcela;
        double valorCrediario;

        switch(opcao) {
            case (0):
                desconto = valorItem * 0.1;
            break;

            case (1):
                valorParcela = valorItem / qtdParcelas;
            break;

            case (2):
                valorCrediario = (valorItem / qtdParcelas) * 0.2;
            break;

            default:
                System.out.println("Opção inválida.");
            break;
        }

        double totalComDesconto = valorItem - desconto;
        System.out.printf("O total à vista desconto de 10%\n R$%.2f", totalComDesconto);

        sc.close();
    }
}
