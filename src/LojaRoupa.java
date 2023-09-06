package src;

import java.util.Scanner;

public class LojaRoupa {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorItem = 150;

        System.out.printf("\nO valor do ítem é de R$%.2f\n\n", valorItem);

        System.out.println("Informe o método de compra");
        System.out.println("0. À vista com 10% de desconto.");
        System.out.println("1. Parcelado.");
        System.out.println("2. Valor total parcelado.");
        System.out.println("Escolha uma opção: ");



        sc.close();
    }
}
