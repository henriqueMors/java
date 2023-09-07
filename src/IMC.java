package src;

//import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);
       //Locale.setDefault(Locale.US);

        System.out.print("Informe seu peso (Ex.: 70,00): ");
        double peso = sc.nextDouble();
        System.out.print("Informe sua altura (Ex.: 1,80): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura*altura);

        System.out.printf("Seu IMC atual está em %.2f", imc);
        if ( imc < 18.5 ) {
            System.out.println("\nVocê está abaixo do peso ideial.");
        } else if ( imc >= 18.5 && imc <= 24.9 ) {
            System.out.println("\nPeso ideal, muito bem!");
        } else if ( imc >= 25.0 && imc <= 29.9 ) {
            System.out.println("\nSobrepeso, um regime leve pode ajudar.");
        } else if ( imc >= 30.0 && imc <= 34.9 ) {
            System.out.println("\nObesidade leve.");
        } else if ( imc >= 35.0 && imc <= 39.9 ) {
            System.out.println("\nObesidade moderada.");
        } else {
            System.out.println("\nObesidade mórbida.");
        }

        sc.close();
    }
}
