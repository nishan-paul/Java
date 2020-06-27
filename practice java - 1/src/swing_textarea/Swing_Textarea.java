package swing_textarea;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Swing_Textarea{
    public Container frame(String s, Color color){
        JFrame j=new JFrame();
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(200,50,500,400);
        j.setTitle(s);
        Container c=j.getContentPane();
        c.setBackground(color);
        c.setLayout(null);
        return c;
    }
    public static void main(String[] args) {
        Swing_Textarea j=new Swing_Textarea();
        Container cj=j.frame("LOG IN PAGE",Color.GREEN);
        
        JTextArea taname=new JTextArea();
        taname.setText(null);
        taname.setBounds(50,50,100,600);
        taname.setLineWrap(true);
        taname.setWrapStyleWord(true);
        cj.add(taname);
    }
}

