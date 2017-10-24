/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Praneet
 */
public abstract class Role {
     public abstract  JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business);

    public enum RoleType{
        
        Admin("Admin Role"),
        Customer("Customer Role"),
        Supplier("Supplier Role"),
        Shipping("Shipping Role"),
        Sales("Sales Role");
        
        
        private String value;
        
        private RoleType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }
        public String toString()
        {
            return value;
            
        }
        
    }

//    @Override
//    public String toString() {
//        return "Role{" + '}';
//    }

   }
    
