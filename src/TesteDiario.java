package src;

import java.util.Scanner;

// Criar programa onde vc insere o nome, idade e ele te retorna mensagem do dia.
public class TesteDiario {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        nome = sc.next();
        idade = sc.nextInt();

        System.out.printf("Olá %s, você tem %d anos e já está na hora de mudar de ares!%n", nome, idade);
    }
    
}
