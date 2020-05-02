package TheBills;

import java.util.ArrayList;
import java.util.List;

import net.dean.jraw.RedditClient;
import net.dean.jraw.models.Submission;
import net.dean.jraw.pagination.*;

public class RedditHelper {
    public static List<Post> getPosts(String subreddit){
        List<Post> postList = new ArrayList<>();
        RedditClient cli = RedditConnect.getInstance();
        DefaultPaginator<Submission> earthPorn = cli.subreddit(subreddit).posts().build();
        for(Submission s : earthPorn.next()){
            Post p = new Post();
            p.setTitle(s.getTitle());
            p.setUser(s.getAuthor());
            p.setDownvotes(s.getScore());
            p.setText(s.getBody());
            p.setId(s.getUniqueId());
            p.setUrl(s.getUrl());
            postList.add(p);
        }
        return postList;
        // Subreddit sr = cli.subreddit("RocketLeague").about();


        // p.setSyntax(SubmissionSearchPaginator.SearchSyntax.CLOUDSEARCH);
        // Listing<Submission> submissions = p.next();
    }
}