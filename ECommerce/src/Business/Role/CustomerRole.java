/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Person.Customer;
import Business.Person.Person;

import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Praneet
 */
public class CustomerRole extends Role{

//    CustomerOrganization customerOrganization;
//    SupplierOrganization supplierOrganization;
    
   
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
        //Person customer = (Person)userAccount.getPerson();
        
       for(Organization o: business.getOrganizationDirectory().getOrganizationList())
        {
            if(o instanceof SupplierOrganization)
            {//System.out.println(userAccount);
                 return new CustomerWorkAreaJPanel(userProcessContainer, o.getPersonDirectory(), business, (Customer)userAccount.getPerson(), userAccount );
            }
        } 
        return null;
    }    
     //return new CustomerWorkAreaJPanel( userProcessContainer, business, (Customer)userAccount.getPerson(), (SupplierOrganization)organization); 
    

    
    @Override
           public String toString()
            {
    return Role.RoleType.Customer.getValue();
    
            }
}
