/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.Role.ShippingRole;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class ShippingOrganization extends Organization{

    public ShippingOrganization() {
            super(Organization.Type.Shipping.getValue());

    }

  @Override
    public ArrayList<Role> getSupportedRoles() {
          ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new ShippingRole());
       return roles; 
        
         }
}
