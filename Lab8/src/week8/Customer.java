
package week8;

import java.util.*;

public class Customer extends User {
    private String customer_name;
    private String address;
    private String email;
    private HashMap<String, String> credit_card_info = new HashMap<>();
    private HashMap<String, Integer> shipping_info = new HashMap<>();
    
    Customer(int user_id, String password){
        super(user_id, password);
    }
    
    public String customer_name(){
        return customer_name;
    }
    
    public String address(){
        return address;
    }
    
    public String email(){
        return email;
    }
    
    public void bill(int subtotal, int discount, int tax, int shipping_fee){
        shipping_info.put("Subtotal", subtotal);
        shipping_info.put("Discount", discount);
        shipping_info.put("Tax", tax);
        shipping_info.put("Shipping Fee", shipping_fee);
        shipping_info.put("Total", calculate_next_bill_amount(subtotal, discount, tax, shipping_fee));
        System.out.println("Shipping info:");
        System.out.println(String.format("Subtotal: %d", subtotal));
        System.out.println(String.format("Discount: %d %", discount));
        System.out.println(String.format("Tax: %d %", tax));
        System.out.println(String.format("Shipping Fee: %d", shipping_fee));
        System.out.println(String.format("Total: %d", shipping_info.get("total") ));
    }
     
    public void register(String customer_name, String address, String email, String card_number, String CVV_number, String exp_date){
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
        credit_card_info.put("Card Number", card_number);
        credit_card_info.put("CVV", CVV_number);
        credit_card_info.put("Exp Date", exp_date);
    }
    
    public boolean login(String email, String password) {
        if(this.email.equals(email)) { 
            return super.verify_login(password);
        }
    return false;
    }
    
    private int calculate_next_bill_amount(int subtotal, int discount, int tax, int shipping_fee) {
        int discounttotal = subtotal - (subtotal * (discount / 100));
        int total = discounttotal + (discounttotal * (tax / 100)) + shipping_fee;
        return total;
    }
    
    public void update_profile(String customer_name, String address, String email) {
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
    }
    
    private void generate_invoice_pdf_version() {
        System.out.println("None");
    }

}
