package src;

import java.util.Locale;
import java.util.Scanner;

public class testando {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a;
        char b;


        System.out.printf("Insira o valor: \n");
        a = scan.nextDouble();
        System.out.printf("Insira o caracter: \n");
        b = scan.next().charAt(0);

        System.out.printf("Resultado é  %.1f e o caracter é %s\n", a, b);
        
        /*

        System.out.printf("%.2f%n", b);
        System.out.printf("%.3f%n", c);
        System.out.printf("%.4f%n", d);

         */
        
        scan.close();
       
    }
}
