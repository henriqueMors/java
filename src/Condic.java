package src;

import java.util.Scanner;

public class Condic {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        
        String nome;
        nome = sc.next();

        if (nome.equals ("henrique")) {
            System.out.println("Bem vindo " + nome + "!");
        } 
        
        else {
            System.out.println("Sai fora, nem te conheço");
        };

        sc.close();
    }
}
