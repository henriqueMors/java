package src;

import java.util.Scanner;

public class Desconto {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double preco;
        double desconto = 0.0;
        double total;

        preco = sc.nextDouble();

        if (preco < 20.0 ) {
            desconto = preco * 0.1;
        } 
        else if (preco >= 20 && preco <= 100) {
            desconto = preco * 0.5;
        } 
        else if (preco > 100) {
            desconto = preco * 0.10;
        }

        total = preco - desconto;

        System.out.printf("O valor total é: R$ %.2f %n", preco);
        System.out.printf("O desconto será de: R$ %.2f %n", desconto);
        System.out.printf("O valor atualizado é de: R$ %.2f %n", total);

        sc.close();
    }
}
