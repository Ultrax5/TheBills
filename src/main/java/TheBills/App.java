/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TheBills;

import net.dean.jraw.RedditClient;
import net.dean.jraw.http.UserAgent;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        RedditConnect.setUp(null, null);
        Window XD= new Window();
    }
}
