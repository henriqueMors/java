package src;

import java.util.Scanner;

public class RaizQuad {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double y = sc.nextDouble();
        double x  = Math.sqrt(y);

        System.out.printf("%.2f", x);
        sc.close();
    }
}
