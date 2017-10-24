/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Praneet
 */
public class SalesPerson extends Person{
          static int count = 0;
  
   private String ID;

    public String getSalesID() {
        return ID;
    }

    public void setSalesID(String ID) {
        this.ID = ID;
    }
   
    
    public SalesPerson()
    {
     
      
       StringBuffer buff = new StringBuffer();
       buff.append("Sales");
       buff.append(count++);
       ID = buff.toString();
       
    }

  

  @Override
    public String toString() {
        return ID;
    } 
}
