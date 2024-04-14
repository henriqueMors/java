package iniciandoo.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        product("", 0);
    }

    public static void product (String nome, double valor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a fruta?");
        nome = scan.next().toUpperCase();
        System.out.println("Qual valor?");
        valor = scan.nextDouble();

        System.out.printf("Fruta: %s \nValor: R$%.2f", nome, valor);

        scan.close();

    }

}
