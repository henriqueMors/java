package iniciando.src;

import java.util.Arrays;
import java.util.Scanner;

// DUAS BARRAS PARA FAZER COMENTARIOS

public class main { /* CLASS */

    public static void main(String[] args) { /* METHOD */
        Scanner scan = new Scanner(System.in);

        String palavra = "HELLO WORLD";

        for (int i = 0 ; i <= palavra.length() - 1 ; i++)
            System.out.print(palavra.charAt(i) + " ");

        /*

        //WHILE

        int valor = 0;

        while ( valor <= 100 ) {
            System.out.print(valor + " ");
            valor = valor + 2;
        }

        */

        /*
        for (int a = 0 ; a < 2 ; a++)
            for (int b = 0 ; b < 2 ; b++)
                for (int c = 0 ; c < 2 ; c++)
                    for (int d = 0 ; d < 2 ; d++)
                        for (int e = 0 ; e < 2 ; e++)
                            for (int f = 0 ; f < 2 ; f++)
                                for (int g = 0 ; g < 2 ; g++)
                                    for (int h = 0 ; h < 2 ; h++)

                    System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);

        */

        /*
        //FOR
        System.out.print("Quantos \"ola mundo\" gostaria de imprimir? ");
        int qtd1 = scan.nextInt();
        for (int qtd2 = 1 ; qtd2 <= qtd1; qtd2++) {
            System.out.println("ola mundo");
        }
        */

        /*
        //SWITCH

        System.out.println("-- NOMES --");
        System.out.println("A -> Alicia \nB -> Sophia \nC -> Isabela \nD -> Maya \nE -> Beubinha");

        System.out.print("De quem gostaria de ver os dados? \nDigite a letra: ");
        String digitado = scan.nextLine().toUpperCase();

        switch (digitado) {
            case "A":
            System.out.println("Escolheu Alicia. Nasceu em 15/11/08.");
            break;
            case "B":
            System.out.println("Escolheu Sophia. Nasceu em 04/08/18.");
            break;
            case "C":
            System.out.println("Escolheu Isabela. Nasceu em 10/07/20.");
            break;
            case "D":
            System.out.println("Escolheu Maya. Nasceu em 10/01/22.");
            break;
            case "E":
            System.out.println("EScolheu Beubinha. Nasceu em 26/05/87.");
            break;
            default:
            System.out.println("Nao existe essa escolha!");
            break;
        }

        */



        /*

        //PROJETO DIA 3

        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();
        
        if (numero >=0 && numero <= 9) 
        {
            System.out.println("Este numero tem 1 digito.");
        }
        else if (numero >=10 && numero <= 99) 
        {
            System.out.println("Este numero tem 2 digitos.");
        }
        else if (numero >=100 && numero <= 999) 
        {
            System.out.println("Este numero tem 3 digitos.");
        }
        else if (numero >=1000 && numero <= 9999) 
        {
            System.out.println("Este numero tem 4 digitos.");
        }
        else if (numero >=10000) 
        {
            System.out.println("Este numero tem 5 ou mais digitos.");
        }
        else
        {
            System.out.println("Voce nao digitou algo valido");
        }


        */

        /*
        //PROJETO DIA 2

        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456};

    String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
    };      

            System.out.println("Array 1 original = " + Arrays.toString(my_array1));
            Arrays.sort(my_array1);
            System.out.println("Array 1 em ordem = " + Arrays.toString(my_array1));

            System.out.println("Array 2 original = " + Arrays.toString(my_array2));
            Arrays.sort(my_array2);
            System.out.println("Array 2 em ordem = " + Arrays.toString(my_array2));
            
        */


        /*

        //double valorAleatorio = Math.round(scan.nextDouble()); // ROUND ARRERONRA CONFOME SI - CEIL ARREDONDA SEMPRE PARA CIMA - FLOOR ARREDONDA SEMPRE PARA BAIXO
        int value = (int)Math.round(Math.random() * 200); // * 200 POIS EH O NUMERO QUE TRARA DE ALEATORIO
        //GOOGLE: JAVA MATH CLASS
        //System.out.println(valorAleatorio);
        System.out.println(value);

        */

        /*
        //TRANFORMANDO UMA STRING EM INT
        
        String valorUm = scan.nextLine();
        int valorDois = Integer.parseInt(valorUm) + 2;
        System.out.println(valorDois);
        */

        /*

    String [][] nomes = {{"ricardo", "paulo"}, {"roberto", "manuel"}, {"jonas", "jose"}};
        //Arrays.sort(nomes);
        //nomes[1] = "joao";
        System.out.println(Arrays.deepToString(nomes));
        //System.out.println(nomes[1]);

        */


        /* ARRAYS COM INT
        
        int[] valores = {30, 20, 60, 90,10, 80};
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length);
        */

        /* PROJETO SOMANDO NUMEROS 
        
        System.out.printf("Primeiro número: ");
        Double primeiroNum = scan.nextDouble();
        System.out.printf("Segundo número: ");
        Double segundoNum = scan.nextDouble();

        Double resultado = primeiroNum + segundoNum;
        System.out.printf("A soma é: %.1f", resultado);

        */

        /*
        
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        String firstName = "\n henrique"; // \n PARA PULAR A LINHA E \t PARA FUNÇÃO DE TAB
        
        
        System.out.println(firstName.toUpperCase()); // STATEMENT 
        System.out.printf("Sua idade é de: " + idade);
        
        */

        scan.close();
    }


}