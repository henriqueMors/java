package src;

import java.util.Scanner;

public class EstCond {

    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);

    Double hora;
    
    System.out.println("Informe que horas são:");
    
    hora = sc.nextDouble();
    
     if ( hora < 12 ) {
        System.out.println("Bom dia!");
     } else if ( hora >= 12 && hora < 18) {
        System.out.println("Boa tarde!");
     } else {
        System.out.println("Boa noite!");
     }

    sc.close();

    }
    
}