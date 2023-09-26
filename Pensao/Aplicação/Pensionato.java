package Pensao.Aplicação;

import java.util.Locale;
import java.util.Scanner;
import Pensao.Programa.Aluguel;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.println("Quantos quartos gostaria de alugar?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Locatário: #" + i);
            System.out.print("Qual nome do locatário #" + i + ":");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Qual email do locatário #" + i + ":");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Aluguel(nome, email);
        }

        System.out.println("Quartos ocupados");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
