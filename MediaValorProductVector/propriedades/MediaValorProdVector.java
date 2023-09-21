package MediaValorProductVector.propriedades;

import java.util.Locale;
import java.util.Scanner;

import MediaValorProductVector.aplicação.Produto;

public class MediaValorProdVector {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i=0; i<n; i++) {
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i].getPreco();
        }

        double media = sum / n;

        System.out.println(media);

        sc.close();
    }
}
