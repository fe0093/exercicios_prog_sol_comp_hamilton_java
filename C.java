package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class C {

	public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n�mero"));
        
        if(n1 > n2) { 
            JOptionPane.showMessageDialog(null, "O maior n�mero �: " + n1);
        }else{
            JOptionPane.showMessageDialog(null, "O maior n�mero �: " + n2);
        }
    }
    
}
