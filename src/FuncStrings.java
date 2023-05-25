package src;

import java.util.Scanner;

public class FuncStrings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite algo...");
        
        String palavra = "abc ABC aBcDeFg   ";
        String maiusc = palavra.toUpperCase();
        String minusc = palavra.toLowerCase();
        String nospc = palavra.trim();
        String sbstr = palavra.substring(2);
        String sbstrif = palavra.substring(2,6);
        String troca = palavra.replace("a","g");
        String trocamais = palavra.replace("abc","gi");
        int j = palavra.lastIndexOf("bc");
        int h = palavra.indexOf("B");

        System.out.print("Aqui foi como voce digitou: ");
        System.out.println(palavra);
        
        System.out.print("toUpperCase: ");
        System.out.println(maiusc);

        System.out.print("toLowerCase: ");
        System.out.println(minusc);

        System.out.print("trim: ");
        System.out.println(nospc);

        System.out.print("Substring: ");
        System.out.println(sbstr);

        System.out.print("Substring com inicio e fim: ");
        System.out.println(sbstrif);
        
        System.out.print("Substituir caractere: ");
        System.out.println(troca);

        System.out.print("Substituir caractere: ");
        System.out.println(trocamais);

        System.out.print("Achar posicao do caractere: ");
        System.out.println(j);

        System.out.print("Achar ultima posicao do caractere: ");
        System.out.println(h);

        String[] vect = palavra.split(" ");
        String plv1 = vect[0];
        String plv2 = vect[1];
        String plv3 = vect[2].toUpperCase();
        System.out.println(plv1);
        System.out.println(plv2);
        System.out.println(plv3);

        sc.close();

    }
}

//toLowerCase(); - minusculos / ToUpperCase(); - maiusculos / trim(); - remover espacos
//substring(inicio); / substring(inicio,fim);
//Replace(char,char); - substituir caractere / Replace(string,string); - substituir palavra
//indexOf(); - buscar posicao / LastIndexOf();
//str.Split(""); - recortar uma string com base no separador