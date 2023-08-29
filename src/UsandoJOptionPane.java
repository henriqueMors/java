package src;

import javax.swing.JOptionPane;

public class UsandoJOptionPane {

    public static void main (String [] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        JOptionPane.showMessageDialog(null, "Pense num nome feio: " + nome);
    }
    
}
