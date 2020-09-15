package Primeira_lista_de_exercicios;

import java.util.Objects;
import javax.swing.JOptionPane;

public class Q {

	public static void main(String[] args) {
		Double alt_1 = Double.parseDouble(JOptionPane.showInputDialog("Altura do primeiro cubo: "));
		Double larg_1 = Double.parseDouble(JOptionPane.showInputDialog("Largura do primeiro cubo: "));
		Double comp_1 = Double.parseDouble(JOptionPane.showInputDialog("Comprimento do primeiro cubo: "));
		Double alt_2 = Double.parseDouble(JOptionPane.showInputDialog("Altura do segundo cubo: "));
		Double larg_2 = Double.parseDouble(JOptionPane.showInputDialog("Largura do segundo cubo: "));
		Double comp_2 = Double.parseDouble(JOptionPane.showInputDialog("Comprimento do segundo cubo: "));
		Double alt_3 = Double.parseDouble(JOptionPane.showInputDialog("Altura do terceiro cubo: "));
		Double larg_3 = Double.parseDouble(JOptionPane.showInputDialog("Largura do terceiro cubo: "));
		Double comp_3 = Double.parseDouble(JOptionPane.showInputDialog("Comprimento do terceiro cubo: "));

		Double area_1, area_2, area_3;
		area_1 = alt_1 * larg_1 * comp_1;
		area_2 = alt_2 * larg_2 * comp_2;
		area_3 = alt_3 * larg_3 * comp_3;

		if (Objects.equals(area_1, area_2) && Objects.equals(area_1, area_3)) {
			JOptionPane.showMessageDialog(null, "Todas as caixas tem a mesma area, escolha a ordem.");
		} else {
			if (area_1 > area_2 && area_1 > area_3) {
				if (area_2 > area_3) {
					JOptionPane.showMessageDialog(null, "Coloque na seguinte ordem: Caixa 1 > Caixa 2 > Caixa 3");
				} else {
					JOptionPane.showMessageDialog(null, "Coloque na seguinte ordem: Caixa 1 > Caixa 3 > Caixa 2");
				}
			}
			if (area_2 > area_1 && area_2 > area_3) {
				if (area_1 > area_3) {
					JOptionPane.showMessageDialog(null, "Coloque na seguinte ordem: Caixa 2 > Caixa 1 > Caixa 3");
				} else {
					JOptionPane.showMessageDialog(null, "Coloque na seguinte ordem: Caixa 2 > Caixa 3 > Caixa 1");
				}
			}
			if (area_3 > area_2 && area_3 > area_1) {
				if (area_2 > area_1) {
					JOptionPane.showMessageDialog(null, "Coloque na seguinte ordem: Caixa 3 > Caixa 2 > Caixa 1");
				} else {
					JOptionPane.showMessageDialog(null, "Coloque na seguinte ordem: Caixa 3 > Caixa 1 > Caixa 2");
				}
			}

		}
	}

}
