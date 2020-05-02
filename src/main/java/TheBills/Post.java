package TheBills;

import java.util.List;

public class Post {
    private String user;
    private String text;
    private int score;
    private String title;
    private String id;
    private String url;
    private String sub;
    private List<String> comments;
    private boolean finishedLoading=false;
    
    Post(){
    }
    public boolean isLoadingFinished() {
        return finishedLoading;
    }
    /**
     * @param url the url to set
     */
    public void setLoading(boolean loading) {
        finishedLoading = loading;
    }
    public List<String> getComments() {
        return comments;
    }
    /**
     * @param url the url to set
     */
    public void setComments(List<String> comments) {
        this.comments = comments;
    }
    public String getSub() {
        return sub;
    }
    /**
     * @param url the url to set
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the downvotes
     */
    public int getScore() {
        return score;
    }
    /**
     * @return the text
     */
    public String getText() {
        return text;
    }/**
     * @return the user
     */
    public String getUser() {
        return user;
    }
    /**
     * @param downvotes the downvotes to set
     */
    public void setScore(int downvotes) {
        this.score = downvotes;
    }
    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "ID: "+id+"\n"+
                "author: "+user+"\n"+
                "text: "+text+"\n"+
                "title: "+title+"\n"+
                "score: "+score+"\n"+
                "url: "+url+"\n";
    }


}