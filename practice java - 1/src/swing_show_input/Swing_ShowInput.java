package swing_show_input;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Swing_ShowInput {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("Batman.png");
        String s = JOptionPane.showInputDialog(null, "Hey !");
        String t = JOptionPane.showInputDialog(null, "message", "title",3);
        JOptionPane.showInputDialog(null, s+" "+t, "WHY?", JOptionPane.PLAIN_MESSAGE);
    }
    
}
