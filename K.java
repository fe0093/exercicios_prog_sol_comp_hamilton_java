package Primeira_lista_de_exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class K {

public static void main(String[] args) throws ParseException {
        
        JOptionPane.showMessageDialog(null, "As datas devem ser informadas no formato: dd-MM-yyyy");
        String a = JOptionPane.showInputDialog(null, "Informe a primeira data");
        String b = JOptionPane.showInputDialog(null, "Informe a seguna data");
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
           Date date1 = sdf.parse(a);
           Date date2 = sdf.parse(b); 
           
           if(date1.compareTo(date2) < 0){
               JOptionPane.showMessageDialog(null, date1);
           }else if(date1.compareTo(date2) > 0) {
               JOptionPane.showMessageDialog(null, date2);
           }else {
               JOptionPane.showMessageDialog(null, "As datas são iguais");
           }
    }
}
