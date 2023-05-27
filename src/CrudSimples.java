package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudSimples {

    static List<String> listaNomes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Criar");
            System.out.println("2. Ler");
            System.out.println("3. Atualizar");
            System.out.println("4. Deletar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criar();
                    break;
                case 2:
                    ler();
                    break;
                case 3:
                    atualizar();
                    break;
                case 4:
                    deletar();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static void criar() {
        System.out.print("Digite o nome: ");
        String nome = scanner.next();
        listaNomes.add(nome);
        System.out.println("Registro criado com sucesso!");
    }

    public static void ler() {
        if (listaNomes.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            System.out.println("Registros encontrados:");
            for (String nome : listaNomes) {
                System.out.println(nome);
            }
        }
    }

    public static void atualizar() {
        if (listaNomes.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            System.out.print("Digite o índice do registro a ser atualizado: ");
            int indice = scanner.nextInt();
            if (indice < 0 || indice >= listaNomes.size()) {
                System.out.println("Índice inválido.");
            } else {
                System.out.print("Digite o novo nome: ");
                String novoNome = scanner.next();
                listaNomes.set(indice, novoNome);
                System.out.println("Registro atualizado com sucesso!");
            }
        }
    }

    public static void deletar() {
        if (listaNomes.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            System.out.print("Digite o índice do registro a ser deletado: ");
            int indice = scanner.nextInt();
            if (indice < 0 || indice >= listaNomes.size()) {
                System.out.println("Índice inválido.");
            } else {
                listaNomes.remove(indice);
                System.out.println("Registro deletado com sucesso!");
            }
        }
    }
}
