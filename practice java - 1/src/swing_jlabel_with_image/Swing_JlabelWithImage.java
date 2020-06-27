package swing_jlabel_with_image;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Swing_JlabelWithImage extends JFrame{
    private Container c;
    private Font fnt;
    public void thanos(){
        fnt=new Font("Time New Roman",Font.BOLD,14);
        c=this.getContentPane();
        c.setBackground(Color.RED);
        c.setLayout(null);
        ImageIcon icon=new ImageIcon( getClass().getResource("Batman.png") );
        JLabel j=new JLabel(icon);
        j.setBounds(50,20,icon.getIconWidth(),icon.getIconHeight());
        j.setToolTipText("THE DARK KNIGHT");
        c.add(j);
        System.out.println( j.getToolTipText() );
    }
    public static void main(String[] args) {
        Swing_JlabelWithImage f=new Swing_JlabelWithImage();
        f.setVisible(true);
        f.setDefaultCloseOperation(Swing_JlabelWithImage.EXIT_ON_CLOSE);
        f.setBounds(200,50,500,400);
        f.setTitle("Paul");
        f.thanos();
        Class<? extends Swing_JlabelWithImage> x=f.getClass();
        URL y=x.getResource("ayan.jpg");
        ImageIcon icon=new ImageIcon(y);
        f.setIconImage(icon.getImage());
    }
}