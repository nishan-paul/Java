package swing_show_confirm;

import javax.swing.JOptionPane;

public class Swing_ShowConfirm {
    public static void main(String[] args) {
        int n=JOptionPane.showConfirmDialog(null, "a","b",JOptionPane.YES_NO_CANCEL_OPTION);
        switch(n){
            case JOptionPane.YES_OPTION: System.out.println("YES"); break;
            case JOptionPane.NO_OPTION: System.out.println("NO"); break;
            case JOptionPane.CANCEL_OPTION: System.out.println("CANCEL"); break;
            default: break;
        }
    }
    
}