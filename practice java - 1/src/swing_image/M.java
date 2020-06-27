package swing_image;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class M extends JFrame {
    protected Container c;
    public void thanos(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,50,500,400);
        this.setTitle("Paul");
        c=this.getContentPane();
        c.setBackground(Color.RED);
        c.setLayout(null);
    }
    public static void main(String[] args) {
        M j=new M();
        j.thanos();
        ImageIcon icon=new ImageIcon(j.getClass().getResource("Batman.png"));
        JButton bname=new JButton(icon);
        bname.setBounds(50,50,100,50);
        j.c.add(bname);
        JTextField tname=new JTextField ();
        tname.setText("NO IMAGE FROM TEXTFIELD");
        tname.setBounds(50,150,100,50);
        j.c.add(tname);
        JPasswordField pname=new JPasswordField();
        pname.setEchoChar('*');
        pname.setBounds(50,250,100,50);
        j.c.add(pname);
    }
    
}
