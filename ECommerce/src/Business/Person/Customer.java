/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Praneet
 */
public class Customer extends Person{
    
    static int count = 0;
  
   private String customerID;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
   
    
    public Customer()
    {
     
      
       StringBuffer buff = new StringBuffer();
       buff.append("Cust");
       buff.append(count++);
       customerID = buff.toString();
       
    }

  

  @Override
    public String toString() {
        return customerID;
    }
    
}
