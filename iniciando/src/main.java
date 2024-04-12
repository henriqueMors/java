package iniciando.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// DUAS BARRAS PARA FAZER COMENTARIOS

public class main { /* CLASS */

    public static void main(String[] args) { /* METHOD */
        Scanner scan = new Scanner(System.in); 

    String [][] nomes = {{"ricardo", "paulo"}, {"roberto", "manuel"}, {"jonas", "jose"}};
        //Arrays.sort(nomes);
        //nomes[1] = "joao";
        System.out.println(Arrays.deepToString(nomes));
        //System.out.println(nomes[1]);

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