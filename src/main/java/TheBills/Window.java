package TheBills;


import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window implements ActionListener{
    private JFrame frame= new JFrame("The Bills Reddit");
    private JPanel panel= new JPanel();
    private BoxLayout layout = new BoxLayout(panel, 1);   
    private String name= "";
    private JLabel greeting= new JLabel();
    private ShowPost curPost;
    private JButton next= new JButton("Next post");
    private JButton logout= new JButton("Log out");

    private ShowPost[] posts;
    public Window(){
        //dodaj wszystkie posty do arraya posts
        panel.setLayout(layout);
        //dodaj post do panelu
        greeting.setText("Hello, "+name);
        panel.add(greeting);
        panel.add(next);
        frame.setContentPane(panel);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        
    }
    public void actionPerformed(ActionEvent u){
        if(u.getSource()==next){
            //wyswietl nowego posta
        }
        else if(u.getSource()==logout){
            frame.dispose();
        }
        
    }
}