package TheBills;

public class FailedLoginException extends Exception {

    private String message;

    public FailedLoginException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }


}
