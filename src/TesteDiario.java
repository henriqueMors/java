package src;

import java.util.Locale;
import java.util.Scanner;

public class TesteDiario {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 0 para encerrar...");
        int numero = sc.nextInt();
        int soma = 0;


        while (numero != 0) {
            soma += numero;
            System.out.println("Digite o zeroooo!");
            numero = sc.nextInt();
       }

       System.out.println("Aqui a soma dos números antes de digitar o 0: " + soma);

       System.out.println("Certo, programa encerrado!");




       sc.close();

    }

}