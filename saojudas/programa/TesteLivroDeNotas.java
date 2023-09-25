package saojudas.programa;

import java.util.Scanner;

import saojudas.aplicacao.LivroDeNotas;

public class TesteLivroDeNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        String NomeDoCurso = sc.nextLine();
        livroDeNotas.exibirMensagem(NomeDoCurso);

        System.out.println("testando");

        sc.close();
    }
}
