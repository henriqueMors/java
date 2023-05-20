package src;

import java.util.Scanner;

public class EntradaDados {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // para armazenar valores a serem apresentados em tela com dispositivos de entrada
        
        String x;
        x = sc.next(); // vai armazenar o valor em x
        System.out.println("Foi digitado: " + x);

        //sc.close(); // encerra o armazenamento

        //para ler um numero inteiro
        int y; //para valores com numeros com ponto, utilizar o double
        y = sc.nextInt(); // alterar tbm para double

        System.out.println(x + " será camisa " + y);


        //para ler um caractere
        char a;
        a = sc.next().charAt(0);
        System.out.println("e a letra é  " + a);


        sc.close();
    }
}