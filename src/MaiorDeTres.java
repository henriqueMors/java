package src;

import java.util.Scanner;

public class MaiorDeTres {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número que ocupe o espaço A");
        int a = sc.nextInt();
        System.out.println("Digite um número que ocupe o espaço B");
        int b = sc.nextInt();
        System.out.println("Digite um número que ocupe o espaço C");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d é maior dos três", a);
        } else if  (b > c) {
            System.out.printf("%d é maior dos três", b);
        } else {
            System.out.printf("%d é maior dos três", c);
        }
        sc.close();
    }
    
}
