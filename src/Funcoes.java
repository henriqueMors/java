package src;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[]args) { // main é a funcao principal

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = max(n1, n2, n3); //max - é quem aciona  funcao a ser realizada com os paramentros
        showResult(maior); // o valor de "maior" é representado na fucao chamada em outro metodo

        sc.close();
    }

    /*
     uma funcao é montada para suprir uma funcao que nao existe dentro do programa
     Math.srqt já existe, entao nao precisa ser montada
     
     Teste lógico tem varias definicoes, entao pode ser montada uma para poder solucionar
     um teste em especifico 
    */
    public static int max(int x, int y, int z) { // int - para informar que é um valor inteiro / max - para nomear a funcao e utilizar fora / nao esquecer de numear os parametros

        int aux; // é uma variavel local, a ser utilizada pela propria funcao
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux; // return para retornar o valor da variavel local no teste logico / aux é o teste logico
    }
    
    public static void showResult(int value) { // void -> pois é um valor vazio / showResult é o nome da funcao / int value, pq é um valor inteiro
        System.out.println("O maior entre eles é o " + value); // utiliza o value para representar o valor a ser impresso

    }



}


/*
if (n1 > n2 && n1 > n3) {
    System.out.printf("O maior númerio é o %d", n1);
} else if (n2 > n3) {
    System.out.printf("O maior númerio é o %d", n2);
} else {
    System.out.printf("O maior númerio é o %d", n3);
}
*/