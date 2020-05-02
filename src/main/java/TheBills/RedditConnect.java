package TheBills;

import net.dean.jraw.RedditClient;
import net.dean.jraw.http.NetworkAdapter;
import net.dean.jraw.http.OkHttpNetworkAdapter;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.models.Subreddit;
import net.dean.jraw.oauth.Credentials;
import net.dean.jraw.oauth.OAuthHelper;

public class RedditConnect {
    public static UserAgent userAgent = new UserAgent("bot", "com.example.usefulbot", "v6.9", "TheBills");
    public static RedditClient reddit;
    public static void setUp(String username, String password){
        //"TheBillsV69", "$6qn2vzBFprWV8s"
        Credentials credentials = Credentials.script(username, password, "18zdrx3lzdrbZw", "vEd1p_OuAF03vHKZIxXuutaUQus");
        // This is what really sends HTTP requests
        NetworkAdapter adapter = new OkHttpNetworkAdapter(userAgent);
        // Authenticate and get a RedditClient instance
        reddit = OAuthHelper.automatic(adapter, credentials);
        Subreddit sr = reddit.subreddit("RocketLeague").about();
        System.out.println(sr.toString());
    }



}