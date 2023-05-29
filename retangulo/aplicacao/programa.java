package retangulo.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import retangulo.produto.retangulo;

public class programa {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        retangulo retan = new retangulo();

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Diite a largura ");
        double largura = sc.nextDouble();
        
        System.out.printf("A área total do retângulo é de %.2f%n", retan.area());
        System.out.printf("O Perímetro total do retângulo é de %.2f%n", retan.perimetro());
        System.out.printf("A  diagonal tem valor de %.2f%n", retan.diagonal());


        sc.close();

    }

}