/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;
import org.jfree.chart.axis.SubCategoryAxis;

/**
 *
 * @author Praneet
 */
public class SupplierOrganization extends Organization{
 
    
     public SupplierOrganization() {
               super(Organization.Type.Supplier.getValue());

//         supplierDirectory = new SupplierDirectory();
    }
    
//   public SupplierDirectory getSupplierDirectory() {
//        return supplierDirectory;
//    }
//
//    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
//        this.supplierDirectory = supplierDirectory;
//    }


    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new SupplierRole() {});
       return roles; 
    } 
    }
    

