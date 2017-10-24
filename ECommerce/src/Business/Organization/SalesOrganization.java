/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesRole;
import Business.Role.ShippingRole;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class SalesOrganization extends Organization {

    public SalesOrganization() {
            super(Organization.Type.Sales.getValue());

    }

  @Override
    public ArrayList<Role> getSupportedRoles() {
          ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new SalesRole());
       return roles; 
        
         }
    
}
