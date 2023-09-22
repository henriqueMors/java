package Pensao.Aplicação;

import java.util.Locale;
import java.util.Scanner;

import MediaValorProductVector.aplicação.Produto;
import Pensao.Programa.Programa;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos esudantes receberemos?");
        int n = sc.nextInt();
        Programa [] vect = new Programa [n];

            for (int i=0; i<n; i++) {
            String estudante = sc.nextLine();
            vect[i] = new Programa(estudante);
        }


        sc.close();
    }
}
