package TheBills;

import javax.swing.*;

public class Window{
    private JFrame frame= new JFrame("The Bills Reddit");
    public Window(){
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}