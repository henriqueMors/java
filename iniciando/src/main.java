package iniciando.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// DUAS BARRAS PARA FAZER COMENTARIOS

public class main { /* CLASS */

    public static void main(String[] args) { /* METHOD */
        Scanner scan = new Scanner(System.in); 

        

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