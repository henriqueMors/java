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

        System.out.printf("Digite a porcentagem de desconto: ");
        sal.porcentagem = sc.nextDouble();

        System.out.printf("A taxa de " + nome + " é de %.2eerrf", sal.desconto());

        System.out.printf("O salário liquido de " + nome + " é de %.2e", sal.sal_liq());


        sc.close();
    }
}
