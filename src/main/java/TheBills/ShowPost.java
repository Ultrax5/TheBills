package TheBills;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ShowPost extends JPanel implements ActionListener{
    private JButton user= new JButton();
    private JLabel like= new JLabel();
    private JButton comments= new JButton();
    private JButton subreddit= new JButton();
    private JButton read= new JButton("Read it for me!");
    private String text= "XDDD";

    public ShowPost(String x){
        user.setText("Posted by: ");//+username, +godzina
        subreddit.setText("r/");//+sub
        like.setText(420+ " likes");//liczba lajkow
        comments.setText(69+" comments");//liczba komentow

        this.add(user);
        this.add(subreddit);
        this.add(new JLabel(text+ x));
        this.add(like);
        this.add(comments);
        this.add(read);

    }
    public void actionPerformed(ActionEvent u){
        if(u.getSource()==user){
            //otworz profil usera
        }
        else if(u.getSource()==comments){
            //otworz komenty
        }
        else if(u.getSource()==subreddit){
            //otworz subreddit
        }
        else{
            //przeczytaj wiadomosc byczku
        }
    }


}