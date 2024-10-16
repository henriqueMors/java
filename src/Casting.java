package src;

public class Casting {
    public static void main (String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        int X;
        double Y;

        X = 5;
        Y = 2 * X;

        System.out.println(X);
        System.out.println(Y);

        double b, B, h, area;
        b = 6f; // f foi utilizado para apresentar o .0
        B = 8f;
        h = 5f;

        area = (b + B) / 2.0 * h; // .0 como se fosse o f

        System.out.println(area);

        int v, u;
        double resultado;

        v = 5;
        u = 2;

        resultado = (double) v / u; //utilizei o (double) para que fosse mostrado o valor com o resultado correto apos o ponto (isso é o casting)

        System.out.println(resultado);

    }
}