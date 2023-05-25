package src;

import java.util.Locale;
import java.util.Scanner;

public class MedeTriang {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Insira as medidas do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p =(xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p =(yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        if ( areaX > areaY) {
            System.out.println("A area do triangulo X é maior que a area do triangulo Y");
        } else {
            System.out.println("A area do triangulo Y é maior que a area do triangulo X");
        }

        sc.close();

    }
}
