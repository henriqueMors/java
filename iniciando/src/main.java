package iniciando.src;

import java.util.Scanner;

// DUAS BARRAS PARA FAZER COMENTARIOS

public class main { /* CLASS */

    public static void main(String[] args) { /* METHOD */
        Scanner scan = new Scanner(System.in); 

        System.out.printf("Primeiro número: ");
        Double primeiroNum = scan.nextDouble();
        System.out.printf("Segundo número: ");
        Double segundoNum = scan.nextDouble();

        Double resultado = primeiroNum + segundoNum;
        System.out.printf("A soma é: %.1f", resultado);


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