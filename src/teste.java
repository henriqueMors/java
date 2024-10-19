package src;

import java.util.Scanner;

public class teste {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        
    String nome;
    int resposta;
    
    System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
    System.out.println("O nome que digtou foi " + nome);
    System.out.println("Parabens, vc lembrou como funcionar o scanner!");

    System.out.print("Agora me responda: Raiz quadrada de 9?: ");
        resposta = sc.nextInt();

    if(resposta == 3) {
    System.out.println("Acertou! E lembrou como funciona \"IF/ELSE\" e como se usa caracteres especiais!");
    }
    else {
        System.out.println("Errou a conta, mas, pelo menos, tá sabendo programar alguma coisinha em Java!");
    }

    sc.close();

}
}
