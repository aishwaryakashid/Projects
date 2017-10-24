/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class CustomerOrganization extends Organization{

   
    public CustomerOrganization()
    {
     
         super(Organization.Type.Customer.getValue());
     
    }
    
//      public CustomerDirectory getCustomerDirectory() {
//        return customerDirectory;
//    }
//
//    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
//        this.customerDirectory = customerDirectory;
//    }
//    
    @Override
    public ArrayList<Role> getSupportedRoles() {
          ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new CustomerRole());
       return roles; 
        
         }

  
}
