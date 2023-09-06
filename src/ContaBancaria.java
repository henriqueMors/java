package src;

import java.util.Scanner;

public class ContaBancaria {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double saldoConta = 3000;
        double valorSaque = 0;

        System.out.println("\nBEM VINDO AO BANCO DO BARRIL!");
        System.out.printf("\nSeu saldo em conta é de R$%.2f\n", saldoConta);
        System.out.print("Informe o valor do saque: R$");
        valorSaque = sc.nextDouble();

        if (valorSaque < saldoConta) {
            saldoConta -= valorSaque;
            System.out.printf("Seu saldo atual é de R$%.2f", saldoConta);
        } else {
            System.out.println("Saldo insuficiente!");
        }
        
        sc.close();
    }
}
