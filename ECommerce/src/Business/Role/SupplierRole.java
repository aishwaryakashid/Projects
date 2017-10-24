/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Supplier;
import Business.Person.Person;
import Business.Person.Supplier;

import Business.UserAccount.UserAccount;
import UserInterface.SupplierRole.SupplierWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Praneet
 */
public class SupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
    
      //Supplier supplier = (Supplier)userAccount.getPerson();
        return new SupplierWorkAreaJPanel( userProcessContainer, Business.getInstane(), (Supplier)userAccount.getPerson(), userAccount); 
    }
    @Override
           public String toString()
            {
    return Role.RoleType.Supplier.getValue();
    
            }
}
