/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Order.MasterOrderCatalog;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author Praneet
 */
public class Business {
  private static Business business;
//    private SupplierDirectory supplierDirectory;
   private MasterOrderCatalog masterOrderCatalog;
//    private CustomerDirectory customerDirectory;
//    private UserAccountDirectory userAccountDirectory;
     private OrganizationDirectory organizationDirectory;
    
    public Business()
    {
        organizationDirectory = new OrganizationDirectory();
//        supplierDirectory = new SupplierDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
//        customerDirectory = new CustomerDirectory();
//        userAccountDirectory= new UserAccountDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }


     
    
     public static Business getInstane()
    {
        if(business == null)
        {
            business = new Business();
        }
        return business;
    }
    
    
    
}
