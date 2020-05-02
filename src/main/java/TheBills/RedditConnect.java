package TheBills;

import net.dean.jraw.RedditClient;
import net.dean.jraw.http.NetworkAdapter;
import net.dean.jraw.http.OkHttpNetworkAdapter;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.models.Subreddit;
import net.dean.jraw.oauth.Credentials;
import net.dean.jraw.oauth.OAuthHelper;

import java.util.UUID;

public class RedditConnect {
    private static UserAgent userAgent = new UserAgent("bot", "com.example.usefulbot", "v6.9", "TheBills");
    private static RedditClient reddit;
    public static boolean setUp(){
        //"TheBillsV69", "$6qn2vzBFprWV8s"
        Credentials creds = Credentials.userless("18zdrx3lzdrbZw", "vEd1p_OuAF03vHKZIxXuutaUQus", UUID.randomUUID());
        NetworkAdapter adapter = new OkHttpNetworkAdapter(userAgent);
        // Authenticate and get a RedditClient instance
        reddit = OAuthHelper.automatic(adapter, creds);
        return true;
    }

    public static RedditClient getInstance(){
            return reddit;
    }

}