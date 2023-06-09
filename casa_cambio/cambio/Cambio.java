package casa_cambio.cambio;

import java.util.Locale;
import java.util.Scanner;

import casa_cambio.programa.Dados;

public class Cambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Dados dolar = new Dados();
        // Dados real = new Dados();

        System.out.print("Informe o valor do Dolar: $ ");
        dolar.cotacao = sc.nextDouble();

        System.out.print("Quantos dolares gostaria de comprar: $ ");
        dolar.compra = sc.nextDouble();

        System.out.printf("Ok! O valor informado da cotacao atual esta em $ %.2f%n", dolar.cotacao);
        System.out.printf("E o valor solicitado foi de $ %.2f%n", dolar.compra);
        System.out.printf("O total ficou em R$ %.2f%n", dolar.valor());
        System.out.printf("A taxa terá um valor de $ %.2f%n", dolar.taxa());
        System.out.printf("Valor final: R$ %.2f", dolar.total());

        sc.close();

    }
}
