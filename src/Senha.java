package src;

import java.util.Scanner;

public class Senha {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInsira sua senha:");
        System.out.print("\nInsira o primeiro dígito: ");
        int digito_1 = sc.nextInt();
        System.out.print("Insira o segundo dígito: ");
        int digito_2 = sc.nextInt();
        System.out.print("Insira o terceiro dígito: ");
        int digito_3 = sc.nextInt();
        System.out.print("Insira o quarto dígito: ");
        int digito_4 = sc.nextInt();
        int verificarDigito_2_3 = digito_2 + digito_3;

        if (digito_1 != 5 && digito_1 != 8 || verificarDigito_2_3 != 3 || digito_4 != 1 && digito_4 != 5) {
            System.out.println("\nSenha incorreta! \nTente novamente.");
        } else {
            System.out.println("\nSenha aceita!");
        }

        System.out.println("\nSenha aceita!");

        sc.close();
    }
}
