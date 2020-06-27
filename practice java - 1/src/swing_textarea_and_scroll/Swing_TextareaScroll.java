package swing_textarea_and_scroll;
import java.awt.Color;
import java.awt.Container;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Swing_TextareaScroll{
    public JTextArea txt(Container cj){
        JTextArea taname=new JTextArea();
        taname.setText(null);
        taname.setBounds(50,50,300,400);
        cj.add(taname);
        return taname;
    }
    public JTextArea txtloop(Container cj){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        JTextArea taname=txt(cj);
        for(int i=0; i<n; i++){
            String s=sc.next();
            taname.append(s+"\n");
        }
        cj.add(taname);
        return taname;
    }
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
        Swing_TextareaScroll j=new Swing_TextareaScroll();
        Container cj=j.frame("TEXTAREA",Color.GREEN);
        JTextArea taname=j.txt(cj);
//        JTextArea taname1=j.txtloop(cj);
        JScrollPane sname=new JScrollPane(taname,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sname.setBounds(50,50,300,400);
        cj.add(sname);
    }
}