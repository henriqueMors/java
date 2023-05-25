package src;

import java.util.Scanner;

public class FuncStrings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite algo...");
        
        String palavra = "      abc ABC aBcDeFg   ";
        String maiusc = palavra.toUpperCase();
        String minusc = palavra.toLowerCase();
        String nospc = palavra.trim();

        System.out.print("Aqui foi como voce digitou: ");
        System.out.println(palavra);
        
        System.out.print("toUpperCase: ");
        System.out.println(maiusc);

        System.out.print("toLowerCase: ");
        System.out.println(minusc);

        System.out.print("trim: ");
        System.out.println(nospc);

        sc.close();

    }
}

//toLowerCase(); - minusculos / ToUpperCase(); - maiusculos / trim(); - remover espacos
//substring(inicio); / substring(inicio,fim);
//Replace(char,char); - substituir caractere / Replace(string,string); - substituir palavra
//indexOf(); - buscar posicao / LastIndexOf();
//str.Split(""); - recortar uma string com base no separador