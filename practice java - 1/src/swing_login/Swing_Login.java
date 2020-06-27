package swing_login;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Swing_Login{
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
        Swing_Login j=new Swing_Login();
        Container cj=j.frame("LOG IN PAGE",Color.GREEN);
        
        JLabel lname1=new JLabel("USERNAME"), lname2=new JLabel("PASSWORD");
        lname1.setBounds(20,50,100,50);
        lname2.setBounds(20,150,100,50);
        cj.add(lname1);
        cj.add(lname2);
        
        JTextField tname=new JTextField ();
        tname.setBounds(150,50,150,50);
        cj.add(tname);
        
        JPasswordField pname=new JPasswordField();
        pname.setEchoChar('*');
        pname.setBounds(150,150,150,50);
        cj.add(pname);
        
        JButton bname=new JButton("LOG IN");
        bname.setBounds(50,250,100,50);
        cj.add(bname);
        
        ActionListener omg=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String name=tname.getText();
                String pass=pname.getText();
                if(name.equals("NISHAN") && pass.equals("nishanpaul")){
                    JOptionPane.showMessageDialog(null,"OK");
                    j.frame("WELCOME !",Color.CYAN);
                }
                else
                    JOptionPane.showMessageDialog(null,"INVALID");
            }
        };
        bname.addActionListener(omg);
    }
}

