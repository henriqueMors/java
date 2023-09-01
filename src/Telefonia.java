package src;

import java.util.Scanner;

public class Telefonia {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o total de minutos");
        int minutos = sc.nextInt();
        double valor = 50.0;

        if (minutos > 100) {
            valor = valor + (minutos - 100) * 2.0;
        }       
            System.out.println(valor);

            sc.close();
}
}

