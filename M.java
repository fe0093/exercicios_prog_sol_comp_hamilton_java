package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class M {

	public static void main(String[] args) {

		int cc = Integer.parseInt(JOptionPane.showInputDialog("Informe as cilindradas do veículo"));

		if (cc >= 0 && cc <= 120) {
			JOptionPane.showMessageDialog(null, "Sub Production");
		} else if (cc >= 121 && cc <= 240) {
			JOptionPane.showMessageDialog(null, "Production");
		} else if (cc >= 240) {
			JOptionPane.showMessageDialog(null, "Super Production");
		}
	}
}
