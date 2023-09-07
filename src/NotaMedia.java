package src;

import java.util.Scanner;

public class NotaMedia {

    public static void main ( String [] args ) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Insira a primeira nota: ");
            double primeiraNota = sc.nextDouble();
            System.out.print("Insira a segunda nota: ");
            double segundaNota = sc.nextDouble();

            double media = (primeiraNota + segundaNota) / 2;
            System.out.println("Sua média foi de " + media + ".");

                if ( media > 10 ) {
                    System.out.println("Impossível, a nota máxima é 10, dirija-se até a direção escolar!");
                } else if ( media >= 9 ) {
                    System.out.println("Parabéns, continue assim!");
                } else if ( media >= 7 && media < 9 ) {
                    System.out.println("Aprovado!");
                } else if ( media >= 6 && media < 7 ) {
                    System.out.println("Aprovado no limite, estude um pouco mais.");
                } else if ( media >= 2 && media < 6 ) {
                    System.out.println("Não está aprovado, mas ainda pode fazer a segunda época.");
                } else {
                    System.out.println("Reprovado, nos vemos semestre que vem.");
                }

        sc.close();

    }
    
}
