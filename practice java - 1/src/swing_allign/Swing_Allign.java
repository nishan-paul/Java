package swing_allign;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing_Allign {
    public static void main(String[] args) {
        JFrame j=new JFrame();
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(200,50,500,400);
        j.setTitle("Paul");
        Container c=j.getContentPane();
        c.setBackground(Color.RED);
        c.setLayout(null);
        JTextField k=new JTextField("omg");
        k.setBounds(130,20,150,50);
        k.setBackground(Color.white);
        k.setHorizontalAlignment(JTextField.RIGHT);
        String s=k.getText();
        System.out.println(s);
        c.add(k);
    }
    
}
