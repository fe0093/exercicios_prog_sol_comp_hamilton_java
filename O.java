package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class O {

	public static void main(String[] args) {
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da primeira prova:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da segunda prova:"));

		float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do primeiro trabalho:"));
		float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do segundo trabalho:"));
		float nota5 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do terceiro trabalho:"));

		float media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

		if (media >= 6 && media <= 10) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		} else if (media >= 4 && media < 6) {
			JOptionPane.showMessageDialog(null, "Exame");
		} else if (media >= 0 && media < 4) {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
	}
}
