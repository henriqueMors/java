package src;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class DiaDaSemana {
    public static void main (String [] args) {
        //Scanner sc = new Scanner(System.in);

        //System.out.println("Digite o número para informar o dia da semana: ");

        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para informar o dia da semana: ")); //sc.nextInt();

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                //System.out.println("Domingo");
                break;
            case 2:
            JOptionPane.showMessageDialog(null, "Segunda-feira");
                //System.out.println("Segunda-feira");
                break;
            case 3:
            JOptionPane.showMessageDialog(null, "Terça-feira");
                //System.out.println("Terça-feira");
                break;
            case 4:
            JOptionPane.showMessageDialog(null, "Quarta-feira");
                //System.out.println("Quarta-feira");
                break;
            case 5:
            JOptionPane.showMessageDialog(null, "Quinta-feira");
                //System.out.println("Quinta-feira");
                break;
            case 6:
            JOptionPane.showMessageDialog(null, "Sexta-feira");
                //System.out.println("Sexta-feira");
                break;
            case 7:
            JOptionPane.showMessageDialog(null, "Sábado");
                //System.out.println("Sábado");
                break;
            default:
            JOptionPane.showMessageDialog(null, "##ERR404## \n Opção Inválida!");
                //System.out.println("Opção inválida. Tente novamente.");
                break;

        }

        //sc.close();
    }
    
}
