
package week8;

public class Admin extends User {
    private String admin_name;
    private String email;
    
    Admin(int user_id, String admin_name, String email, String password) {
        super(user_id, password);
        this.admin_name = admin_name;
        this.email = email;
    }
    
    public void update_catalog() {
        System.out.println("There is no catalog");
    }
    
    public String email() {
        return email;
    }
}
