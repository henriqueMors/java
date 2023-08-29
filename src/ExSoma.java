package src;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ExSoma {
    public static void main (String [] args ) {

        Scanner sc = new Scanner(System.in);

        int x1;
        int x2;
        int resultado;
        System.out.println("O primeiro número é... ");
        x1 = sc.nextInt();
        System.out.println("O segundo número é... ");
        x2 = sc.nextInt();
        resultado = x1 + x2;

        System.out.println("A soma dos resultados é igual à " + resultado);

        JOptionPane.showMessageDialog(null, "Tu aprendeu java pra somar dois algarismos????");

        sc.close();
    }    
}
