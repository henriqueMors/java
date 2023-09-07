package src;

import java.util.Scanner;

public class LojaRoupa {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor do item: R$");
        double valorItem = sc.nextDouble();

        System.out.printf("\nO valor do ítem é de R$%.2f\n\n", valorItem);
        System.out.println("Informe o método de pagamento:");
        System.out.println("0. À vista - 10% de desconto.");
        System.out.println("1. Cartão.");
        System.out.println("2. Crediário - Informe o número de parcelas.");
        System.out.println("Escolha uma opção: ");
        
        int opcao = sc.nextInt();

            switch(opcao) {
                case (0):
                    double desconto = valorItem * 0.1;
                    double total = valorItem - desconto;
                    System.out.printf("Você tem um desconto de R$%.2f e sua compra ficou no valor de R$%.2f \nObrigado e volte sempre!", desconto, total);
                break;

                case (1):
                    System.out.println("Informe o número de parcelas: ");
                    int qtdparcela = sc.nextInt();
                    double valorParcela = valorItem / qtdparcela;
                    if (qtdparcela == 0) {
                            System.out.printf("Você optou por 01 vez no cartão. \nO valor ficou em R$%.2f. \nObrigado e volte sempre!", valorItem);
                        } else {
                            System.out.printf("Você optou por %d parcela(s) no cartão. \nO valor de cada parcela ficou em R$%.2f \nObrigado e volte sempre!", qtdparcela, valorParcela);
                    }
                break;

                case (2):
                    System.out.println("escolheu 2");
                break;

                default:
                    System.out.println("Opção inválida.");
                break;

            }

        sc.close();

    }

    
}
