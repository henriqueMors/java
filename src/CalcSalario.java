package src;

import java.util.Scanner;

public class CalcSalario {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVamos aos cálculos do que te faz chorar todo mês!");
        System.out.print("\nQual o valor da hora trabalhada: R$");
        double valorHora = sc.nextDouble();

        System.out.println("\nOk...");
        System.out.print("Agora nos diga quantas horas trabalhou esse mês: ");
        int horaTrabalhada = sc.nextInt();

        //calculos da angustia
        double salarioBruto = valorHora * horaTrabalhada;
        double comissao = salarioBruto * 0.3;
        double imposto = salarioBruto * 0.12;
        double salarioLiquido = salarioBruto - imposto;

        if ( horaTrabalhada >= 120 ) {
            double salario_01 = salarioLiquido + comissao;
            System.out.printf("\nPor ter trabalhado igual à um condenado, \nseu salario este mês tem um bônus de R$%.2f, \nchegando ao total de R$%.2f.", comissao, salario_01);
        } else {
            System.out.printf("Trabalhou igual à um condenado, \nmas não muito... \nentão esse mês seu salário será de R$%.2f", salarioLiquido);
        }

        sc.close();
    }
}
