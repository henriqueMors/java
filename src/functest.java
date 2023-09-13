package src;

import java.util.Scanner;

public class functest {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um numero para multiplicar por 3: ");
        int x = sc.nextInt();

        x = multres(x);

        System.out.println(x);

        sc.close();
    }

    public static int multres(int a) {
        int aux = 3;
        return aux * a;
    }
}
