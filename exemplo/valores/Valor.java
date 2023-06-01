package exemplo.valores;

import java.util.Scanner;
import exemplo.somar.Programa;

public class Valor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Programa prog = new Programa();

        System.out.println("Digite o primeiro número: ");
        prog.valor1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        prog.valor2 = sc.nextInt();

        System.out.printf("A soma dos dois algarismo é igual a: " + prog.soma());
        System.out.print(prog.parOuImpar());

        sc.close();

    }
}
