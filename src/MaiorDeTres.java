package src;

import java.util.Scanner;

public class MaiorDeTres {
    public void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma sequência de três números");
        int a = sc.nextInt();
        int b = sc.nextInt();
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
