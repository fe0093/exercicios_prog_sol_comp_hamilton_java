package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class F {

	public static void main(String[] args) {
	       
        List<Double> list = new ArrayList<>();
        
        
        for (int i = 0; i <= 2; i++) {
            double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um n�mero"));
            list.add(n);
        }
        
        Collections.sort(list);
        
        System.out.println("N�meros ordenados:" + list);
        
    }
}
