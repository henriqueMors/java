package src;

import java.util.Scanner;

public class ExSoma {
    public static void main (String [] args ) {

        Scanner sc = new Scanner(System.in);

        int x1;
        int x2;
        int resultado;
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        resultado = x1 + x2;

        System.out.println("A soma dos resultados é igual à " + resultado);

        sc.close();
    }    
}
