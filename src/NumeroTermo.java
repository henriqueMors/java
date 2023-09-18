package src;

import java.util.Scanner;

public class NumeroTermo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos: ");

        int qtd = sc.nextInt();
        System.out.println("x?");
        double x = sc.nextDouble();
        double s = 0;

        for ( int expoente = 2; expoente < qtd; expoente++ ) {
            double dividendo = Math.pow(x, expoente);
            double divisor = 1;
            double termo = (dividendo / divisor);
            //System.out.print("->", x);
            if ( expoente % 2 == 0 ) {
                s = s - termo;
            } else { 
                s = s +  termo;
            }
        }

        sc.close();
    }
}
