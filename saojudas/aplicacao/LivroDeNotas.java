package saojudas.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class LivroDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("##~ Bem vindo ao livro de notas ~##");

        sc.close();
    }

    public void exibirMensagem(String nomeDoCurso) {
        System.out.printf("Bem vindo ao livro de notas do curso %s", nomeDoCurso);
    }
}
