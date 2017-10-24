/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.Organization.ShippingOrganization;
import Business.Organization.SupplierOrganization;
import java.util.ArrayList;

/**
 *
 * @author Praneet
 */
public class PersonDirectory {
    
  
      private ArrayList<Person> personList;
      
      public PersonDirectory()
      {
      
        personList = new ArrayList<Person>();
        
      }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
      
      public Person addPerson(String firstName, String lastName, String email, Organization o )
      {
           
                    
          if (o instanceof CustomerOrganization)
          {  Customer c = new Customer();
         
            c.setFirstName(firstName);
            c.setLastName(lastName);
            c.setEmailID(email);
          personList.add(c);
          return c;
          }
          
          else if( o instanceof SupplierOrganization)
          {
              Supplier s= new Supplier();
         
            s.setFirstName(firstName);
            s.setLastName(lastName);
            s.setEmailID(email);
          personList.add(s);
          return s;
          }
           else if( o instanceof ShippingOrganization)
          {
              ShippingPerson s= new ShippingPerson();
         
            s.setFirstName(firstName);
            s.setLastName(lastName);
            s.setEmailID(email);
          personList.add(s);
          return s;
          }   
            
           else if( o instanceof SalesOrganization)
          {
              SalesPerson s= new SalesPerson();
         
            s.setFirstName(firstName);
            s.setLastName(lastName);
            s.setEmailID(email);
          personList.add(s);
          return s;
          }  
          
        //  return p;
          
         return null; 
      }
      
      public void removePerson(Person p)
      {
        personList.remove(p);
      }
     
      
      
    
}
