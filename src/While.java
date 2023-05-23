package src;

import java.util.Scanner;

public class While {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); //digita algo para a condicao
        int soma = 0;
        while (x != 0) { // testa a condicao
            soma = soma + x;//ou soma += x para ele somar os digitados
            x = sc.nextInt(); // se a condicao for true, leia novamente

        } //se a condicao for false, ele encerra
        System.out.println(soma);
        sc.close();
    }
}
