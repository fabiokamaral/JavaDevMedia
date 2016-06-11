package aula20;

import javax.swing.*;

public class UsandoMath {

    public static void main(String[] args) {

        double cat1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cate1"));
        double cat2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o cate2"));

        double hypot = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)) ;

        double hypotMath = Math.hypot(cat1, cat2);

        System.out.println("Hipotenusa: " + hypot);
        System.out.println("Hipotenusa Classe Math: " + hypotMath);

    }

}
