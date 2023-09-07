package src;

import java.util.Scanner;

public class TransportadoraPneuMurcho {

    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPneu Murcho Transportes!");
        System.out.print("\nInsira o valor inicial do frete: R$");
        double valorInicial = sc.nextDouble();

        System.out.println("Qual estado a carga será enviada?");
        System.out.println("[ 1 ] - Bahia");
        System.out.println("[ 2 ] - Minas Gerais");
        System.out.println("[ 3 ] - Mato Grosso");
        System.out.println("[ 4 ] - Santa Catarina");
        System.out.println("[ 5 ] - Rio de Janeiro");

        int estado = sc.nextInt();
        double frete_12 = valorInicial * 0.12;
        double frete_15 = valorInicial * 0.15;
        double freteTotal_12 = ( valorInicial - frete_12 ) + valorInicial;
        double freteTotal_15 = ( valorInicial - frete_15 ) + valorInicial;

        switch (estado) {
            case(1):
                System.out.printf("Você deseja um frete para Bahia e ficou no valor de R$%.2f", freteTotal_15);
            break;

            case(2):
                System.out.printf("Você deseja um frete para Minas Gerais e ficou no valor de R$%.2f", freteTotal_12);
            break;

            case(3):
                System.out.printf("Você deseja um frete para Mato Grosso e ficou no valor de R$%.2f", freteTotal_15);
            break;

            case(4):
                System.out.printf("Você deseja um frete para Santa Catarina e ficou no valor de R$%.2f", freteTotal_15);
            break;

            case(5):
                System.out.printf("Você deseja um frete para Rio de Janeiro e ficou no valor de R$%.2f", freteTotal_12);
            break;

            default:
            System.out.println("Local escolhido é desconhecido, realize a operação novamente");
            break;
        }

        System.out.println("\nObrigado por utilizar nossas serviços. \nPneu Murcho Transportes.");

        sc.close();
    }
    
}
