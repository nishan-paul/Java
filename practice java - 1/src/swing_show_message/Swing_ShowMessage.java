package swing_show_message;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Swing_ShowMessage {
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("Batman.png");
        JOptionPane.showMessageDialog(null, "Hey !");
        JOptionPane.showMessageDialog(null, "message", "title",3);
        JOptionPane.showMessageDialog(null, "Hey !", "WHY?", JOptionPane.PLAIN_MESSAGE, icon);
    }
    
}
