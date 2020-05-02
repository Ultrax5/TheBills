package TheBills;


import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window implements ActionListener{
    private JFrame frame= new JFrame("The Bills Reddit");
    private JPanel panel= new JPanel();
    private String name= "";
    private JLabel greeting= new JLabel();
    public Window(){
        greeting.setText("Hello, "+name);
        panel.add(greeting);
        frame.setContentPane(panel);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent u){
        
    }
}