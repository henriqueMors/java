package empresa.banco_dados;

import java.util.Locale;
import java.util.Scanner;

import empresa.programa.salario;

public class funcionario {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        salario sal = new salario();

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.printf("Digite o salário de %s: ", nome);
        sal.sal_bruto = sc.nextDouble();

        System.out.printf("A taxa de %s é de: ", nome, sal.desconto());


        sc.close();
    }
}
