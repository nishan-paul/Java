package swing_multiplication;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing_Multiplication{
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
    public JTextArea txt(Container cj){
        JTextArea taname=new JTextArea();
        taname.setText(null);
        taname.setBounds(50,50,300,300);
        cj.add(taname);
        return taname;
    }
    public JTextArea table(Container cj,JTextField tname){
        String t=tname.getText();
        int n=Integer.parseInt(t);
        JTextArea taname=txt(cj);
        for(int i=1; i<=n; i++){
            int s=n*i;
            taname.append(i+" X "+n+" = "+s+"\n");
        }
        cj.add(taname);
        JScrollPane sname=new JScrollPane(taname,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sname.setBounds(50,50,300,300);
        cj.add(sname);
        return taname;
    }
    public JTextField box(Container cj){
        JTextField tname=new JTextField();
        tname.setBounds(50,10,100,30);
        cj.add(tname);
        ActionListener omg=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JTextArea taname=table(cj,tname);
                clean(taname,tname,cj);
            }
        };
        tname.addActionListener(omg);
        return tname;
    }
    public void clean(JTextArea taname,JTextField tname,Container cj){
        JButton bname=new JButton("CLEAR");
        bname.setBounds(50,400,100,100);
        cj.add(bname);
        ActionListener omg=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                taname.setText(null);
                tname.setText(null);
            }
        };
        bname.addActionListener(omg);
    }
    public static void main(String[] args) {
        Swing_Multiplication j=new Swing_Multiplication();
        Container cj=j.frame("TEXTAREA",Color.GREEN);
        j.box(cj);
    }
}
