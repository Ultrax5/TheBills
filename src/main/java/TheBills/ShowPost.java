package TheBills;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.*;
import javax.swing.border.Border;

import TheBills.TTSHelper;

/**
 * Class used to show a post
 */
public class ShowPost extends JPanel implements ActionListener{
    private JLabel user= new JLabel();
    private JLabel like= new JLabel();
    private JLabel title = new JLabel();
    private JLabel subreddit= new JLabel();
    private JButton read= new JButton("Read it for me!");
    private JLabel text = new JLabel();
    private JPanel downPanel = new JPanel();

    public ShowPost(Post post){
        user.setText(post.getUser());
        user.setFont(new Font("Serif", Font.BOLD, 35));
        subreddit.setFont(new Font("Serif", Font.BOLD, 35));
        like.setFont(new Font("Serif", Font.BOLD, 35));
        title.setFont(new Font("Serif", Font.BOLD, 60));
        title.setText("Title: " + post.getTitle());
        title.setAlignmentX(Component.LEFT_ALIGNMENT);
        text.setFont(new Font("Serif", Font.BOLD, 45));
        subreddit.setText("r/" + post.getSub());
        like.setText(post.getScore()+ " likes");
        text.setText(post.getText());
        if(text.getText()==null){
            text.setText("Dupska");
        }
        read.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setBorder(BorderFactory.createTitledBorder("Post"));
        downPanel.setLayout(new FlowLayout());
        user.setBorder(BorderFactory.createTitledBorder("User"));
        subreddit.setBorder(BorderFactory.createTitledBorder("Subreddit"));
        like.setBorder(BorderFactory.createTitledBorder("Score"));
        downPanel.add(user);
        downPanel.add(subreddit);
        downPanel.add(like);
        downPanel.add(read);
        read.addActionListener(this);
        this.setLayout(new GridLayout(3, 1));
        this.add(title);
        this.add(text);
        this.add(downPanel);
    }
    
    public void actionPerformed(ActionEvent u){
        TTSHelper.resolveText("quick");
    }


}