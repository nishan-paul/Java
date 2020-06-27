package swing_multiple_jlabel;
import java.awt.Color;
import java.awt.Container;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Swing_MultipleJlabel extends JFrame {
    private Container c;
    public void thanos(){
        c=this.getContentPane();
        c.setBackground(Color.RED);
        c.setLayout(null);
        JLabel j=new JLabel();
        j.setText("What's UP?");
        j.setBounds(50,20,150,50);
        c.add(j);
        JLabel k=new JLabel();
        k.setText("What's going on?");
        k.setBounds(50,90,150,50);
        c.add(k);
    }
    public static void main(String[] args) {
        Swing_MultipleJlabel f=new Swing_MultipleJlabel();
        f.setVisible(true);
        f.setDefaultCloseOperation(Swing_MultipleJlabel.EXIT_ON_CLOSE);
        f.setBounds(200,50,500,400);
        f.setTitle("Paul");
        f.thanos();
        Class<? extends Swing_MultipleJlabel> x=f.getClass();
        URL y=x.getResource("ayan.jpg");
        ImageIcon icon=new ImageIcon(y);
        f.setIconImage(icon.getImage());
    }
}