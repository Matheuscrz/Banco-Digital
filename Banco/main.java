package Java.Banco;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String pessoa = JOptionPane.showInputDialog("Cliente:");
        Cliente cliente = new Cliente();
        cliente.setNome(pessoa);
        System.out.println("test");
    }
}