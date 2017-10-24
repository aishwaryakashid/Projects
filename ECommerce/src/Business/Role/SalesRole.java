/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.Organization;
import Business.Person.Supplier;
import Business.UserAccount.UserAccount;
import UserInterface.SalesRole.SalesWorkAreaJPanel;
import UserInterface.SupplierRole.SupplierWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Praneet
 */
public class SalesRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
   // Supplier supplier = (Supplier)userAccount.getPerson();
        return new SalesWorkAreaJPanel( userProcessContainer, userAccount, organization, Business.getInstane()); 
    }
    @Override
           public String toString()
            {
    return Role.RoleType.Sales.getValue();
    
            }
}
