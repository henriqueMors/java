package src;

import java.util.Scanner;

public class LeiaNumero {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);

        //declarando as variaveis
        int inteiro_1, inteiro_2, inteiro_3;
        
        //solicitando os três inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        inteiro_1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        inteiro_2 = sc.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        inteiro_3 = sc.nextInt();

        //realizando operações com as variáveis
        int soma = inteiro_1 + inteiro_2 + inteiro_3;
        int media = soma / 3;
        int produto = inteiro_1 * inteiro_2 * inteiro_3;

        //impressão do resultado das operações
        System.out.println("Atenção para os resultados abaixo:");
        System.out.println("");
        System.out.printf("A soma dos três números é igual à %d\n", soma);
        System.out.printf("A média entre os três números é %d\n", media);
        System.out.printf("O produto multiplcando os três números é %d\n", produto);
        
        //bucando o maior número
        if (inteiro_1 > inteiro_2 && inteiro_1 > inteiro_3) {
            System.out.printf("O número %d é maior.\n", inteiro_1);
        } else if (inteiro_2 > inteiro_3) {
            System.out.printf("O número %d é maior.\n", inteiro_2);
        } else {
            System.out.printf("O número %d é maior.\n", inteiro_3);
        }

        //buscando o menor número
         if (inteiro_1 < inteiro_2 && inteiro_1 < inteiro_3) {
            System.out.printf("O número %d é o menor.\n", inteiro_1);
        } else if (inteiro_2 < inteiro_3) {
            System.out.printf("O número %d é o menor.\n", inteiro_2);
        } else {
            System.out.printf("O número %d é o menor.\n", inteiro_3);
        }

        sc.close();
    }
}