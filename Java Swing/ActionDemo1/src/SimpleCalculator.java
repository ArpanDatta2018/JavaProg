import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myframe extends JFrame implements ActionListener{
    myframe(){
        setTitle("Simple Calculator");
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class SimpleCalc {
    public static void main(String[] args){
        myframe frame=new myframe();
    }
}
