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

            System.out.printf("Você digitou que seu nome é %s, está correto? ( s | n ) -> ", nome);
            resp = sc.next().charAt(0);
        }
        
        while
        
        (resp == 'n');

        do
        
        {
            System.out.println("Qual sua idade: ");
            idade = sc.nextInt();

            System.out.printf("Sua idade é %d anos? ( s | n ) -> ", idade);
            resp = sc.next().charAt(0);
        }
        
        while
        
        (resp == 'n');

        System.out.printf("Ok, Seu nome é %s e sua idade é de %d anos! %n", nome, idade);

        sc.close();

    }

}