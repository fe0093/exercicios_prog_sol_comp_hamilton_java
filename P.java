package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class P {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Informe o nome do funcion�rio: ");
		int tempoDeCasa = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de casa:"));
		char sexo = JOptionPane.showInputDialog("Informe o sexo: ").charAt(0);
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio"));

		if (tempoDeCasa > 15 && sexo == 'H') {
			double bonus = 0.20;
			double salarioNatal = (salario * bonus) + salario;
			JOptionPane.showMessageDialog(null, "Sal�rio com b�nus de natal: R$" + salarioNatal);
		} else if (tempoDeCasa > 10 && sexo == 'M') {
			double bonus = 0.25;
			double salarioNatal = (salario * bonus) + salario;
			JOptionPane.showMessageDialog(null, "Sal�rio com b�nus de natal: R$" + salarioNatal);
		} else {
			double salarioNatal = salario + 200;
			JOptionPane.showMessageDialog(null, "Sal�rio com b�nus de natal: R$" + salarioNatal);
		}
	}
}
