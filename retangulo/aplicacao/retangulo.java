package retangulo.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import retangulo.produto.propriedades;

public class retangulo {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        retangulo retan = new retangulo();

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Diite a largura ");
        double largura = sc.nextDouble();
        
        System.out.printf("A área total do retângulo é de %.2f", retan.area());


        sc.close();

    }

}