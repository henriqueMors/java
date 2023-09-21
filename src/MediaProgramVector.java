package src;

import java.util.Locale;
import java.util.Scanner;

public class MediaProgramVector {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de alunos: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Insira a nota do aluno %d: ", i);
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i];
        }

        double media = sum / n;
        System.out.printf("A média de sua turma foi de %.2f", media);
       sc.close();
    }
}