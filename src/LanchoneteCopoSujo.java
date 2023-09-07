package src;

import java.util.Scanner;

public class LanchoneteCopoSujo {
    
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nBem vindo à Lanchonete Copo Sujo. \nQual seu pedido para hoje?");
        System.out.println("[ 1 ] Misto Quente");
        System.out.println("[ 2 ] Salada Chinesa");
        System.out.println("[ 3 ] Suco de Laranja");
        System.out.println("[ 4 ] Suco de Manga");
        System.out.println("Escolha uma opção: ");

        int escolha = sc.nextInt();

        switch (escolha) {
            case(1):
            System.out.println("Bom apetite! \nVai lhe custar R$5,50");
            break;

            case(2):
            System.out.println("\"Bom apetite! \nVai lhe custar R$10,20");
            break;

            case(3):
            System.out.println("Tenha um excelente drink! \nVai lhe custar R$4,00");
            break;

            case(4):
            System.out.println("Tenha um excelente drink! \nVai lhe custar R$3,50");
            break;

            default:
            System.out.println("Opção Inexistente. Inicie o pedido novamente e defina uma opção correta.");
            break;
        }

        System.out.println("Rede Copo Sujo! Sempre um na esquina de sua casa");


        sc.close();
    }

}
