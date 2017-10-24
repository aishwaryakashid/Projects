/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class AdminOrganization extends Organization{

  
     public AdminOrganization() {
                 super(Organization.Type.Admin.getValue());

    }
    @Override
    public ArrayList<Role> getSupportedRoles() {
       ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new AdminRole());
       return roles;
    }

   
    
}
