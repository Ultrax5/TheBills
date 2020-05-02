package TheBills;


import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import TheBills.ShowPost;
/**
 * Class used to show and scroll through posts
 */
public class Window extends JFrame implements ActionListener{
    
    private JPanel panel= new JPanel();
    private BoxLayout layout = new BoxLayout(panel,1);   
    private JLabel greeting= new JLabel("Hello");
    private ShowPost curPost;
    private JButton next= new JButton("Next post");
    private JButton prev= new JButton("Previous post");
    private ArrayList<ShowPost> posts= new ArrayList<ShowPost>();
    private int curPos=0;
    private JTextField input;
    private String subReddit;


    public Window(){
        super("The Bills Reddit");
        List<Post> postsEntity = RedditHelper.getPosts("lancasteruni");
        for(Post post: postsEntity){
            System.out.println(post.toString());
        }
        int j=0;
        if(postsEntity.size()>30){
            j=30;
        }
        else{
            j= postsEntity.size();
        }
        for (int i = 0; i < j; i++) {
            posts.add(new ShowPost(postsEntity.get(i)));
        }
        next.addActionListener(this);
        prev.addActionListener(this);
        this.setContentPane(panel);
        this.setSize(1000,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        draw();
    }
    public void draw(){
        panel.removeAll();
        curPost=posts.get(curPos);
        panel.setLayout(layout);        
        panel.add(greeting);
        panel.add(prev);
        panel.add(curPost);

        panel.add(next);
        prev.setVisible(false);
        if(curPos<posts.size()-1){
            next.setVisible(true);
        }
        else{
            next.setVisible(false);
        }
        if(curPos>0){
            prev.setVisible(true);
        }
        else{
            prev.setVisible(false);
        }
        
        panel.updateUI();
        this.repaint();
        
    }
    public void actionPerformed(ActionEvent u){
        if(u.getSource()==next){
            curPos++;
            curPost=posts.get(curPos);
            draw();
                        
        }
        else if(u.getSource()==prev){
            curPos--;
            curPost=posts.get(curPos); 
            draw();
        }
        
    }
    
}