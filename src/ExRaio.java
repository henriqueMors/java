package src;

import java.util.Locale;
import java.util.Scanner;

public class ExRaio {
    public static void main (String [] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi, area, raio;        
        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * raio * raio;

        System.out.printf("area = %.4f%n", area);

        sc.close();
    }
}