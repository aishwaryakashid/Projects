/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.MasterOrderCatalog;
import Business.Person.PersonDirectory;

import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public  abstract class Organization {
    
    private String name;
   private int organizationID;
    private static int counter;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;

    

    
   // SupplierDirectory supplierDirectory;
    
    
    
    
    
    public Organization(String name)
    {
        
                this.name = name;
       personDirectory = new PersonDirectory();
       userAccountDirectory= new UserAccountDirectory();
       organizationID = counter;
       ++counter;
       workQueue = new WorkQueue();
              
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    
    public enum Type{
        Admin("Admin Organization") {
         //   @Override
            public Organization createOrganization() {
                return new AdminOrganization();
            }
        }, Supplier("Supplier Organization"){
            public Organization createOrganization() {
                return new SupplierOrganization();
            }
        }, Customer("Customer Organization"){
            public Organization createOrganization() {
                return new CustomerOrganization();
            }
                  
        },
        Shipping("Shipping Organization"){
            public Organization createOrganization() {
                return new ShippingOrganization();
            }
        },      
        Sales("Sales Organization"){
           public Organization createOrganization() {
                return new SalesOrganization();
            } 
        }
        
        ;
        
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        public Organization createOrganization(Type t) {
            return t.createOrganization(t);
        }
    }

    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    
 

   
   
   
  

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
    
 
     public abstract ArrayList<Role> getSupportedRoles();
    

    @Override
    public String toString() {
        return name ;
    }
}