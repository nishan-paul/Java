package swing_cursor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Swing_Cursor extends JFrame {
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
        Swing_Cursor j=new Swing_Cursor();
        j.thanos();
        JButton bname=new JButton("BUTTON");
        bname.setBounds(50,50,100,50);
        Cursor csr=new Cursor(Cursor.MOVE_CURSOR);
        bname.setCursor(csr);
        j.c.add(bname);
        JTextField tname=new JTextField ();
        tname.setText("NO IMAGE FROM TEXTFIELD");
        tname.setBounds(50,150,100,50);
        Cursor csr1=new Cursor(Cursor.TEXT_CURSOR);
        tname.setCursor(csr1);
        j.c.add(tname);
        JPasswordField pname=new JPasswordField("PASSWORD");
        pname.setEchoChar('*');
        pname.setBounds(50,250,100,50);
        Cursor csr2=new Cursor(Cursor.HAND_CURSOR);
        pname.setCursor(csr2);
        j.c.add(pname);
    }
    
}
