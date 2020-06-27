package swing_action1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        JButton bname=new JButton();
        bname.setText("Google");
        bname.setBounds(50,50,100,50);
        j.c.add(bname);
        ActionListener omg=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JTextField lname=new JTextField("CUET/CSE/16");
                lname.setBounds(50,150,100,50);
                j.c.add(lname);
                JOptionPane.showMessageDialog(null,"OK");
            }
        };
        bname.addActionListener(omg);
    }
    
}
