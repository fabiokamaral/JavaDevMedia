package aula12;

import javax.swing.*;

public class UsandoArray {

    public static void main(String[] args) {

        int idades[] = new int[10];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade" + (i + 1)));
        }

        int somaIdade = 0;

        for (int idade : idades) {
            somaIdade += idade;
        }
    }

}
