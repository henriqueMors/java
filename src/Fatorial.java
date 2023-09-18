package src;

import java.util.Scanner;

public class Fatorial {
    public static void main (String [] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Digite o numero: ");
         double n = sc.nextDouble();
         double e =1;

         for( int i = 1; i <= n; i++ ) {
            double fatorial = 1;
            for( int j = 2; j <= i; j++ ) {
                fatorial *= j;
            }

            e = e + ( 1 / fatorial);

         }
         System.out.printf("%.4f",e);
         sc.close();
    }
}
