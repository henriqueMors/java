package src;

import java.util.Scanner;

public class VendaVeiculo {
    public static void main(String[] args) {

        double precoInicial;

        double precoArCondicionado = 1750.00;
        double precoPinturaMetalica = 1800.00;
        double precoVidroEletrico = 800.00;
        double precoDirecaoEletrica = 2000.00;
        double precoCambioAutomatico = 4500.00;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o preço inicial de fábrica do carro: R$");
        precoInicial = sc.nextDouble();
        double precoFinal = precoInicial;
        System.out.printf("\nOk! O valor do veículo é de R$%.2f\n", precoInicial);

        boolean[] opcoesEscolhidas = new boolean[6];

        int opcao;

        do {
            System.out.println("\nQuais itens opcionais serão adicionados?\n");
            System.out.println("COD - ITEM                  - VALOR");
            System.out.println("1   - Ar-condicionado       - R$ 1750,00");
            System.out.println("2   - Pintura Metálica      - R$ 1800,00");
            System.out.println("3   - Vidro Elétrico        - R$ 800,00");
            System.out.println("4   - Direção Elétrica      - R$ 2000,00");
            System.out.println("5   - Câmbio Automático CVT - R$ 4500,00");
            System.out.println("\nDigite o item e tecle ENTER ou digite 0 (ZERO) para encerrar.");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando. Calculando valor final.");
                break;
            } else if (opcao >= 1 && opcao <= 5) {
                if (!opcoesEscolhidas[opcao]) {
                    opcoesEscolhidas[opcao] = true;
                    switch (opcao) {
                case 1:
                    precoFinal += precoArCondicionado;
                    System.out.println(" -> Ar-Condicionado foi adicionado");
                    break;
                case 2:
                    precoFinal += precoPinturaMetalica;
                    System.out.println(" -> Pintura metálica foi adicionada");
                    break;
                case 3:
                    precoFinal += precoVidroEletrico;
                    System.out.println(" -> Vidro Elétrico foi adicionado");
                    break;
                case 4:
                    precoFinal += precoDirecaoEletrica;
                    System.out.println(" -> Direção Elétrica foi adicionado");
                    break;
                case 5:
                    precoFinal += precoCambioAutomatico;
                    System.out.println(" -> Câmbio automático CVT foi adicionado");
                    break;
                    }
                } else {
                    System.out.println("### Este item já foi adicionado ###");
                }
            } else {
                System.out.println("### Opção inválida. Por favor, escolha uma opção válida ###");
            }
        } while (opcao != 0);

        System.out.printf("\nO Preço final do carro então ficou em R$%.2f", precoFinal);

        sc.close();
    }
}
