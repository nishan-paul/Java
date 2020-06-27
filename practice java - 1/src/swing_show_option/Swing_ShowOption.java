package swing_show_option;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Swing_ShowOption {
    public static void main(String[] args) {
        String[] u={"buet","kuet","ruet","cuet"};
        ImageIcon icon=new ImageIcon("batman.pcg");
        int n=JOptionPane.showOptionDialog(null, "CLICK", "WHICH ONE?", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, icon, u, u[1]);
        System.out.println(n+1);
    }
}
