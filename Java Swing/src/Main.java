import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,500);
        //frame.setLocation(100,50);
        frame.setBounds(100, 100, 700, 500);
        frame.setTitle("                                                                            ATM                                                            ");
        Container c = frame.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.GREEN);
        //frame.setResizable(false);
        JLabel label=new JLabel("Username");
        label.setBounds(100,50,100,30);

        JLabel label1=new JLabel("Password");
        label1.setBounds(100,100,100,30);

        //ImageIcon image=new ImageIcon("sayan.PNG");
        //JLabel label3=new JLabel(image,JLabel.RIGHT);
        //label3.setBounds(100,50,100,90);

        JTextField t1=new JTextField();
        t1.setBounds(200,50,120,30);

        JPasswordField t2=new JPasswordField();
        t2.setBounds(200,100,120,30);
        t2.setEchoChar('*');

        JButton btn=new JButton("Login");
        btn.setBounds(100,150,100,30);

        Font font=new Font("Arial", Font.BOLD,17);
        label.setFont(font);
        label1.setFont(font);
        btn.setFont(font);

        Cursor cur=new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur);


        c.add(label);
        c.add(label1);
        //c.add(label3);
        c.add(t1);
        c.add(t2);
        c.add(btn);



    }
}