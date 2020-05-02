package TheBills;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.event.ActionListener;

public class LoginUI implements ActionListener  {

    private JFrame loginFrame = new JFrame("Reddit Browser");
    private JPanel mainPanel = new JPanel();
    private JPanel logoPanel = new JPanel();
    private JPanel loginPanel = new JPanel();
    private JPanel passwordPanel = new JPanel();
    private JPanel buttons = new JPanel();
    private JPanel loginHub = new JPanel();
    private BorderLayout mainLayout = new BorderLayout();
    private BoxLayout logoLayout = new BoxLayout(logoPanel, BoxLayout.Y_AXIS);
    private JLabel continueLabel = new JLabel("Continue as:", JLabel.CENTER);
    private JLabel loginLabel = new JLabel("Login:", JLabel.CENTER);
    private JLabel passwordLabel = new JLabel("Password:", JLabel.CENTER);
    private JButton loginButton = new JButton("Login");
    private JButton continueButton;
    private JPasswordField passwordText = new JPasswordField(15);
    private JTextField loginText = new JTextField(15);//
    private LoginController loginController;


    public LoginUI(){
        loginFrame.setSize(new Dimension(100,250));
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setContentPane(mainPanel);
        mainPanel.setBackground(Color.BLACK);
        logoPanel.setBackground(Color.BLACK);
        loginHub.setBackground(Color.BLACK);
        loginPanel.setBackground(Color.BLACK);
        passwordPanel.setBackground(Color.BLACK);
        buttons.setBackground(Color.BLACK);
        mainPanel.setLayout(mainLayout);
        logoPanel.setLayout(logoLayout);
        loginPanel.setLayout(new FlowLayout());
        passwordPanel.setLayout(new FlowLayout());
        loginHub.setLayout(new BoxLayout(loginHub, BoxLayout.Y_AXIS));
        buttons.setLayout(new FlowLayout());
        buttons.add(loginButton);
        loginButton.addActionListener(this);
        loginLabel.setForeground(Color.WHITE);
        passwordLabel.setForeground(Color.WHITE);
        continueLabel.setForeground(Color.WHITE);
        continueLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        loginLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        passwordLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        loginPanel.add(loginLabel);
        passwordPanel.add(passwordLabel);
        loginPanel.add(loginText);
        passwordPanel.add(passwordText);
        loginHub.add(loginPanel);
        loginHub.add(passwordPanel);
        loginHub.add(buttons);
        mainPanel.add(logoPanel, BorderLayout.NORTH);
        mainPanel.add(loginHub, BorderLayout.CENTER);
        mainPanel.setOpaque(true);
        loginFrame.pack();
        loginFrame.setVisible(true);
        loginController = LoginController.getInstance();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loginButton){
            String username = loginText.getText();
            String password = passwordText.getPassword().toString();

            try{
                boolean result = loginController.login(username, password);
            }
            catch(FailedLoginException ex){
                ex.printStackTrace();
            }



        }
        else if(e.getSource()==continueButton){
            loginFrame.dispose();
        }
        loginText.setText("");
        passwordText.setText("");
    }


}
