package src;
import java.util.Scanner;

public class JogoDaVelha {
    private char[][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        inicializarTabuleiro();
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAcabou = false;

        while (!jogoAcabou) {
            exibirTabuleiro();

            System.out.println("Jogador " + jogadorAtual + ", é sua vez. Informe a linha (0-2):");
            int linha = scanner.nextInt();
            System.out.println("Agora informe a coluna (0-2):");
            int coluna = scanner.nextInt();

            if (movimentoValido(linha, coluna)) {
                realizarMovimento(linha, coluna);

                if (jogoAcabado()) {
                    exibirTabuleiro();
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoAcabou = true;
                } else if (empate()) {
                    exibirTabuleiro();
                    System.out.println("O jogo terminou em empate!");
                    jogoAcabou = true;
                } else {
                    trocarJogador();
                }
            } else {
                System.out.println("Movimento inválido! Tente novamente.");
            }
        }
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private void exibirTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean movimentoValido(int linha, int coluna) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
            return true;
        }
        return false;
    }

    private void realizarMovimento(int linha, int coluna) {
        tabuleiro[linha][coluna] = jogadorAtual;
    }

    private void trocarJogador() {
        if (jogadorAtual == 'X') {
            jogadorAtual = 'O';
        } else {
            jogadorAtual = 'X';
        }
    }

    private boolean jogoAcabado() {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }

        // Verificar colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
                // Verificar diagonais
                if ((tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
                (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
            return true;
        }

        return false;
    }

    private boolean empate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false; // Ainda existem movimentos possíveis
                }
            }
        }
        return true; // Não existem movimentos possíveis, é um empate
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.jogar();
    }
}

        