package src;

import java.util.Scanner;

public class CalculadoraDeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a figura para calcular o volume:\n");
        System.out.println("1. Cone");
        System.out.println("2. Cilindro");
        System.out.println("3. Esfera\n");

        System.out.print("Informe a opção: ");
        int escolha = scanner.nextInt();
        
        double volume = 0.0;

        switch (escolha) {
            case 1:
                volume = calcularVolumeCone();
                break;
            case 2:
                volume = calcularVolumeCilindro();
                break;
            case 3:
                volume = calcularVolumeEsfera();
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (volume > 0) {
            System.out.printf("O volume da figura escolhida é %.2f m^3 \n", volume);
        }

        scanner.close();
    }

    public static double calcularVolumeCone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o raio da base do cone (em metros): ");
        double raioCone = scanner.nextDouble();
        System.out.print("Digite a altura do cone (em metros): ");
        double alturaCone = scanner.nextDouble();
        scanner.close();
        return (1.0 / 3.0) * Math.PI * Math.pow(raioCone, 2) * alturaCone;
    }

    public static double calcularVolumeCilindro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o raio da base do cilindro (em metros): ");
        double raioCilindro = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro (em metros): ");
        double alturaCilindro = scanner.nextDouble();
        scanner.close();
        return Math.PI * Math.pow(raioCilindro, 2) * alturaCilindro;
    }

    public static double calcularVolumeEsfera() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o raio da esfera (em metros): ");
        double raioEsfera = scanner.nextDouble();
        scanner.close();
        return (4.0 / 3.0) * Math.PI * Math.pow(raioEsfera, 3);
    }
}
