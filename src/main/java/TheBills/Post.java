package TheBills;

import javax.imageio.ImageIO;

public class Post {
    private String user;
    private String text;
    private int downvotes;
    private String title;
    private String id;
    private String url;
    Post(){

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
    public int getDownvotes() {
        return downvotes;
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
    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
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
                "score: "+downvotes+"\n"+
                "url: "+url+"\n";
    }


}