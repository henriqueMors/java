package src;

import java.util.Locale; //importa a formacao de determinada regiao

// tudo desenvolvido no programa, vai dentro dessa class
public class Main {
    public static void main(String[] args) {
        // byte / short / int / long / sao formas de declarar uma variavel numerica
        // float / double sao numeros com ponto flutuante
        // boolean / valor verdadeiro
        // char / valor caracter
        int val1 = 10;
        double val2 = 25.3456566;
        double total = val1 + val2;
        System.out.println(total);//System.out.println adiciona uma quebra de linha, System.out.print escreve na mesma linha
        System.out.printf("%.2f%n",total); // printF - formata o numero para quantidade de casas decimais
        Locale.setDefault(Locale.US);  //formatado para ponto e nao virgula
        System.out.printf("%.2f%n",total); //locale deve ficar antes da saida de dados
        /* 
        //CONCATENANDO
        
        System.out.println("Resultado = " + total + " Metros");
        System.out.printf("Resultado = %2.f Metros%n", total); // utilizando printf para formatar com concatenacao

        /*
         * %f = ponto flutuante
         * %d = inteiro
         * %s = string
         * %n = quebra de linha
         */

         String nome = "Maria";
         int idade = 25;
         double renda = 4000.00;
         System.out.printf("%s ganha R$ %.2f tendo apenas %d anos de idade!%n", nome , renda, idade);
    }
}