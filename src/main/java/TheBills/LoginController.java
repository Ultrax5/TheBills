package TheBills;

public class LoginController {
    public static LoginController INSTANCE;


    private LoginController(){

    }

    public static LoginController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LoginController();
        }
        return INSTANCE;
    }

    public boolean login (String username, String password) throws FailedLoginException {
        throw new FailedLoginException("Dupsko");
    }



}
