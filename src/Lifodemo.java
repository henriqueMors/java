package src;

import java.util.Scanner;
import java.util.Stack;

public class Lifodemo {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os objetos a serem adicionados à pilha (ou 'sair' para encerrar):");
        String input = scanner.nextLine();
        
        // Adicionando objetos à pilha
        while (!input.equalsIgnoreCase("sair")) {
            stack.push(input);
            input = scanner.nextLine();
        }
        
        System.out.println("\nObjetos na pilha (na ordem inversa de adição):");
        // Removendo objetos da pilha na ordem em que foram adicionados
        while (!stack.isEmpty()) {
            Object objeto = stack.pop();
            System.out.println(objeto);

            scanner.close();
        }
    }
}
