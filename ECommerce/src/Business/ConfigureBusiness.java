/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.AdminOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.SupplierOrganization;

import Business.Person.Person;

import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Praneet
 */
public class ConfigureBusiness {
        public static Business initialize()
        {
            Business business = Business.getInstane();
           // Customer c1 = business.getCustomerDirectory().addCustomer();
             
           
              AdminOrganization adminOrganization = new AdminOrganization();
                business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
          Person person = new Person();
        //employee.setName("Praneet");
        
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("admin");
        userAccount.setPassword("admin");
        userAccount.setRole(new AdminRole());
        userAccount.setStatus("Active");
        
        person.setFirstName("admin");
           person.setLastName("admin123");
            person.setEmailID("admin.solanki@gmail.com");
            
       userAccount.setPerson(person);
        
        //adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
//              
            
//            Customer c1 = new Customer();
//            CustomerOrganization customerOrganization = new CustomerOrganization();
//           business.getOrganizationDirectory().getOrganizationList().add(customerOrganization);
//           c1.setFirstName("Praneet");
//            c1.setLastName("Solanki");
//            c1.setEmailID("praneet.solanki@gmail.com");
//            
//            UserAccount ua1 = new UserAccount();
//            ua1.setUsername("customer");
//            ua1.setPassword("customer");
//            ua1.setRole(new CustomerRole());
//            ua1.setStatus("Active");
//            ua1.setPerson(c1);
//            customerOrganization.getUserAccountDirectory().getUserAccountList().add(ua1);
////            
////           
////            
////            
////            
////            UserAccount ua2 = business.getUserAccountDirectory().addNewUserAccount();
////            ua2.setUsername("admin");
////            ua2.setPassword("admin");
////            ua2.setRole(UserAccount.ADMIN_ROLE);
////            ua2.setStatus("Active");
////            ua2.setPerson(admin);
//////            
//            Supplier s3 = new Supplier();
//            SupplierOrganization supplierOrganization = new SupplierOrganization();
//                business.getOrganizationDirectory().getOrganizationList().add(supplierOrganization);
//                
//            s3.setFirstName("supplier");
//            s3.setLastName("supplier123");
//            s3.setEmailID("supplier.solanki@gmail.com");
//            
//            UserAccount ua3 = new UserAccount();
//            ua3.setUsername("supplier");
//            ua3.setPassword("supplier");
//            ua3.setRole(new SupplierRole());
//            ua3.setStatus("Active");
//            ua3.setPerson(s3);
//            supplierOrganization.getUserAccountDirectory().getUserAccountList().add(ua3);
            return business;           
            
            
        }

}
