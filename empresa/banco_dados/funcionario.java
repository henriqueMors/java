package empresa.banco_dados;

import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.next();
        System.out.printf("O nome do funcionario: %s%n", nome);



        sc.close();
    }
}
