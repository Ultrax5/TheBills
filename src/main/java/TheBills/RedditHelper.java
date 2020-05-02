package TheBills;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.dean.jraw.RedditClient;
import net.dean.jraw.models.PublicContribution;
import net.dean.jraw.models.Submission;
import net.dean.jraw.pagination.*;
import net.dean.jraw.tree.CommentNode;
import net.dean.jraw.tree.RootCommentNode;

/**
 * Class with method to get reddit posts from subreddit
 */
public class RedditHelper {
    public static List<Post> getPosts(String subreddit){
        List<Post> postList = new ArrayList<>();
        RedditClient cli = RedditConnect.getInstance();
        DefaultPaginator<Submission> earthPorn = cli.subreddit(subreddit).posts().build();
        for(Submission s : earthPorn.next()){
            Post p = new Post();
            p.setTitle(s.getTitle());
            p.setUser(s.getAuthor());
            p.setScore(s.getScore());
            p.setText(s.getSelfText());
            p.setId(s.getId());
            p.setUrl(s.getUrl());
            p.setSub(s.getSubreddit());
            (new Thread() {
                public void run() {
                  p.setComments(getCommentsForPost(p.getId()));
                  p.setLoading(true);
                }
               }).start();
            postList.add(p);
        }
        return postList;
    }
    public static List<String> getCommentsForPost(String id){
        RootCommentNode root = RedditConnect.getInstance().submission(id).comments();
        Iterator<CommentNode<PublicContribution<?>>> it = root.walkTree().iterator();
        List<String> cipsko = new ArrayList<>();
        while (it.hasNext()) {
            // A PublicContribution is either a Submission or a Comment.
            PublicContribution<?> thing = it.next().getSubject();
            // Do something with each Submission/Comment
            cipsko.add(thing.getBody());
        }
        return cipsko;
    }
}