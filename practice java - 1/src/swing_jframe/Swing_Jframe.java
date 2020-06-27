package swing_jframe;
import javax.swing.JFrame;
public class Swing_Jframe {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,600);
        f.setTitle("Paul");
        f.setResizable(false);
    }
}
