/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author 1895126
 */
public class Customer {
    String firstName,lastName,email;
    int phoneNo;
    int id;
    
    public void setId(int i){
        id=i;
    }
    public void setFirstName(String fn){
       firstName=fn;
    }
    public void setLastName(String ln){
       lastName=ln;
    }
    public void setEmail(String en){
       email=en;
    }
    public void setPhoneNo(int pn){
       phoneNo=pn;
    }
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public int phoneNo(){
        return phoneNo;
    }
    public int getId(){
        return id;
    }
    public void displayCustomer(){
        System.out.println(firstName+"");
        System.out.println(lastName+"");
        System.out.println(email+"");
        System.out.println(phoneNo+"");
        System.out.println(id+"");
    }
}
