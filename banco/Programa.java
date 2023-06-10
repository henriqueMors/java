package banco;

import java.util.Locale;
import java.util.Scanner;

public class Programa{
    public static void main (String[]args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int numero = scan.nextInt();
        System.out.print("Entre com o nome do detentor da conta: ");
        String nome = scan.next();
        System.out.print("Existe depósito inicial? (s/n): ");
        char resposta = scan.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Entre com o valor do depósito inicial: ");
            double depostitoInicial = scan.nextDouble();
            conta = new Conta(numero, nome, depostitoInicial);
        } else {
            conta = new Conta(numero, nome);
        }
        System.out.println();
        System.out.println("Dados da conta: " + conta);
        



        scan.close();
    }

}