package src;

import java.util.Scanner;

public class ValorDoVeiculo {
    public static void main(String[] args) {
        
        double precoInicial;
        
        double precoArCondicionado = 1750.00;
        double precoPinturaMetalica = 1800.00;
        double precoVidroEletrico = 800.00;
        double precoDirecaoEletrica = 2000.00;
        double precoCambioAutomatico = 4500.00;
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite o preço inicial de fábrica do carro: R$");
        precoInicial = input.nextDouble();
        System.out.printf("\nOk! O valor do veículo é de R$%.2f\n", precoInicial);

        System.out.println("\nQuais itens opcionais serão adicionados?\n");
        System.out.println("COD - ITEM                  - VALOR");
        System.out.println("1   - Ar-condicionado       - R$ 1750,00");
        System.out.println("2   - Pintura Metálica      - R$ 1800,00");
        System.out.println("3   - Vidro Elétrico        - R$ 800,00");
        System.out.println("4   - Direção Elétrica      - R$ 2000,00");
        System.out.println("5   - Câmbio Automático CVT - R$ 4500,00");
        
        double precoFinal = precoInicial;
        int opcao;
        
        do {
            System.out.println("\nDigite o item e tecle ENTER ou digite 0 (ZERO) para encerrar.");
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    precoFinal += precoArCondicionado;
                    System.out.println(" -> Ar-Condicionado foi adicionado");
                    break;
                case 2:
                    precoFinal += precoPinturaMetalica;
                    System.out.println("Pintura metálica foi adicionada");
                    break;
                case 3:
                    precoFinal += precoVidroEletrico;
                    System.out.println("Vidro Elétrico foi adicionado");
                    break;
                case 4:
                    precoFinal += precoDirecaoEletrica;
                    System.out.println("Direção Elétrica foi adicionado");
                    break;
                case 5:
                    precoFinal += precoCambioAutomatico;
                    System.out.println("Câmbio automático CVT foi adicionado");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
            
        } while (opcao != 0);
        
        System.out.printf("\nO Preço final do carro entao ficou em R$%.2f", precoFinal);
        
        input.close();
    }
}
