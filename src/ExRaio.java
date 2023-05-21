package src;

import java.util.Scanner;

public class ExRaio {
    public static void raio (String [] args) {
        Scanner sc = new Scanner(System.in);

        double pi;
        double area;
        double valor;

        pi = 3.14159;
        area = pi * Math.sqrt(pi);
        valor = sc.nextDouble();
        
        sc.close();
    }
}
