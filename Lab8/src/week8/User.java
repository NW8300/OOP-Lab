
package week8;

public class User {
    private int user_id;
    private String password;
    private boolean login_status;
    
    User(int user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }
    
    public int user_id() {
        return user_id;
    }
    
    public boolean verify_login(String password) {
        if(password.equals(password)) {
            login_status = true;
        }
        return login_status;
    }
    
}
