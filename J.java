package Primeira_lista_de_exercicios;

import javax.swing.JOptionPane;

public class J {

	public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de C: "));
  
        int delta = (int) ((Math.pow(b, 2)) - (4*a*c));
        
        if(delta > 0){
            double x1 = ((-b) + Math.sqrt(delta))/ 2*a ;
            double x2 = ((-b) - Math.sqrt(delta))/ 2*a;
            
            System.out.println("Ra�z de x�: " + x1);
            System.out.println("Ra�z de x�: " + x2);
        }else if(delta < 0) {
            System.out.println("A equa��o n�o possui ra�zes reais");
        }else if(delta == 0){
            double x = ((-b) + Math.sqrt(delta))/ 2*a ;
            System.out.println("As ra�zes s�o iguais: " + x);
        }else{
            System.out.println("Ra�z desconhecida");
        }
    }
}
