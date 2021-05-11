
package week8;

import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static Admin admin = new Admin(1, "Admin01", "admin01@xyz.com", "11111");
    public static Customer customer = new Customer (1, "29874");
    
    public static void customer(){
        String update_data;
        
        System.out.println(String.format("User ID: %d", customer.user_id()));
        System.out.println(String.format("Customer Name: %s", customer.customer_name()));
        System.out.println(String.format("Address: %s", customer.address()));
        System.out.println(String.format("Email: %s", customer.email()));
        customer.bill(500000, 15, 10, 25000);
        
        do{
            System.out.println("Update Data [1 / 0] : ");
            update_data = in.nextLine(); 
        }while(!update_data.equalsIgnoreCase("1") && !update_data.equalsIgnoreCase("0"));
        
        if(update_data.equalsIgnoreCase("1")){
            System.out.print("Customer Name: ");
            String name = in.nextLine();
            System.out.print("Address: ");
            String address = in.nextLine();
            System.out.print("Email: " );
            String email = in.nextLine();
            customer.update_profile(name, address, email);
            
            System.out.println("Data Updated!/n");
            System.out.println(String.format("User ID: %d", customer.user_id()));
            System.out.println(String.format("Customer Name: %s", customer.customer_name()));
            System.out.println(String.format("Address: %s", customer.address()));
            System.out.println(String.format("Email: %s", customer.email()));
            customer.bill(500000, 15, 10, 25000);
        }else
            return;
    }
    
    public static void login(int choice){
        System.out.print("Email : ");
        String email = in.nextLine();
        System.out.print("Password : ");
        String password = in.nextLine();

        if(choice == 1) {
            if(admin.email().equals(email) && admin.verify_login(password)) {
                System.out.println("Admin:");
                System.out.println(String.format("User ID : %d", admin.user_id()));
                System.out.println(String.format("Email : %s", admin.email()));
            }
            else {
                System.out.println("Wrong Email or Password!");
            }
        }
        else {
            if(customer.login(email, password)) {
                System.out.println(String.format("Hello %s",customer.email()));
                customer();
            }
            else {
                System.out.println("Wrong Email or Password");
            }
        }
    }  
    
    public static void main(String[] args) {
       customer.register("Susilo Margono", "Jl. Majapahit 12", "SMargono@xyz.com", "4168483552940", "133", "04/22");
       
       int logintype = 0;
       System.out.println("--- LOGIN ---\n");
       System.out.println("Login as a: ");
       System.out.println("(1) Administrator");
       System.out.println("(2) Customer");
       System.out.println(" ");
       
       do {
           System.out.print("Choice : ");
            try{
                logintype = in.nextInt();
                in.nextLine();
            }catch(Exception e){
                in.nextLine();
                continue;
            } 
       }while(logintype < 1 || logintype > 2);
    System.out.println("\n\n\n");
    login(logintype);    
    }
    
}
