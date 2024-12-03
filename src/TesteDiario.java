package src;

import java.util.Locale;
import java.util.Scanner;

public class TesteDiario {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("\n\n##USE PONTOS PARA DEFINIR DECIMAIS##\n\n");
        
        
        System.out.print("Qual produto 01? ");
        String product1 = sc.nextLine();
        System.out.println("Qual produto 02?");
        String product2 = sc.nextLine();

        System.out.println("Qual sua idade?");
        int age = sc.nextInt();
        System.out.println("Qual seu código?");
        int code = sc.nextInt();
        System.out.println("Qual sexo? (M/F)");
        char gender = sc.next().charAt(0);

        System.out.println("Qual valor do produto 01?");
        double price1 = sc.nextDouble();
        System.out.println("Qual valor do produto 02?");
        double price2 = sc.nextDouble();
        System.out.println("Qual peso dos produtos?");
        double measure = sc.nextDouble();
        
        sc.nextLine();

        System.out.println("Qual melhor horário para entregar?");
        System.out.println("M - Manhã\nT - Tarde\nN - Noite");
        String horario = sc.nextLine().toUpperCase();
        String mtn = "";

        switch (horario) {
            case "M":
                mtn = "manhã";
                break;

            case "T":
                mtn = "tarde";
                break;
                
            case "N":
                mtn = "noite";
                break; 
        
            default:
                mtn = "Inválido";
                break;
        }


        System.out.println("Products:");
        System.out.printf("%s, which price is R$ %.2f\n", product1, price1);
        System.out.printf("%s, which price is R$ %.2f\n\n", product2, price2);
        System.out.printf("Será entregue no periodo da %S\n", mtn);

        System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);

        System.out.printf("Measue with eight deciaml places: %.8f\n", measure);
        System.out.printf("Rouded (trhee decimal places): %.3f\n", measure);
        System.out.printf("US decimal point: %.3f\n", measure);


        sc.close();


    }

}