package swing_jframe1;

import java.awt.Color;
import java.awt.Container;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public final class Swing_Jframe1 extends JFrame {
//    Swing_Jframe1(){
//        Container c=this.getContentPane();
//        c.setBackground(Color.RED);
//    }
    public static void main(String[] args) {
        Swing_Jframe1 f=new Swing_Jframe1();
        f.setVisible(true);
        f.setDefaultCloseOperation(Swing_Jframe1.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,600);
        f.setTitle("Paul");
        Class<? extends Swing_Jframe1> x=f.getClass();
        URL y=x.getResource("Batman.png");
        ImageIcon icon=new ImageIcon(y);
        f.setIconImage(icon.getImage());
        
        Container c=f.getContentPane();
        c.setBackground(Color.RED);
    }
}
