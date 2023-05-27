package src;

import java.util.Scanner;

public class TesteDiario {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        char resp;
        String nome;
        int idade;

        do
        
        {
            System.out.println("Digite seu nome: ");
            nome = sc.next();

            System.out.printf("Você digitou que seu nome é " + nome + ", está correto? ( s | n ) -> ");
            resp = sc.next().charAt(0);
        }
        
        while
        
        (resp == 'n');

        do
        
        {
            System.out.println("Qual sua idade: ");
            idade = sc.nextInt();

            System.out.printf("Sua idade é " + idade + " anos? ( s | n ) -> ");
            resp = sc.next().charAt(0);
        }
        
        while
        
        (resp == 'n');

        System.out.printf("Ok, Seu nome é " + nome + " e sua idade é de " + idade + " anos %n");

        sc.close();

    }

}