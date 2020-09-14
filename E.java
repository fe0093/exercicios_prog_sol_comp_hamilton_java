package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class E {

	 public static void main(String[] args) {
         int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
         
         if(n%2 == 0) {
             JOptionPane.showMessageDialog(null, "O número é par");
         }else {
             JOptionPane.showMessageDialog(null, "O número é ímpar");
         }
    }
}
