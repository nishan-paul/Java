package swing_font;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing_Font extends JFrame {
    private Container c;
    private Font fnt;
    public void thanos(){
        fnt=new Font("Time New Roman",Font.BOLD,14);
        c=this.getContentPane();
        c.setBackground(Color.RED);
        c.setLayout(null);
        JLabel j=new JLabel();
        j.setText("What's UP?");
        j.setFont(fnt);
        j.setForeground(Color.blue);
        j.setOpaque(true);
        j.setBackground(Color.white);
        j.setBounds(50,20,150,50);
        j.setToolTipText("THE DARK KNIGHT");
        c.add(j);
        
        JLabel k=new JLabel();
        k.setText("What's going on?");
        k.setFont(fnt);
        k.setBounds(50,90,150,50);
        k.setToolTipText("IRONMAN");
        c.add(k);
        
        System.out.println( j.getToolTipText()+" "+k.getToolTipText() );
    }
    public static void main(String[] args) {
        Swing_Font f=new Swing_Font();
        f.setVisible(true);
        f.setDefaultCloseOperation(Swing_Font.EXIT_ON_CLOSE);
        f.setBounds(200,50,500,400);
        f.setTitle("Paul");
        f.thanos();
        Class<? extends Swing_Font> x=f.getClass();
        URL y=x.getResource("ayan.jpg");
        ImageIcon icon=new ImageIcon(y);
        f.setIconImage(icon.getImage());
    }
}