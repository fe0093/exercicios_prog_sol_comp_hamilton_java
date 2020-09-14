package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class N {

	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade do nadador:"));

		if (idade > 0 && idade <= 10) {
			JOptionPane.showMessageDialog(null, "Infatil");
		} else if (idade >= 11 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Junior");
		} else if (idade >= 15 && idade <= 20) {
			JOptionPane.showMessageDialog(null, "Adolescente");
		} else if (idade >= 21 && idade <= 35) {
			JOptionPane.showMessageDialog(null, "Jovem");
		} else {
			JOptionPane.showMessageDialog(null, "Master");
		}

	}
}
