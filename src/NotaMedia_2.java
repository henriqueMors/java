package src;

import java.util.Scanner;

public class NotaMedia_2 {
    
    public static void main (String [] args) {

        Scanner sc =  new Scanner(System.in);
        
        double nota_1, nota_2, nota_3, nota_4, nota_5, nota_6, nota_7, nota_8, nota_9, nota_10;
        
        System.out.print("Insira a nota do aluno 1: ");
        nota_1 = sc.nextInt();
        System.out.print("Insira a nota do aluno 2: ");
        nota_2 = sc.nextInt();
        System.out.print("Insira a nota do aluno 3: ");
        nota_3 = sc.nextInt();
        System.out.print("Insira a nota do aluno 4: ");
        nota_4 = sc.nextInt();
        System.out.print("Insira a nota do aluno 5: ");
        nota_5 = sc.nextInt();
        System.out.print("Insira a nota do aluno 6: ");
        nota_6 = sc.nextInt();
        System.out.print("Insira a nota do aluno 7: ");
        nota_7 = sc.nextInt();
        System.out.print("Insira a nota do aluno 8: ");
        nota_8 = sc.nextInt();
        System.out.print("Insira a nota do aluno 9: ");
        nota_9 = sc.nextInt();
        System.out.print("Insira a nota do aluno 10: ");
        nota_10 = sc.nextInt();

        double media = ( nota_1 + nota_2 + nota_3 + nota_4 + nota_5 + nota_6 + nota_7 + nota_8 + nota_9 + nota_10 ) / 10;
        
        if (media >= 6) {
            System.out.println("Temos as seguintes notas igual ou maior que 8...");
            if (nota_1 >= 8) {
                System.out.printf("Aluno 1 com nota: %.1f\n", nota_1);
            }
            if (nota_2 >= 8) {
                System.out.printf("Aluno 2 com nota: %.1f\n", nota_2);
            }
            if (nota_3 >= 8) {
                System.out.printf("Aluno 3 com nota: %.1f\n", nota_3);
            }
            if (nota_4 >= 8) {
                System.out.printf("Aluno 4 com nota: %.1f\n", nota_4);
            }
            if (nota_5 >= 8) {
                System.out.printf("Aluno 5 com nota: %.1f\n", nota_5);
            }
            if (nota_6 >= 8) {
                System.out.printf("Aluno 6 com nota: %.1f\n", nota_6);
            }
            if (nota_7 >= 8) {
                System.out.printf("Aluno 7 com nota: %.1f\n", nota_7);
            }
            if (nota_8 >= 8) {
                System.out.printf("Aluno 8 com nota: %.1f\n", nota_8);
            }
            if (nota_9 >= 8) {
                System.out.printf("Aluno 9 com nota: %.1f\n", nota_9);
            }
            if (nota_10 >= 8) {
                System.out.printf("Aluno 10 com nota: %.1f\n", nota_10);
            }
        } else {
            System.out.println("Não foram boas médias, ficamos abaixo de 6 e alguns ficaram no 0...");
            if (nota_1 == 0) {
                System.out.printf("Aluno 1 com nota: %.1f\n", nota_1);
            }
            if (nota_2 == 0) {
                System.out.printf("Aluno 2 com nota: %.1f\n", nota_2);
            }
            if (nota_3 == 0) {
                System.out.printf("Aluno 3 com nota: %.1f\n", nota_3);
            }
            if (nota_4 == 0) {
                System.out.printf("Aluno 4 com nota: %.1f\n", nota_4);
            }
            if (nota_5 == 0) {
                System.out.printf("Aluno 5 com nota: %.1f\n", nota_5);
            }
            if (nota_6 == 0) {
                System.out.printf("Aluno 6 com nota: %.1f\n", nota_6);
            }
            if (nota_7 == 0) {
                System.out.printf("Aluno 7 com nota: %.1f\n", nota_7);
            }
            if (nota_8 == 0) {
                System.out.printf("Aluno 8 com nota: %.1f\n", nota_8);
            }
            if (nota_9 == 0) {
                System.out.printf("Aluno 9 com nota: %.1f\n", nota_9);
            }
            if (nota_10 == 0) {
                System.out.printf("Aluno 10 com nota: %.1f\n", nota_10);
            }
        }
        System.out.printf("A média da turma ficou em %.1f", media);
        sc.close();

    }
}
