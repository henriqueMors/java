package src;

import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite uma sequência de três números...");
        System.out.print("\nPrimeiro número: ");
        int num_1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num_2 = sc.nextInt();
        System.out.print("Terceiro número: ");
        int num_3 = sc.nextInt();

        System.out.println("Ok! Sua sequência em ordem crescente será...");

        if (num_1 == num_2 && num_1 == num_3 || num_2 == num_3) {
            System.out.println("##ERR0## \nNão utilize números repetidos.");

        } else if (num_1 < num_2 && num_1 < num_3 && num_2 < num_3) {
            System.out.printf("%d %d %d", num_1, num_2, num_3);

        } else if (num_1 < num_2 && num_1 < num_3 && num_3 < num_2) {
            System.out.printf("%d %d %d", num_1, num_3, num_2);

        } else if (num_2 < num_1 && num_2 < num_3 && num_1 < num_3) {
            System.out.printf("%d %d %d", num_2, num_1, num_3);

        } else if (num_2 < num_1 && num_2 < num_3 && num_3 < num_1) {
            System.out.printf("%d %d %d", num_2, num_3, num_1);

        } else if (num_3 < num_1 && num_3 < num_2 && num_2 < num_1) {
            System.out.printf("%d %d %d", num_3, num_2, num_1);

        } else if (num_3 < num_1 && num_3 < num_2 && num_1 < num_2) {
            System.out.printf("%d %d %d", num_3, num_1, num_2);
        }


        sc.close();
    }
    
}

/* 
123
132
213
231
321
312
 */