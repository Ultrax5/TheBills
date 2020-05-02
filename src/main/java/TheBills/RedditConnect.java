package TheBills;

import net.dean.jraw.RedditClient;
import net.dean.jraw.http.NetworkAdapter;
import net.dean.jraw.http.OkHttpNetworkAdapter;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.models.Subreddit;
import net.dean.jraw.oauth.Credentials;
import net.dean.jraw.oauth.OAuthHelper;

public class RedditConnect {
    private static UserAgent userAgent = new UserAgent("bot", "com.example.usefulbot", "v6.9", "TheBills");
    private static RedditClient reddit;
    public static boolean setUp(String username, String password){
        //"TheBillsV69", "$6qn2vzBFprWV8s"
        Credentials credentials = null;
        try {
            credentials = Credentials.script(username, password, "18zdrx3lzdrbZw", "vEd1p_OuAF03vHKZIxXuutaUQus");
        } catch (Exception e) {
        }
        if(credentials!=null){
            NetworkAdapter adapter = new OkHttpNetworkAdapter(userAgent);
            // Authenticate and get a RedditClient instance
            reddit = OAuthHelper.automatic(adapter, credentials);
            Subreddit sr = reddit.subreddit("RocketLeague").about();
            System.out.println(sr.toString());
            return true;
        } else {
            System.out.println("ZLE HASLO XD");
            return false;
        }
        // This is what really sends HTTP requests
        
    }
    public static RedditClient getInstance(){
            return reddit;
    }

}