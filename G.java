package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class G {

	public static void main(String[] args) {
        int operation = Integer.parseInt(JOptionPane.showInputDialog("1. Adi��o" + "\n" +
                "2. Subtra��o" + "\n" +
                "3. Divis�o" + "\n" +
                "4. Multiplica��o"));
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo n�mero"));
        
        if(operation == 1) {
            Double result = n1 + n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 2){
            Double result = n1 - n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 3){
            Double result = n1 / n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 4) {
            Double result = n1 * n2;
            JOptionPane.showMessageDialog(null, result);
        }else {
            JOptionPane.showMessageDialog(null, "Op��o inv�lida");
        }
    }
    
}
