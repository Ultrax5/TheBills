package TheBills;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.*;
import javax.swing.border.Border;

public class ShowPost extends JPanel implements ActionListener{
    private JLabel user= new JLabel();
    private JLabel like= new JLabel();
    private JLabel title = new JLabel();
    private JButton comments= new JButton();
    private JLabel subreddit= new JLabel();
    private JButton read= new JButton("Read it for me!");
    private JLabel text = new JLabel();
    private JPanel downPanel = new JPanel();

    public ShowPost(Post post){
        user.setText(post.getUser());//+username, +godzina
        user.setFont(new Font("Serif", Font.BOLD, 35));
        subreddit.setFont(new Font("Serif", Font.BOLD, 35));
        like.setFont(new Font("Serif", Font.BOLD, 35));
        title.setFont(new Font("Serif", Font.BOLD, 60));
        title.setText("Title: " + post.getTitle());
        title.setAlignmentX(Component.LEFT_ALIGNMENT);
        text.setFont(new Font("Serif", Font.BOLD, 45));
        subreddit.setText("r/" + post.getSub());//+sub
        like.setText(post.getScore()+ " likes");//liczba lajkow
        text.setText(post.getText());
        if(text.getText()==null){
            text.setText("Dupska");
        }
        read.setAlignmentX(Component.CENTER_ALIGNMENT);
        //comments.setText(post.getComSize()+" comments");//liczba komentow
        this.setBorder(BorderFactory.createTitledBorder("Post"));
        downPanel.setLayout(new FlowLayout());
        user.setBorder(BorderFactory.createTitledBorder("User"));
        subreddit.setBorder(BorderFactory.createTitledBorder("Subreddit"));
        like.setBorder(BorderFactory.createTitledBorder("Score"));
        downPanel.add(user);
        downPanel.add(subreddit);
        downPanel.add(like);
        downPanel.add(read);
        this.setLayout(new GridLayout(3, 1));
        this.add(title);
        this.add(text);
        this.add(downPanel);
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