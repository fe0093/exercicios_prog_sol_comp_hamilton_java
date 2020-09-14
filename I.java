package Primeira_lista_de_exercicios;

import Primeira_lista_de_exercicios.Triangle;
import Primeira_lista_de_exercicios.Triangle.Triangles;

import javax.swing.JOptionPane;

public class I {

public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado C: "));
            
        Triangles triangle = new Triangles(a,b,c);
        System.out.println(triangle.isTriangle());
        System.out.println(triangle.typeTriangle());
    }
}
