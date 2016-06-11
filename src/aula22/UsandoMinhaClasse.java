package aula22;


import javax.swing.*;

public class UsandoMinhaClasse {

    public static void main(String[] args) {

        String resposta = "";

        //entrada
        String op = JOptionPane.showInputDialog(null, "Baskara(B) ou Fatorial(F)?");

        //processamento
        if (op.equals("B")) {

            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o termo A."));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o termo B."));
            double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o termo C."));

            resposta = FuncoesMatematicas.getBaskara(a, b, c);

        } else if (op.equals("F")) {

            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero para o Fatorial."));

            int result = FuncoesMatematicas.getFatorial(num);

            resposta = String.valueOf(result);

        }


        //saída

        JOptionPane.showMessageDialog(null, resposta);

    }

}
