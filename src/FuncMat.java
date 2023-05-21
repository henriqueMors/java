package src;

public class FuncMat {
    public static void main(String[] args) {
        double x = 9.0;
        double y = 4.0;
        double z = 5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        // Bhaskara
        double delta;

        delta = Math.pow(B, 2.0) - 4 * A * C;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double x1 = -B / (2 * A);
            System.out.println("A equação possui uma raiz real: x = " + x1);
        } else {
            if (A == 0) {
                System.out.println("Não é possível calcular as raízes: A não pode ser zero.");
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double denominator = 2 * A;
                double x1 = (-B + sqrtDelta) / denominator;
                double x2 = (-B - sqrtDelta) / denominator;
                System.out.println("A equação possui duas raízes reais: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}