package src;

import java.util.Locale;
import java.util.Scanner;

public class TesteDiario {

    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
        System.out.print("Digite o valor em celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5 + 32;

        System.out.printf("Em F 'e considerada a temperatura de %.1f%n", F);
        System.out.print("Deseja repetir? (s/n) ");
        resp = sc.next().charAt(0);
        } while (resp != 'n');

        System.out.println("Ok! See you!");
        sc.close();

    }

}