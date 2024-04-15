package conta.programa;

import java.util.Scanner;
import conta.metodos.Conta;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Conta c001 = new Conta();
        System.out.print("Nome do cliente: ");
        c001.primeiroNome = scan.nextLine();
        System.out.print("Numero de cadastro: ");
        c001.cadastro = scan.nextInt();

        c001.novaConta();

        System.out.println();
        scan.close();
    }
}
